package lk.ijse.gdse.aad_filal_projdet.reqandresp.secure;

import lk.ijse.gdse.aad_filal_projdet.Enum.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SignUp {

    private int id;
    private String email;
    private String username;
    private String password;
    private Role role;
}

