package lk.ijse.gdse.aad_filal_projdet.service;

import lk.ijse.gdse.aad_filal_projdet.reqandresp.response.JwtAuthResponse;
import lk.ijse.gdse.aad_filal_projdet.reqandresp.secure.SignIn;
import lk.ijse.gdse.aad_filal_projdet.reqandresp.secure.SignUp;
import org.springframework.stereotype.Component;


public interface AuthenticationService {
    JwtAuthResponse signIn(SignIn signIn);
    JwtAuthResponse signUp(SignUp signUp);
    JwtAuthResponse refreshToken(String accessToken);
}
