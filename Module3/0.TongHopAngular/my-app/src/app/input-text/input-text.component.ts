import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-input-text',
  templateUrl: './input-text.component.html',
  styleUrls: ['./input-text.component.css']
})
export class InputTextComponent implements OnInit {
  name = '';
  isHighlight = true;
  isShow = false;
  arrSubjects = ['Angular', 'NodeJS', 'React'];
  newEn = '';
  newVn = '';
  filterStatus = 'Xem_tat_ca';
  arrWords = [
    {id: 1, en: 'action', vn: 'hành động', memorized: true},
    {id: 2, en: 'actor', vn: 'diễn viên', memorized: false},
    {id: 3, en: 'activity', vn: 'hoạt động', memorized: true},
    {id: 4, en: 'active', vn: 'chủ động', memorized: true},
    {id: 5, en: 'bath', vn: 'tắm', memorized: false},
    {id: 6, en: 'bedroom', vn: 'phòng ngủ', memorized: true}
  ];

  constructor() {
  }

  ngOnInit(): void {
  }

  showEvent(event) {
    this.name = event.target.value;
  }
  addWord() {
    this.arrWords.unshift({
      id: this.arrWords.length + 1,
      en: this.newEn,
      vn: this.newVn,
      memorized: false
    });
    this.newEn = '';
    this.newVn = '';
    this.isShow = false;
  }
  removeWord(id: number) {
    const index = this.arrWords.findIndex(e => e.id === id);
    this.arrWords.splice(index, 1);
  }
  getShowStatus(memorized: boolean) {
    const dkXemTatCa = this.filterStatus === 'Xem_tat_ca';
    const dkXemDaNho = this.filterStatus === 'Xem_da_nho' && memorized;
    const dkXemChuaNho = this.filterStatus === 'Xem_chua_nho' && !memorized;
    return dkXemTatCa || dkXemDaNho || dkXemChuaNho;
  }
}
