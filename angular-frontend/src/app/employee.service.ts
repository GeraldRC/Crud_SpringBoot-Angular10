import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  private baseUrl = 'http://localhost:9595/api/v1/employees';
  constructor(private htppClient: HttpClient) {}

  getEmployeesList(): Observable<Employee[]> {
    return this.htppClient.get<Employee[]>(`${this.baseUrl}`);
  }
}
