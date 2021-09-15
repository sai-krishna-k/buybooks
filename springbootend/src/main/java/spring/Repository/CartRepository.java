package spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.entity.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart,Integer>{

}
