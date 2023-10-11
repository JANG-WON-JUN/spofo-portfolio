package spofo.stockhave.controller;

import static org.springframework.http.ResponseEntity.ok;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spofo.stockhave.controller.response.AddStockResponse;
import spofo.stockhave.controller.response.StockHaveResponse;
import spofo.stockhave.domain.AddStockRequest;
import spofo.stockhave.service.StockHaveServiceImpl;

@RestController
@RequiredArgsConstructor
public class StockController {

    private final StockHaveServiceImpl stockHaveServiceImpl;

    @GetMapping("/portfolios/{portfolioId}/stocks")
    public ResponseEntity<List<StockHaveResponse>> getStocks(
            @PathVariable("portfolioId") Long portfolioId) {
        // TODO : 전체 보유 종목 조회
        //List<StockHaveResponse> result = stockHaveService.getStocks(portfolioId);
        List<StockHaveResponse> result = null;
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/portfolios/{portfolioId}/stocks")
    public ResponseEntity<AddStockResponse> addStock(
            @RequestBody @Validated AddStockRequest addStockRequest,
            @PathVariable("portfolioId") Long portfolioId) {
        // TODO : 종목 매수
        AddStockResponse addStockResponse = stockHaveServiceImpl.addStock(
                addStockRequest, portfolioId);
        return ok(addStockResponse);
    }

//    @PostMapping("/portfolios/{portfolioId}/stocks/{stockId}")
//    public ResponseEntity<AddStockResponse> addMoreStock(
//            @RequestBody @Validated AddStockRequest addStockRequest,
//            @PathVariable("portfolioId") Long portfolioId,
//            @PathVariable("stockId") Long stockId) {
//        // TODO : 종목 추가 매수
//        AddStockResponse addStockResponse = stockHaveService.addMoreStock(addStockRequest);
//        return ok(addStockResponse);
//    }

    @DeleteMapping("/portfolios/{portfolioId}/stocks/{stockId}")
    public ResponseEntity<Void> deleteStock(
            @PathVariable("portfolioId") Long portfolioId,
            @PathVariable("stockId") Long stockId) {
        // TODO : 종목 삭제
        stockHaveServiceImpl.deleteStock(stockId);
        return ok().body(null);
    }

    @GetMapping("/portfolios/{portfolioId}/stocks/{stockCode}")
    public ResponseEntity<List<StockHaveResponse>> getStocksByCode(
            @PathVariable("portfolioId") Long portfolioId,
            @PathVariable("stockCode") String stockCode) {
        // TODO : 전체 보유 종목 조회
        List<StockHaveResponse> result = stockHaveServiceImpl.getStocksByCode(portfolioId, stockCode);
        return ResponseEntity.ok().body(result);
    }

}
