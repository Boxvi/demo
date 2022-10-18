package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ubicacion")
@Data
@AllArgsConstructor
public class Ubicacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ubi_id;

    private String ubiNombre;
    private String ubiCiudad;
    private String ubiAereopuerto;
    private String ubiLatitud;
    private String ubiLongitud;


    public Ubicacion() {
    }
}