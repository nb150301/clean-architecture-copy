package rolin.cleanarchitecture.infrastructure.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rolin.cleanarchitecture.api.response.FlightResponse;
import rolin.cleanarchitecture.api.service.ResponseMapper;
import rolin.cleanarchitecture.core.application.dto.FlightDTO;

@Service
@RequiredArgsConstructor
public class ResponseMapperImpl implements ResponseMapper {
  @Override
  public FlightResponse mapFlightResponse(FlightDTO flightDTO) {
    return FlightResponse.builder().build();
  }
}
