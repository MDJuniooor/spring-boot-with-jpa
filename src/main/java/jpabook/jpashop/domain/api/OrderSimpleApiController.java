package jpabook.jpashop.domain.api;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderSimpleApiController {

    private final OrderRepository orderRepository;

    @GetMapping("/api/v1/simple-orders")
    public List<Order> ordersV1() {
        List<Order> all = orderRepository.findAll();
        for (Order order : all) {
            order.getMember().getName(); // Lazy Force initialize
            order.getDelivery().getAddress(); // Lazy Force initialize
        }
        return all;
    }

}
