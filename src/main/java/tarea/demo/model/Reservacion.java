package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "reservacion")
@Data
@AllArgsConstructor
public class Reservacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer res_id;
    private Date resFecha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pas_id")
    private Pasajero pasajero;

    public Reservacion() {

    }
}