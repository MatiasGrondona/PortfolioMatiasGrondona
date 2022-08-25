import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardSoftSkillComponent } from './hard-soft-skill.component';

describe('HardSoftSkillComponent', () => {
  let component: HardSoftSkillComponent;
  let fixture: ComponentFixture<HardSoftSkillComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardSoftSkillComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HardSoftSkillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
