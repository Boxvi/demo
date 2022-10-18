package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "persona")
@Data
@AllArgsConstructor
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer per_id;
    private String perNombre;
    private String perApellido;
    private String perDireccion;
    private String perCelular;
    private String perCorreo;
    private String perCedula;
    private Integer perEdad;

    public Persona() {

    }
}
