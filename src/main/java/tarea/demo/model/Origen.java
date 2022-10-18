package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "origen")
@Data
@AllArgsConstructor
public class Origen implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer org_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ubi_id")
    private Ubicacion ubicacion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "res_id")
    private Reservacion reservacion;


    public Origen() {

    }
}
