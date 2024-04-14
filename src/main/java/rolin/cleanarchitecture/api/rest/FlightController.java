package rolin.cleanarchitecture.api.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import rolin.cleanarchitecture.api.facade.FlightFacade;
import rolin.cleanarchitecture.api.response.FlightResponse;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/flights")
public class FlightController {
  private final FlightFacade flightFacade;

  @GetMapping("")
  @ResponseStatus(HttpStatus.OK)
  public FlightResponse getFlight(String flightNumber) {
    return flightFacade.getFlight(flightNumber);
  }
}
