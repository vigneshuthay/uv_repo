import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  title : string = 'Players App';

  constructor() { }

  ngOnInit() {
  }

}
