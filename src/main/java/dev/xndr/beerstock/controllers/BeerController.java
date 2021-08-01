package dev.xndr.beerstock.controllers;

import dev.xndr.beerstock.dto.BeerDTO;
import dev.xndr.beerstock.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
