package spring.entity;


import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Shirts")
public class Shirts {

	
	@Id
	@GeneratedValue
	private int serialno;
	private String publisher;
	private String name;
	private float Cost;
	

	private Blob shirt_image;
	
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
	
	public Shirts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	
	public Blob getShirt_image() {
		return shirt_image;
	}
	public void setShirt_image(Blob shirt_image) {
		this.shirt_image = shirt_image;
	}
	public Shirts(int serialno, String publisher, String name, float cost,Blob shirt_image) {
		super();
		this.serialno = serialno;
		this.publisher = publisher;
		this.name = name;
		Cost = cost;
		
		this.shirt_image = shirt_image;
	}
	
	private byte[] shirtimage;

	public byte[] getshirtimage() {
		return shirtimage;
	}
	public void setshirtimage(byte[] shirtimage) {
		this.shirtimage = shirtimage;
	}
	public Shirts(int serialno, String publisher, String name, float cost, byte[] shirtimage) {
		super();
		this.serialno = serialno;
		this.publisher = publisher;
		this.name = name;
		Cost = cost;
		this.shirtimage = shirtimage;
	}
	
	
	
}
