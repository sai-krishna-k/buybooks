package spring.Repository;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.entity.Books;


@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>{
	
	 @Modifying
	    @Transactional
	    @Query(value="delete from cart b where b.serialno=:serialno",nativeQuery=true)
	    public void removefrombooks(@Param("serialno")int serialno);
}
