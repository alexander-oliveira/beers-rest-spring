package dev.xndr.beerstock.services;

import dev.xndr.beerstock.dto.BeerDTO;
import dev.xndr.beerstock.mapper.BeerMapper;
import dev.xndr.beerstock.repositories.BeerRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BeerService {
    
    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;
    
    public List<BeerDTO> listAll(){
        return beerRepository.findAll()
                .stream()
                .map(beerMapper::toDTO)
                .collect(Collectors.toList());
    }
            
}
