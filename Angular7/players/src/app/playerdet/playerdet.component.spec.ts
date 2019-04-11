import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlayerdetComponent } from './playerdet.component';

describe('PlayerdetComponent', () => {
  let component: PlayerdetComponent;
  let fixture: ComponentFixture<PlayerdetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlayerdetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlayerdetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
