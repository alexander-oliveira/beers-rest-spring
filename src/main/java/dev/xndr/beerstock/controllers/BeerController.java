package dev.xndr.beerstock.controllers;

import dev.xndr.beerstock.dto.BeerDTO;
import dev.xndr.beerstock.exceptions.BeerAlreadyRegisteredException;
import dev.xndr.beerstock.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/beers")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerController {

    private final BeerService beerService;

    @GetMapping
    public List<BeerDTO> listBeers(){
        return beerService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BeerDTO createBeer(@RequestBody @Valid BeerDTO beerDTO) throws BeerAlreadyRegisteredException {
        return beerService.createBeer(beerDTO);
    }
}
