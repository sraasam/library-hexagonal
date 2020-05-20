package io.wkrzywiec.hexagonal.library.domain.borrowing.ports.incoming;

import io.wkrzywiec.hexagonal.library.domain.borrowing.model.BookReservationCommand;

public interface ReserveBook {
    Long handle(BookReservationCommand bookReservation);
}
