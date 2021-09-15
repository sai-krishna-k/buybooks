import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { BooksComponent } from './books/books.component';


@Injectable({
  providedIn: 'root'
})
export class CartService {
    posts: any[];

  
   
    constructor() { }
   
  
    clearCart() {
      this.posts = [];
      return this.posts;
    }
  

  
  

}

