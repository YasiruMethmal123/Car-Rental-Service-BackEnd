package org.example.Service;

import org.example.Dto.Booking;
import java.util.List;

public interface BookingService {
    List<Booking> getBooking();
     void addBooking(Booking booking);
     void deleteById(Integer id);
}
