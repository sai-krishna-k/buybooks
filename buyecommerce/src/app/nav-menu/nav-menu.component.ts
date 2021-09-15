import { Component, OnInit } from '@angular/core';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { Observable } from 'rxjs';
import { map, shareReplay } from 'rxjs/operators';
import { Router,ActivatedRoute } from '@angular/router';
import * as $ from 'jquery';
@Component({
  selector: 'app-nav-menu',
  templateUrl: './nav-menu.component.html',
  styleUrls: ['./nav-menu.component.css']
})
export class NavMenuComponent implements OnInit{

  constructor(private _router:Router,private route:ActivatedRoute) { }
  
 
  gotoMobiles()
  {
    this._router.navigate(["Mobiles"],{relativeTo:this.route});
  }
  gotoComputers()
  {
    this._router.navigate(["computers"],{relativeTo:this.route});
  }
  ngOnInit() {
    //Toggle Click Function
$("#menu-toggle").click(function(e) {
e.preventDefault();
$("#wrapper").toggleClass("toggled");
});
}
}
