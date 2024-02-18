package az.ingress.fruitapi.dto;

import lombok.Data;

@Data
public class FruitRequestDto {

    String name;

    String amount;

    Double price;
}
