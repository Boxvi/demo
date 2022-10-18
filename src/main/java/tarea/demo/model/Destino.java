package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "destino")
@Data
@AllArgsConstructor
public class Destino implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer des_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ubi_id")
    private Ubicacion ubicacion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "res_id")
    private Reservacion reservacion;

    public Destino() {

    }
}
