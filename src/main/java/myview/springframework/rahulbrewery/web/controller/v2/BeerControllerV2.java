package myview.springframework.rahulbrewery.web.controller.v2;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import myview.springframework.rahulbrewery.services.v2.BeerServiceV2;
import myview.springframework.rahulbrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Validated
@RequestMapping("/api/v2/beer")
@RestController
@RequiredArgsConstructor
@Slf4j
public class BeerControllerV2 {
    private final BeerServiceV2 beerServiceV2;

    //taken care by @RequiredArgsConstructor --> lombok
    /*public BeerControllerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }*/

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> getBeer(@NotNull @PathVariable("beerId") UUID beerId){
        log.debug("Inside get");
        return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@Valid @NotNull @RequestBody BeerDtoV2 beerDto){
        //so rather being explicit we can use val from lombok to do explicit matching
       // BeerDtoV2 savedDto = beerServiceV2.saveNewBeer(beerDto);
        val savedDto = beerServiceV2.saveNewBeer(beerDto);
       // HttpHeaders headers = new HttpHeaders();
        val headers = new HttpHeaders();

        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDtoV2 beerDto){
        beerServiceV2.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerServiceV2.deleteById(beerId);
    }

}
