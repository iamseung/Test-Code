package sample.cafekiosk.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.cafekiosk.spring.domain.stock.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
