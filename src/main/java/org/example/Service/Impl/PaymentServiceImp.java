package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Payment;
import org.example.Entity.PaymentEntity;
import org.example.Repositary.PaymentRepository;
import org.example.Service.PaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentServiceImp implements PaymentService {

    final PaymentRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Payment> getPayment() {
        List<Payment> paymentList = new ArrayList<>();
        repository.findAll().forEach(payment ->paymentList.add(mapper.map(payment, Payment.class)));
        return paymentList;
    }

    @Override
    public void addPayment(Payment payment) {
        repository.save(mapper.map(payment, PaymentEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
