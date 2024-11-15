import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Estudiante {

    
    @NotNull(message = "El nombre no puede ser nulo")
    @Column(length = 50, nullable = false) 
    String nombre;
    
    @Id
    @NotNull(message = "El CIF no puede ser nulo")
    @Column(length = 100, nullable = false)  
    String ciff;

    @NotNull(message = "La carrera no puede ser nula")
    @Column(length = 100, nullable = false) 
    String carrera;

    @NotNull(message = "El correo no puede ser nulo")
    @Size(min = 10, message = "El email debe tener como mínimo 10 caracteres")
    @Email(message = "El correo electrónico no es válido")
    @Column(length = 100, nullable = false) 
    String correo;
}
