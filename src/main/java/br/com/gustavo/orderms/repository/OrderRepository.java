package br.com.gustavo.orderms.repository;

import br.com.gustavo.orderms.Entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
