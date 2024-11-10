package org.example.Service;

import org.example.Dto.Payment;
import java.util.List;

public interface PaymentService {
    List<Payment> getPayment();
    void addPayment(Payment payment);
    void deleteById(Integer id);
}
