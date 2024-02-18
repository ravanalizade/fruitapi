package az.ingress.fruitapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FruitResponseDto {

    Long id;

    String name;

    String amount;

    Double price;
}
