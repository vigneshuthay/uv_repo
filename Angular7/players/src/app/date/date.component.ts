import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'date',
  templateUrl: './date.component.html',
  styleUrls: ['./date.component.css']
})
export class DateComponent implements OnInit {

  dateAndTime: string;

  constructor() {
    setInterval(
      () => {
        this.dateAndTime = new Date().toDateString() + ' ' + new Date().toLocaleTimeString()
      }, 1000
    )
  }

  ngOnInit() {
  }

  getDateAndTime() {

  }

}
