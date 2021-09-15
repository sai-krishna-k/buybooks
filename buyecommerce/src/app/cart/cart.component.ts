import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { removecartproduct } from '../product';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  cartitems:any=[];
  computercart:any=[];
  Product: removecartproduct;
  length:any=0;
  constructor(private _router:Router,private _http:HttpClient) {
     

_http.get("http://localhost:8080/getbookscart").subscribe(response=>
this.cartitems=response);

 _http.get("http://localhost:8080/getshirtscart").subscribe(response=>
{
for(let key in response)
{
  if(response.hasOwnProperty(key))
  {


this.cartitems.push(response[key]);



  }
}




});




   //location.reload();
  }

  Remove(item:any)
  {
    console.log(item)
    this.Product=new removecartproduct(item.serialno,item.publisher,item.name);

console.log(this.Product);
this._http.post(`http://localhost:8080/removecartproduct`,this.Product).subscribe(res=>console.log(res));
location.reload();
  }
  ngOnInit(): void {


if (!localStorage.getItem('foo')) { 
    localStorage.setItem('foo', 'no reload') 
    location.reload() 
  } else {
    localStorage.removeItem('foo') 
  }
  
  }

}

  

 

