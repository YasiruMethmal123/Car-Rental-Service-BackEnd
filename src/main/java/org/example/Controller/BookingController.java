package org.example.Controller;

import org.example.Dto.Booking;
import org.example.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingService service;

    @GetMapping("/getBooking")
    public List<Booking> getBooking(){
        return service.getBooking();
    }

    @PostMapping("/addBooking")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody Booking booking){
        service.addBooking(booking);
    }

    @DeleteMapping("/deleteBookingById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        service.deleteById(id);
    }

    @PutMapping("/updateBooking")
    @ResponseStatus(HttpStatus.OK )
    public void updateUser(@RequestBody Booking booking){
        service.addBooking(booking);
    }
}
