package jpabook.jpashop.domain.repository;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.criterion.Order;

import javax.persistence.EntityManager;
import java.util.List;

@Getter @Setter
@RequiredArgsConstructor
public class OrderSearch {

    private final EntityManager em;

    public void save(Order order) { em.persist(order);}

    public Order findOne(Long id) { return em.find(Order.class, id);}

}
