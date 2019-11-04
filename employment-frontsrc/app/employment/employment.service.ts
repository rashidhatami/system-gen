import { Injectable } from '@angular/core';
import {BaseServiceService} from '../general/base-service.service';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmploymentService extends BaseServiceService {

      constructor(httpClient: HttpClient) {

        super(httpClient, 'employment');
      }

}