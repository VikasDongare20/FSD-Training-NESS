import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EmpServiceService {

  constructor( private http: HttpClient) { }

  public doRegistration(employee){
    return this.http.post("http://localhost:8080/save-employee", employee, {responseType : "text" as "json"});
  }

  public getEmployee()
  {
    return this.http.get("http://localhost:8080/all-employee");
  }

  public getEmployeeByUsername(username)
  {
    return this.http.get("http://localhost:8080/search/" +username);
  }
  public deleteEmployee(username){
    return this.http.get("http://localhost:8080/delete/"+username)
  }
}
