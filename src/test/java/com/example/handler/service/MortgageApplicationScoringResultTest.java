package com.example.handler.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Description;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MortgageApplicationScoringResultTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private TerroristRegistry terroristRegistry;

    @Test
    @Description("Проверка успешной заявки")
    public void testSuccessStatusApplication() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .post("/mortgages")
                .content("{ " +
                        "\"surname\":\"Дорогая\", " +
                        "\"firstName\": \"Диана\", " +
                        "\"salary\": 50000, " +
                        "\"creditPeriod\": 24, " +
                        "\"creditAmount\": 200000" +
                        "}")
                .contentType("application/json")
        ).andExpect(status().isOk())
        .andExpect(content().string(containsString("SUCCESS")));
    }

    @Test
    @Description("Проверка заглушки. Наш клиент - террорист")
    public void testTerroristMockito() throws Exception {
        Mockito.when(terroristRegistry.checkIsTerrorist()).thenReturn(true);
        mockMvc.perform(MockMvcRequestBuilders
                .post("/mortgages")
                .content("{ " +
                        "\"surname\":\"Верная\", " +
                        "\"firstName\": \"Вера\", " +
                        "\"salary\": 50000, " +
                        "\"creditPeriod\": 24, " +
                        "\"creditAmount\": 200000" +
                        "}")
                .contentType("application/json")
        ).andExpect(status().isOk())
        .andExpect(content().string(containsString("DECLINE")));
    }

    @Test
    @Description("Проверка отказа. Наш клиент имеет мало денег и должник")
    public void testDeclineStatusApplication() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .post("/mortgages")
                .content("{ " +
                        "\"surname\":\"Дмитриев\", " +
                        "\"firstName\": \"Дмитрий\", " +
                        "\"salary\": 50000, " +
                        "\"creditPeriod\": 2, " +
                        "\"creditAmount\": 200000" +
                        "}")
                .contentType("application/json")
        ).andExpect(status().isOk())
                .andExpect(content().string(containsString("DECLINE"))) ;
    }

    @Test
    @Transactional
    @Description("Проверка вывода всех успешных заявок")
    public void testGettingSuccess() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/mortgages/successful"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("SUCCESS")));
    }

    @Test
    @Transactional
    @Description("Проверка вывода всех неуспешных заявок")
    public void testGettingDecline() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/mortgages/declined"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("DECLINE")));
        mockMvc.perform(MockMvcRequestBuilders.get("/mortgages/declined"));
    }
}