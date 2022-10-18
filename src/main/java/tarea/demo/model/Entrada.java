package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "entrada")
@Data
@AllArgsConstructor
public class Entrada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ent_id;
    private Date entFecha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clv_id")
    private ClaseViaje claseViaje;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "res_id")
    private Reservacion reservacion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tie_id")
    private TipoEntrada tipoEntrada;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rtv_id")
    private RutaVuelo rutaVuelo;

    public Entrada() {

    }
}
