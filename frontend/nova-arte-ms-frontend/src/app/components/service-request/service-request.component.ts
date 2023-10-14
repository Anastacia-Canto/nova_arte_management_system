import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';



@Component({
  selector: 'na-service-request',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule, MatFormFieldModule, MatInputModule, MatDatepickerModule, MatNativeDateModule],
  templateUrl: './service-request.component.html',
  styles: [
  ]
})
export class ServiceRequestComponent {
  minEventDate = new Date();
  serviceRequestForm = new FormGroup({
    clientName: new FormControl(''),
    clientEmail: new FormControl(''),
    clientPhoneNumber: new FormControl(''),
    eventName: new FormControl(''),
    eventDate: new FormControl(''),
    eventStartTime: new FormControl(''),
    eventEndTime: new FormControl('')
  });

}
