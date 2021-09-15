package spring.Repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.entity.Shirts;


@Repository
public interface ShirtsRepository extends JpaRepository<Shirts, Integer>{
	
	 @Modifying
	    @Transactional
	    @Query(value="delete from shirt_cart s where s.serialno=:serialno",nativeQuery=true)
	    public void removefromshirts(@Param("serialno")int serialno);
}