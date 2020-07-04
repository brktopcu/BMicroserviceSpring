package spring.example.beerservice.web.mappers;

import org.mapstruct.Mapper;
import spring.example.beerservice.domain.Beer;
import spring.example.beerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
