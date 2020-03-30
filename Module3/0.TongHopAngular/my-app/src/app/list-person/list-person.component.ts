import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-person',
  templateUrl: './list-person.component.html',
  styleUrls: ['./list-person.component.css']
})
export class ListPersonComponent implements OnInit {
  arrperson = [
    {name : 'Tí', age : '18'},
    {name : 'Tèo', age : '19'},
    {name : 'Tủn', age : '15'}
  ];
  constructor() { }

  ngOnInit(): void {
  }
  removePersonByName(name: string) {
  const index = this.arrperson.findIndex(e => e.name === name);
  this.arrperson.splice(index, 1);
  }
}
