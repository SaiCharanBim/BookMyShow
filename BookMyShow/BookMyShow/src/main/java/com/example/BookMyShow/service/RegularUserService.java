package com.example.BookMyShow.service;

import com.example.BookMyShow.dto.request.RegularUserSignUpDTO;
import com.example.BookMyShow.models.ApplicationUser;
import com.example.BookMyShow.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegularUserService {
    @Autowired
    ApplicationUserRepository applicationUserRepository;
    public ApplicationUser signup(RegularUserSignUpDTO regularUserSignupDTO){
        ApplicationUser user = new ApplicationUser();
        user.setAge(regularUserSignupDTO.getAge());
        user.setName(regularUserSignupDTO.getName());
        user.setEmail(regularUserSignupDTO.getEmail());
        user.setPassword(regularUserSignupDTO.getPassword());
        user.setPhoneNumber(regularUserSignupDTO.getPhoneNumber());
        user.setType(regularUserSignupDTO.getType().toString());
        applicationUserRepository.save(user);
        return user;
    }

    public ApplicationUser getUserByEmail(String email){
        return applicationUserRepository.findByEmail(email);
    }
}
