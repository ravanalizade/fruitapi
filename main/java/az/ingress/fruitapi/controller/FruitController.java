package az.ingress.fruitapi.controller;

import az.ingress.fruitapi.dto.FruitRequestDto;
import az.ingress.fruitapi.dto.FruitResponseDto;
import az.ingress.fruitapi.service.FruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/fruits")
public class FruitController {

    private  final FruitService fruitService;


    @PostMapping("/create")
    public FruitResponseDto create(@RequestBody FruitRequestDto requestDto){
        return fruitService.create(requestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteFruit(@PathVariable Long id) {
        fruitService.deleteFruitById(id);
    }
}
