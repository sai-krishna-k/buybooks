import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})


export class ShirtsServiceService {
  
  getallshirts():Observable<any> {
    let url="http://localhost:8080/getShirtsImages";
    return this._http.get(url)
    
     
  }
  constructor(private _http:HttpClient) {

  }
  
  
 
  
}
