import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { CartService } from '../cart.service';

import { ShirtsServiceService } from '../shirts-service.service';

@Component({
  selector: 'app-shirts',
  templateUrl: './shirts.component.html',
  styleUrls: ['./shirts.component.css']
})
export class ShirtsComponent implements OnInit {

  
  searchedKeyword:any;
  retrievedImage: any;
  base64Data: any;
  retrieveResonse: any;
  posts=[];
 // url="http://localhost:8080/getShirts";
  
  view:boolean=false;
  constructor(private _service:ShirtsServiceService,private _http:HttpClient,private _router:Router,private activateroute:ActivatedRoute,private cartService: CartService) { 
             
// _http.get(this.url).toPromise().then(data=>
//   {
//     console.log(data);
//     for(let key in data)
//     {
//       if(data.hasOwnProperty(key))
//       {


//         this.posts.push(data[key]);

//       }
//     }
   
//   })
   //_service.getallmobiles().subscribe(reponse=>this.MobileImages=reponse)
   //console.log(this.MobileImages)
   

  this._http.get('http://localhost:8080/getShirtsImages')
        .subscribe(
          res => {
            console.log(res);
            for(let key in res)
            {
              if(res.hasOwnProperty(key))
              {

                console.log(res)
                this.retrieveResonse = res[key];
                this.base64Data = this.retrieveResonse.shirtimage;
                this.retrievedImage = 'data:image/jpeg;base64,' + this.base64Data;
                
                res[key].shirtimage=this.retrievedImage;
              
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
  
    
    
    addshirtscart(shirtscart:any)
    {
      this._http.post(`http://localhost:8080/addshirtcart`,shirtscart).subscribe(res=>console.log(res))
     // this._router.navigate(["Cart"],{relativeTo:this.activateroute});
    }
 

   totallength:any;
   page:number=1
  ngOnInit() {

   this._service.getallshirts().subscribe(Response =>{
    this.totallength=Response.length;
  
 console.log(this.posts)
})
  }
}
