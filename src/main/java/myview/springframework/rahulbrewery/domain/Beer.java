package myview.springframework.rahulbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import myview.springframework.rahulbrewery.web.model.v2.BeerStyleEnum;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
