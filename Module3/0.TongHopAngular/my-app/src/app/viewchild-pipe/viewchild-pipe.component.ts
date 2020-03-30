import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-viewchild-pipe',
  templateUrl: './viewchild-pipe.component.html',
  styleUrls: ['./viewchild-pipe.component.css']
})
export class ViewchildPipeComponent implements OnInit {
  value: 0;
  constructor() { }

  ngOnInit(): void {
  }

}
