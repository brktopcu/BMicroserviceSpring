package spring.example.beerservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.example.beerservice.domain.Beer;
import spring.example.beerservice.repositories.BeerRepository;

import java.math.BigDecimal;
import java.sql.SQLOutput;

@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadBeerObjects();

    }

    private void loadBeerObjects(){
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(15)
                    .upc(337010000001L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("Pale Ale")
                    .quantityToBrew(150)
                    .minOnHand(10)
                    .upc(337010000002L)
                    .price(new BigDecimal("10.95"))
                    .build());
        }

        System.out.println(beerRepository.count() + "beers loaded");
    }
}
