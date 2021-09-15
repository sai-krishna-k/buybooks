package spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ShirtCart")
public class ShirtCart {

	@Id
	int serialno;

	public int getSerialno() {
		return serialno;
	}

	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}

	public ShirtCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShirtCart(int serialno) {
		super();
		this.serialno = serialno;
	}
	
	
}
