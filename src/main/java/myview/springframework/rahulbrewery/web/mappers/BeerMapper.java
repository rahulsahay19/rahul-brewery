package myview.springframework.rahulbrewery.web.mappers;

import myview.springframework.rahulbrewery.domain.Beer;
import myview.springframework.rahulbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses={DateMapper.class})
public interface BeerMapper {
    //This is like automapper in C#
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
