package spring.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Books")
public class Books {

	
	@Id
	@GeneratedValue
	private int serialno;
	private String publisher;
	private String name;
	private float Cost;
	//@Column(name = "Book_image", length = 1000)

	private Blob Book_image;
	
	public String getpublisher() {
		return publisher;
	}
	public void setpublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public float getCost() {
		return Cost;
	}
	public void setCost(float cost) {
		Cost = cost;
	}
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	
	public Blob getBook_image() {
		return Book_image;
	}
	public void setBook_image(Blob Book_image) {
		this.Book_image = Book_image;
	}
	public Books(int serialno, String publisher, String name, float cost, Blob Book_image) {
		super();
		this.serialno = serialno;
		this.publisher = publisher;
		this.name = name;
		Cost = cost;
		
		this.Book_image = Book_image;
	}
	private byte[] bookimage;

	public byte[] getbookimage() {
		return bookimage;
	}
	public void setbookimage(byte[] bookimage) {
		this.bookimage = bookimage;
	}
	public Books(int serialno, String publisher, String name, float cost, byte[] bookimage) {
		super();
		this.serialno = serialno;
		this.publisher = publisher;
		this.name = name;
		Cost = cost;
		this.bookimage = bookimage;
	}
	
	
	
}
