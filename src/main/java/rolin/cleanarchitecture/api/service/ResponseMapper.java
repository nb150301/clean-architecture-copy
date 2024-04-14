package rolin.cleanarchitecture.api.service;

import rolin.cleanarchitecture.api.response.FlightResponse;
import rolin.cleanarchitecture.core.application.dto.FlightDTO;

public interface ResponseMapper {
  public FlightResponse mapFlightResponse(FlightDTO flightDTO);
}
