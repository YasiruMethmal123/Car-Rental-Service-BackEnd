package org.example.Controller;

import org.example.Dto.Payment;
import org.example.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class PaymentController {
    @Autowired
    PaymentService service;

    @GetMapping("/getPayment")
    public List<Payment> getBooking(){
        return service.getPayment();
    }

    @PostMapping("/addPayment")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPayment(@RequestBody Payment payment){
        service.addPayment(payment);
    }

    @DeleteMapping("/deletePaymentById/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id){
        service.deleteById(id);
    }

    @PutMapping("/updatePayment")
    @ResponseStatus(HttpStatus.OK )
    public void updatePayment(@RequestBody Payment payment){
        service.addPayment(payment);
    }
}
