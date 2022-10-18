package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rutavuelo")
@Data
@AllArgsConstructor
public class RutaVuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rtv_id;
    private double rtvTiempo;
    private String rtvEstado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vul_id")
    private Vuelo vuelo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iti_id")
    private Itinerarios itinerarios;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "org_id")
    private Origen origen;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "des_id")
    private Destino destino;


    public RutaVuelo() {

    }
}
