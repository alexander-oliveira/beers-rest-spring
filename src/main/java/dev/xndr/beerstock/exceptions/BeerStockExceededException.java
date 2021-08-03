package dev.xndr.beerstock.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockExceededException extends Exception {
    public BeerStockExceededException(Long id, Integer quantityToIncrement) {
        super(String.format("Beers with %s ID to increment informed exceeds max stock capacity: %s", id, quantityToIncrement ));
    }
}
