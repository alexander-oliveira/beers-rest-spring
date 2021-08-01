package dev.xndr.beerstock.dto;

import dev.xndr.beerstock.enums.BeerType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDTO {

    private Long id;

    @NotNull
    @Size(min = 1, max = 50)
    private String name;

    @NotNull
    @Size(min = 1, max = 30)
    private String brand;

    @NotNull
    @Max(1000)
    private int max;

    @NotNull
    @Max(1000)
    private int quantity;

    @Enumerated(EnumType.STRING)
    @NotNull
    private BeerType type;
}
