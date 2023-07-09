package com.cdac.lelogaadi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.lelogaadi.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
