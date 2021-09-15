package spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.entity.ShirtCart;

public interface ShirtCartRepository extends JpaRepository<ShirtCart, Integer> {

}
