package lk.ijse.gdse.aad_filal_projdet.service.impl;

import jakarta.transaction.Transactional;
import lk.ijse.gdse.aad_filal_projdet.dto.UserDTO;
import lk.ijse.gdse.aad_filal_projdet.repo.UserRepo;
import lk.ijse.gdse.aad_filal_projdet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Transactional
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;


    @Override
    public UserDetailsService userDetailsService() {
        return username ->
                userRepo.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

    @Override
    public void save(UserDTO user) {

    }
}
