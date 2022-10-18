package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "itinerarios")
@Data
@AllArgsConstructor
public class Itinerarios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iti_id;
    private double itiHorarios;
    private String itiModalidad;

    public Itinerarios() {

    }
}
