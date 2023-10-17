package spofo.holdingstock.domain;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import spofo.holdingstock.controller.request.HoldingStockRequest;
import spofo.portfolio.domain.Portfolio;
import spofo.tradelog.domain.TradeLog;

@Getter
@Builder
public class HoldingStock {

    private Long id;
    private String stockCode;
    private Portfolio portfolio;
    private List<TradeLog> tradeLogs;

    public static HoldingStock of(HoldingStockRequest request, Portfolio portfolio) {
        return HoldingStock.builder()
                .stockCode(request.getCode())
                .portfolio(portfolio)
                .build();
    }
}
