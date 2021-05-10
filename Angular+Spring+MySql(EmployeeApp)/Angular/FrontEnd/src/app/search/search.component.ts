import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from '../emp-service.service'

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  username:string;
  employee:any;
  constructor(private service: EmpServiceService) { }

  ngOnInit(): void {
  }
  public findByUsername(){
    let response=this.service.getEmployeeByUsername(this.username);
    response.subscribe(data=>this.employee=data);
  }
  

}
