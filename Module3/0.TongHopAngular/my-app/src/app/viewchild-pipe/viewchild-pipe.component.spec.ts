import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewchildPipeComponent } from './viewchild-pipe.component';

describe('ViewchildPipeComponent', () => {
  let component: ViewchildPipeComponent;
  let fixture: ComponentFixture<ViewchildPipeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewchildPipeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewchildPipeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
