package rolin.cleanarchitecture.core.application.usecase;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import rolin.cleanarchitecture.core.application.dto.FlightDTO;

@Component
@RequiredArgsConstructor
public class GetAllFlightUseCase {
  public FlightDTO execute() {
    return null;
  }
}
