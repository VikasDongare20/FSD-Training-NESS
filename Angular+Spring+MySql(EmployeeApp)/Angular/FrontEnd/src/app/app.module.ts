import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms'

import { AppComponent } from './app.component';

import{ AppRoutingModule } from './app-routing-module';

import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HeaderComponent } from './header/header.component';
import { SearchComponent } from './search/search.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';

import { AllEmployeeComponent } from './all-employee/all-employee.component'
import { HttpClientModule } from '@angular/common/http';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    HeaderComponent,
    SearchComponent,
    RegisterComponent,
    HomeComponent,
 
    AllEmployeeComponent,
      FooterComponent,
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
