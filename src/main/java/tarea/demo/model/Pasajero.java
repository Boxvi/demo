package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pasajero")
@Data
@AllArgsConstructor
public class Pasajero implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pas_id;
    private String pasPesoEquipaje;
    private String pasMetPago;

    public Pasajero() {

    }
}
