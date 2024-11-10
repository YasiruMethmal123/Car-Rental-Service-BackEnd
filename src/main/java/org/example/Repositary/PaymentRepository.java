package org.example.Repositary;

import org.example.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity,Integer> {
}
