package org.example.Repositary;

import org.example.Entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity,Integer> {
}
