package az.ingress.fruitapi.service;

import az.ingress.fruitapi.dto.FruitRequestDto;
import az.ingress.fruitapi.dto.FruitResponseDto;
import az.ingress.fruitapi.entity.FruitEntity;
import az.ingress.fruitapi.repository.FruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FruitService {

    private final FruitRepository fruitRepository;


    public FruitResponseDto create(FruitRequestDto requestDto){
        FruitEntity fruitEntity = FruitEntity.builder()
                .amount(requestDto.getAmount())
                .price(requestDto.getPrice())
                .name(requestDto.getName())
                .build();
        FruitEntity fruit1 = fruitRepository.save(fruitEntity);


        return FruitResponseDto.builder()
                .id(fruit1.getId())
                .name(fruit1.getName())
                .price(fruit1.getPrice())
                .amount(fruit1.getAmount())
                .build();
    }


    public void deleteFruitById(Long id) {
        fruitRepository.deleteById(id);
    }
}
