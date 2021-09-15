package spring.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	private int serialno;

	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int serialno) {
		super();
		this.serialno = serialno;
	}
	
	
}
