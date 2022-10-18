package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vuelo")
@Data
@AllArgsConstructor
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vul_id;
    private double vulNombre;
    private String vulKilometraje;

    public Vuelo() {

    }
}
