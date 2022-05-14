package myview.springframework.rahulbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.assertj.core.data.Offset;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;
import java.util.UUID;

//Lombok will provide data --> getter and setter, equal and hashCode methods, no Args ctor, All args ctor and Builder pattern as well
//With Lombok, one can save ton of typings
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    @Null
    private UUID id;
    @NotBlank
    private String beerName;
    @NotBlank
    private String beerStyle;
    @Positive
    private Long upc;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;
}
