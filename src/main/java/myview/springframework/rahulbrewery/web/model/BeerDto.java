package myview.springframework.rahulbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

//Lombok will provide data --> getter and setter, equal and hashCode methods, no Args ctor, All args ctor and Builder pattern as well
//With Lombok, one can save ton of typings
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
