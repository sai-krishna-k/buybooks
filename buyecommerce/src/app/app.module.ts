import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


import { FormsModule } from '@angular/forms';
import { Routes,RouterModule } from '@angular/router';
import {MatListModule} from '@angular/material/list';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatToolbarModule} from '@angular/material/toolbar'; 
import{MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import { CommonModule } from '@angular/common';
import {MatCardModule} from '@angular/material/card';
import {HttpClientModule} from '@angular/common/http';
import { ErrorComponent } from './error/error.component';
import {MatPaginatorModule} from '@angular/material/paginator';
import {NgxPaginationModule} from 'ngx-pagination';

import { CartComponent } from './cart/cart.component';
import { BooksComponent } from './books/books.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { ShirtsComponent } from './shirts/shirts.component';
import {SidebarModule} from 'ng-sidebar';
import { NavMenuComponent } from './nav-menu/nav-menu.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';




//import {MatTableModule} from '@angular/material/table';
let routes:Routes=[

  

  { path:"",
  component: WelcomeComponent},
  {
    path:"Books",
    component: BooksComponent
  
  },
  {
  path:"Shirts",
  component: ShirtsComponent

},
  {
    path:"Books/Cart",component:CartComponent
  },
  {
    path:"Shirts/Cart",component:CartComponent
  },
  {
    path:"Cart",component:CartComponent
  },
{
    path:"**",component:ErrorComponent
  },
 


  
    
      
     
     
];

@NgModule({
  declarations: [
    AppComponent,
    CartComponent,
    BooksComponent,
    ErrorComponent,
    WelcomeComponent,
    ShirtsComponent,
    NavMenuComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    SidebarModule.forRoot(),
    FormsModule,
    MatCardModule,
    RouterModule.forRoot(routes),
    MatListModule,
    MatToolbarModule,
    MatSidenavModule,
    MatButtonModule,
    MatIconModule,
    CommonModule,
    HttpClientModule,
    MatPaginatorModule,
    NgxPaginationModule,
    Ng2SearchPipeModule
//    MatTableModule


  ],


  exports:[RouterModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
