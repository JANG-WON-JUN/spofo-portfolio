//package spofo.tradelog.controller;
//
//import static org.mockito.BDDMockito.given;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static spofo.global.component.utils.CommonUtils.getBD;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.time.LocalDateTime;
//import java.util.List;
//import org.junit.jupiter.api.DisplayName;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
//import org.springframework.test.web.servlet.MockMvc;
//import spofo.tradelog.controller.response.TradeLogResponse;
//import spofo.tradelog.domain.enums.TradeType;
//import spofo.tradelog.service.TradeLogServiceImpl;
//
//@WebMvcTest(TradeLogController.class)
//@MockBean(JpaMetamodelMappingContext.class)
//@DisplayName("종목 이력 컨트롤러")
//class TradeLogControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @MockBean
//    private TradeLogServiceImpl tradeLogServiceImpl;
//
//    private static Long PORTFOLIO_ID = 1L;
//    private static Long STOCK_ID = 1L;
//    private static Long TRADE_LOG_ID = 1L;
//
//    @DisplayName("종목 이력을 조회한다.")
//    void viewTradeLogs() throws Exception {
//
//        // given
//        given(tradeLogServiceImpl.get(STOCK_ID))
//                .willReturn(List.of(
//                        TradeLogResponse.builder()
//                                .id(1L)
//                                .price(getBD(1000))
//                                .type(TradeType.BUY)
//                                .profit(getBD(0))
//                                .quantity(getBD(2))
//                                .totalPrice(getBD(2000))
//                                .tradeDate(LocalDateTime.of(2023, 10, 26, 17, 7, 13))
//                                .build()
//                ));
//
//        // when & then
//        mockMvc.perform(get("/portfolios/" + PORTFOLIO_ID + "/stocks/" + STOCK_ID + "/trade-log"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//}