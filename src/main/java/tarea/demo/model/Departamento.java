package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "departamento")
@Data
@AllArgsConstructor
public class Departamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dep_id;
    private String depDescripcion;
    private String depNombre;

    public Departamento() {

    }
}
