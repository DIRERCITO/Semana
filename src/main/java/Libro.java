import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.*;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Libro {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Hidden
    private String codigo;

    @Column(length = 100, nullable = false)
    @NotNull(message = "El ISBN es obligatorio")
    @Size(max = 100, message = "El ISBN no puede tener m�s de 100 caracteres")
    private String isbn;

    @Column(length = 200, nullable = false)
    @NotNull(message = "El t�tulo es obligatorio")
    @Size(max = 200, message = "El t�tulo no puede tener m�s de 200 caracteres")
    private String titulo;

    @Column(length = 100, nullable = false)
    @NotNull(message = "El autor es obligatorio")
    @Size(max = 100, message = "El autor no puede tener m�s de 100 caracteres")
    private String autor;

    @Column(nullable = false)
    @NotNull(message = "La fecha de publicaci�n es obligatoria")
    private LocalDate fechaPublicacion;
}

