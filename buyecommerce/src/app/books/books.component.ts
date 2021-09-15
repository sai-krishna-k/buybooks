import { Component, OnInit,ViewChild } from '@angular/core';
import { BooksServiceService } from 'src/books-service.service';
import { HttpClient } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';

import { CartService } from 'src/app/cart.service';
@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
  
  retrievedImage: any;
  base64Data: any;
  retrieveResonse: any;
  posts=[];
searchedKeyword:any;
  cart=[  ];
  view:boolean=false;
  constructor(private _service:BooksServiceService,private _http:HttpClient,private _router:Router,private activateroute:ActivatedRoute,private cartService: CartService,
    private route: ActivatedRoute) { 

  this._http.get('http://localhost:8080/getBooksImages')
        .subscribe(
          res => {
            console.log(res);
            for(let key in res)
            {
              if(res.hasOwnProperty(key))
              {

                console.log(res)
                this.retrieveResonse = res[key];
                this.base64Data = this.retrieveResonse.bookimage;
                this.retrievedImage = 'data:image/jpeg;base64,' + this.base64Data;
                
                res[key].bookimage=this.retrievedImage;
              
                this.posts.push(res[key]);
              }
            }
           
          }
        );
        console.log(this.posts);
    }
    imagedetails()
    {
  this.view=!this.view;
    }
    changeimgview()
    {
      this.view=!this.view;
    }
  
    
    
    
    addbookscart(bookscart:any)
    {
      this._http.post(`http://localhost:8080/addtocart`,bookscart).subscribe(res=>console.log(res))
     // this._router.navigate(["Cart"],{relativeTo:this.activateroute});
    }
      totallength:any;
      page:number=1
     ngOnInit() {
    
      this._service.getallbooks().subscribe(Response =>{
       this.totallength=Response.length;
     
    console.log(this.posts)
    })
     }
 

}
