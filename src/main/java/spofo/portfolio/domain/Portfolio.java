package spofo.portfolio.domain;

import static spofo.portfolio.domain.enums.IncludeType.Y;

import java.util.List;
import lombok.Builder;
import lombok.Getter;
import spofo.portfolio.domain.enums.Currency;
import spofo.portfolio.domain.enums.IncludeType;
import spofo.portfolio.domain.enums.PortfolioType;
import spofo.stockhave.domain.StockHave;

@Getter
@Builder
public class Portfolio {

    private final Long id;
    private final Long memberId;
    private final String name;
    private final String description;
    private final Currency currency;
    private final IncludeType includeYn;
    private final PortfolioType type;
    private final List<StockHave> stockHaves;

    public static Portfolio of(PortfolioCreate create, Long memberId) {
        return Portfolio.builder()
                .name(create.getName())
                .description(create.getDescription())
                .currency(create.getCurrency())
                .includeYn(Y)
                .type(create.getType())
                .memberId(memberId)
                .build();
    }

    public Portfolio update(PortfolioUpdate update, Long memberId) {
        return Portfolio.builder()
                .id(update.getId())
                .name(update.getName())
                .description(update.getDescription())
                .currency(update.getCurrency())
                .includeYn(update.getIncludeYn())
                .type(update.getType())
                .memberId(memberId)
                .build();
    }

}