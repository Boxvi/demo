package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Entity
@Table(name = "empleado")
@Data
@AllArgsConstructor
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emp_id;
    private String empCargo;
    private Time empHorario;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dep_id")
    private Departamento departamento;

    public Empleado() {

    }
}
