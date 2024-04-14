package rolin.cleanarchitecture.infrastructure.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rolin.cleanarchitecture.api.facade.FlightFacade;
import rolin.cleanarchitecture.api.response.FlightResponse;
import rolin.cleanarchitecture.core.application.usecase.GetAllFlightUseCase;

@RequiredArgsConstructor
@Service
public class FlightFacadeImpl implements FlightFacade {
  // TODO: Update to fire an event to execute the use case
  private final GetAllFlightUseCase getAllFlightUseCase;
  @Override
  public FlightResponse getFlight(String flightNumber) {
    getAllFlightUseCase.execute();
    return null;
  }
}
