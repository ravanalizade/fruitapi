package az.ingress.fruitapi.repository;

import az.ingress.fruitapi.entity.FruitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<FruitEntity,Long> {
}
