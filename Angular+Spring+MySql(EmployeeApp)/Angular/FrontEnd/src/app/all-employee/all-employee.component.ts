import { Component, OnInit } from '@angular/core';
import { EmpServiceService} from '../emp-service.service'

@Component({
  selector: 'app-all-employee',
  templateUrl: './all-employee.component.html',
  styleUrls: ['./all-employee.component.css']
})
export class AllEmployeeComponent implements OnInit {

  employee:any;
   
  constructor(private service : EmpServiceService) { }

  ngOnInit() {
    let response=this.service.getEmployee();
    response.subscribe(data=>this.employee=data);
  }

  public removeEmployee(username : string){
    let response=this.service.deleteEmployee(username);
    response.subscribe(data =>this.employee=data);
  }


}
