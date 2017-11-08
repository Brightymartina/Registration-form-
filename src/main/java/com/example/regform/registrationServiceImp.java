package com.example.regform;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.regform.registration;
import com.example.regform.registrationRepository;
import com.example.regform.registrationService;

@Service("registrationService")
public class registrationServiceImp implements registrationService {

    @Autowired
    private registrationRepository registrationrepository;

    @Override
    public List<registration> getAll() {
        // TODO Auto-generated method stub
        return registrationrepository.findAll();
    }

    @Override
    public registration save(registration r) {
        // TODO Auto-generated method stub
        return registrationrepository.saveAndFlush(r);

    }

    @Override
    public registration find(int id) {
        // TODO Auto-generated method stub
        return registrationrepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        registrationrepository.delete(id);
    }

}