package spring.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.Repository.BooksRepository;
import spring.Repository.CartRepository;
import spring.Repository.ShirtCartRepository;
import spring.Repository.ShirtsRepository;
import spring.entity.Books;
import spring.entity.Cart;
import spring.entity.ShirtCart;
import spring.entity.Shirts;

@RestController
@CrossOrigin(origins = "http://localhost:4200")


public class Ecommerce {

	
	spring.entity.Books books=new spring.entity.Books();
	
	@Autowired
	private BooksRepository booksrepository;
	
	@Autowired
	private ShirtsRepository shirtsrepository;
	
	
	@Autowired
	private CartRepository cartrepository;
	
	@Autowired
	private ShirtCartRepository shirtcartrepository;
	
	
	
	@RequestMapping("/getBooks")
	public List<Books> getBooks()
	{
		return booksrepository.findAll();

	}
	
		
	@GetMapping(path = { "/getBooksImages" })
	public List<Books> getBookImage() throws IOException {
		
		final List<Books> retrievedImage =booksrepository.findAll();
		List<Books> mob=new ArrayList<>();
		for (Books m:retrievedImage)
		{
			
Books img = new Books(m.getSerialno(),m.getpublisher(),m.getname(),m.getCost(),toByteArray(m.getBook_image()));
			
	mob.add(img);
		}

for(Books mo:mob)
{
	System.out.println(mo.getpublisher());
	System.out.println(mo.getbookimage());
}
	
		
		return mob;
	}
	
	@GetMapping("/getShirts")
	public List<Shirts> getShirts()
	{
		return shirtsrepository.findAll();

	}
	
		
	@GetMapping(path = { "/getShirtsImages" })
	public List<Shirts> getShirtImage() throws IOException {
		
		final List<Shirts> retrievedImage =shirtsrepository.findAll();
		List<Shirts> mob=new ArrayList<>();
		for (Shirts m:retrievedImage)
		{
			
Shirts img = new Shirts(m.getSerialno(),m.getpublisher(),m.getname(),m.getCost(),toByteArray(m.getShirt_image()));
			
	mob.add(img);
		}

for(Shirts mo:mob)
{
	System.out.println(mo.getpublisher());
	System.out.println(mo.getshirtimage());
}
	
		
		return mob;
	}
	
	
	
	private byte[] toByteArray(Blob fromImageBlob) {
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    try {
	      return toByteArrayImpl(fromImageBlob, baos);
	    } catch (Exception e) {
	    }
	    return null;
	  }



	private byte[] toByteArrayImpl(Blob fromImageBlob, 
	      ByteArrayOutputStream baos) throws SQLException, IOException {
	    byte buf[] = new byte[4000];
	    int dataSize;
	    InputStream is = fromImageBlob.getBinaryStream(); 

	    try {
	      while((dataSize = is.read(buf)) != -1) {
	        baos.write(buf, 0, dataSize);
	      }    
	    } finally {
	      if(is != null) {
	        is.close();
	      }
	    }
	    System.out.println("clip");
	    System.out.println(baos.toByteArray());
	    return baos.toByteArray();
	  }
	
	
	
	
	
	
	@PostMapping("addtocart")
	public void addtoCart(@RequestBody Cart cart)
	{
		cartrepository.save(cart);
	}
	@RequestMapping("getbookscart")
	public List<Books> GetFromCart()
	{
		List<Books> cart=new ArrayList<>();
		List<Cart> cartlist=cartrepository.findAll();
		List<Books> mob=booksrepository.findAll();
		for(Cart c:cartlist)
		{
			for(Books m:mob)
			{
				if(c.getSerialno()==m.getSerialno())
				{
					
					Books cc=new Books(m.getSerialno(),m.getpublisher(),m.getname(),m.getCost(), toByteArray(m.getBook_image()));
					System.out.println(cc.getSerialno());
					cart.add(cc);
				}
			}
			
			
			
		}
		return cart;
	}
	@RequestMapping("addshirtcart")
	public List<ShirtCart> computertocart(@RequestBody ShirtCart cc)
	{
		shirtcartrepository.save(cc);
		return null;
		
	}
	
//	@RequestMapping("remove")
//	public  void remove() {
//		let cart = JSON.parse(localStorage.getBooks(serialno));
//		   let newcart= cart.filter((mobil) => mobil.serialno!= serialno);
//				   localStorage.setBooks('cart', JSON.stringify(newcart));
//				  
//	}
//	 
//	
	
	
	
	@RequestMapping("getshirtscart")
	public List<Shirts> GetComputersCart()
	{
		List<Shirts> cart=new ArrayList<>();
		List<ShirtCart> cartlist=shirtcartrepository.findAll();
		List<Shirts> mob=shirtsrepository.findAll();
		for(ShirtCart c:cartlist)
		{
			for(Shirts m:mob)
			{
				if(c.getSerialno()==m.getSerialno())
				{
					
					Shirts cc=new Shirts(m.getSerialno(),m.getpublisher(),m.getname(),m.getCost(), toByteArray(m.getShirt_image()));
					//System.out.println(mobil.getSerialno());
					cart.add(cc);
				}
			}
			
			
			
		}
		return cart;
	}
	
	@PostMapping("removecartproduct")
	public void removefromcart(@RequestBody Books books)
	{
		List<Books> bcart=booksrepository.findAll();
		for (Books b:bcart) {
			if(b.getSerialno()==books.getSerialno()&&b.getpublisher().equals(books.getpublisher())&&b.getname().equals(books.getname()))
			{
				booksrepository.removefrombooks(books.getSerialno());
			}
		}
		List<Shirts> scart=shirtsrepository.findAll();
		for (Shirts s:scart) {
			if(s.getSerialno()==books.getSerialno()&&s.getpublisher().equals(books.getpublisher())&&s.getname().equals(books.getname()))
			{
				shirtsrepository.removefromshirts(books.getSerialno());
			}
		}
	}
	
}
