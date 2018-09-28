package pl.pawel.flightcheckin.integration;

import pl.pawel.flightcheckin.integration.dto.Reservation;
import pl.pawel.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

    public Reservation findReservation(Long id);
    public Reservation updateReservation(ReservationUpdateRequest request);
}
