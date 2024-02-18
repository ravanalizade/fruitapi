package az.ingress.fruitapi.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor  //but
@Table(name = "fruits")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FruitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String amount;

    Double price;
}
