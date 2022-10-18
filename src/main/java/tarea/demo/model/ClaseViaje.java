package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "claseviaje")
@Data
@AllArgsConstructor
public class ClaseViaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clv_id;
    private double clvPrecio;
    private String clvNombre;

    public ClaseViaje() {
    }
}
