import { Component, OnInit } from '@angular/core';
import {EmploymentService} from './employment.service';
import {QueryOptions} from '../general/query-options';
import {MessageService} from 'primeng/api';
import {CommonService} from '../common.service';
import * as moment from 'jalali-moment';
import {ConfirmationService} from 'primeng/api';

@Component({
  selector: 'app-employment',
  templateUrl: './employment.component.html',
  styleUrls: ['./employment.component.css']
})
export class EmploymentComponent implements OnInit {

  constructor(private employmentService: EmploymentService,
              private messageService: MessageService,
              private commonService: CommonService,
              private confirmationService: ConfirmationService) { 

   }

   educationoptions = [{'label': 'دیپلم', 'value': '1'},{'label': 'فوق دیپلم', 'value': '2'},{'label': 'کارشناسی', 'value': '3'}]
   genderoptions = [{'label': 'male', 'value': '1'},{'label': 'female', 'value': '2'}]
   employment: any;


  items = {data: [], count : 0};

  ngOnInit() {
    this.educationoptions = this.commonService.preparePureListToDropdown(this.educationoptions);
    this.genderoptions = this.commonService.preparePureListToDropdown(this.genderoptions);
    this.employment =  new Object();
    this.employmentService.list(new QueryOptions(), 'search').subscribe(res => {
      console.log('list call res', res);
      this.items = res;
    });
  }
  loadItems(event: any) {
    if (!event) {
      event = {first : 0, rows : 20};
    }
    let query = new QueryOptions();
    query.options = [{key: 'firstIndex', value: event.first}, {key: 'pageSize', value: event.rows}];
    this.employmentService.list(query, 'search').subscribe(res => {
      this.items = res;
    });
  }

  save() {
    if(this.employment.education) { 
        this.employment.education = this.employment.education.value;
    }
    if(this.employment.gender) { 
        this.employment.gender = this.employment.gender.value;
    }
    this.employmentService.create(this.employment, 'save').subscribe(res => {
      this.employment = res;
      this.loadItems(null);
      this.commonService.showSubmitMessage();
      this.employment = new Object();
    });
  }

  delete(id: number) {
    this.employmentService.delete(id, 'delete').subscribe(res => {
      this.commonService.showDeleteMessage();
      this.loadItems(null);
    });
  }


  edit(item) {
    this.employment = JSON.parse(JSON.stringify(item));
    this.employment.education = this.educationoptions.filter(v => v.value == this.employment.education)[0];
    this.employment.gender = this.genderoptions.filter(v => v.value == this.employment.gender)[0];
    this.convertDateFields();
  }


  clear() {
    this.employment = new Object();
  }

   convertDateFields() {
            this.employment.birthDate = moment(this.employment.birthDate)
  }

   confirm(item) {
        this.confirmationService.confirm({
            message: 'آیا مطمئن هستید؟',
            accept: () => {
                // Actual logic to perform a confirmation
               this.delete(item.id);
            }
        });
    }
}


