package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "resasiento")
@Data
@AllArgsConstructor
public class ResAsiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rea_id;
    private String reaFecha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "asi_id")
    private Asiento asiento;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "res_id")
    private Reservacion reservacion;


    public ResAsiento() {

    }
}