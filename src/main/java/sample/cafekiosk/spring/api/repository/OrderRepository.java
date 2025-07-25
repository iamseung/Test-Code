package sample.cafekiosk.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.cafekiosk.spring.domain.order.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
