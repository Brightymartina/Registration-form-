package com.example.regform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.regform.registration;

@Repository("registrationrepository")
public interface registrationRepository extends JpaRepository<registration, Integer> {

}