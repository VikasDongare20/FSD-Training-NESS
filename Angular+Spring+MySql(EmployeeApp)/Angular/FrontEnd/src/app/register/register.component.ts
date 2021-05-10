import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from '../emp-service.service';
import { Employee } from '../employee'

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  employee : Employee=new Employee("","","","","",0);
  message:any;

  constructor(private service : EmpServiceService) { }

  ngOnInit(): void {
  }
  public registerNow(){
   let response= this.service.doRegistration(this.employee);
   response.subscribe(data=>{
    this.message=data; 
   })
  }

}
