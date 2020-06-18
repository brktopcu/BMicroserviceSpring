package spring.example.beerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import spring.example.beerservice.domain.Beer;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
