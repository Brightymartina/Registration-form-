package com.example.regform;

import com.example.regform.registration;
import java.util.*;

public interface registrationService {

    public List<registration> getAll();

    public registration save(registration r);

    public registration find(int id);

    public void delete(int id);

}