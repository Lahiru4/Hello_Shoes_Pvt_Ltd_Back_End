package lk.ijse.gdse.aad_filal_projdet.dto;


import lk.ijse.gdse.aad_filal_projdet.Enum.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private int id;
    private String email;
    private Role role;
    private String username;
    private String password;
}
