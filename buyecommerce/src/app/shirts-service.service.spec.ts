import { TestBed } from '@angular/core/testing';

import { ShirtsServiceService } from './shirts-service.service';

describe('ShirtsServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ShirtsServiceService = TestBed.get(ShirtsServiceService);
    expect(service).toBeTruthy();
  });
});
