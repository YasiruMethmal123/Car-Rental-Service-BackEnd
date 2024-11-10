package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Booking;
import org.example.Entity.BookingEntity;
import org.example.Repositary.BookingRepository;
import org.example.Service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    final BookingRepository repositary;
    final ModelMapper mapper;

    @Override
    public List<Booking> getBooking() {
        List<Booking> bookingList = new ArrayList<>();
        repositary.findAll().forEach(booking -> bookingList.add(mapper.map(booking,Booking.class)));
        return bookingList;
    }

    @Override
    public void addBooking(Booking booking) {
        repositary.save(mapper.map(booking, BookingEntity.class));
    }

    @Override
    public void deleteById(Integer id) {

    }
}
