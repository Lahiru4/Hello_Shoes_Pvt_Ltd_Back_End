package lk.ijse.gdse.aad_filal_projdet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ResponseDTO implements Serializable {
    private String code;
    private String message;
    private Object content;
}