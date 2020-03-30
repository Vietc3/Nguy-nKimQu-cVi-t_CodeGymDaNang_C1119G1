import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {
  // tslint:disable-next-line:ban-types
  @Input() name: string;
  // tslint:disable-next-line:ban-types
  @Input() age: Number;
  @Output() removePerson = new EventEmitter<string>();
  constructor() { }

  ngOnInit(): void {
  }
  removeByClick() {
    this.removePerson.emit(this.name);
}
}
