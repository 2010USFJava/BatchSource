import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MattComponentComponent } from './matt-component.component';

describe('MattComponentComponent', () => {
  let component: MattComponentComponent;
  let fixture: ComponentFixture<MattComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MattComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MattComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
