import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllEmployeeComponent } from './all-employee/all-employee.component';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { RegisterComponent } from './register/register.component';
import { SearchComponent } from './search/search.component';

const routes: Routes = [
    { path: '', redirectTo:"/home", pathMatch:'full' },


    {
        path: "search" , component : SearchComponent
        }, 
        {
            path: "all-employee", component: AllEmployeeComponent
        },
        {
            path: "register", component: RegisterComponent
        },
        {
            path:"home" , component: HomeComponent
        },
    
   
    { path:'**', component: PageNotFoundComponent }
]


@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{}