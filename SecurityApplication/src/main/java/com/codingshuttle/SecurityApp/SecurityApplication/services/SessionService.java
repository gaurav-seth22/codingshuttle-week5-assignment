package com.codingshuttle.SecurityApp.SecurityApplication.services;


import com.codingshuttle.SecurityApp.SecurityApplication.entities.SessionEntity;
import com.codingshuttle.SecurityApp.SecurityApplication.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Transactional
    public void createSession(Long userId,String token){
        if(sessionRepository != null && sessionRepository.existsByUserId(userId)) {
            sessionRepository.deleteByUserId(userId);
        }

        SessionEntity saveSession= new SessionEntity(userId,token);

        sessionRepository.save(saveSession);
    }

    public boolean isValidToken(String token){
         Optional<SessionEntity> session=sessionRepository.findByToken(token);
         return session.isPresent();
    }

    @Transactional
    public void removeSession(Long userId){
        sessionRepository.deleteByUserId(userId);
    }
}
