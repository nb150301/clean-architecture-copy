package rolin.cleanarchitecture.api.facade;

import rolin.cleanarchitecture.api.response.FlightResponse;

public interface FlightFacade {
  public FlightResponse getFlight(String flightNumber);
}
