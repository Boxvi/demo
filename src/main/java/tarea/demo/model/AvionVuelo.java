package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "avionvuelo")
@Data
@AllArgsConstructor
public class AvionVuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer avv_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vul_id")
    private Vuelo vuelo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "avi_id")
    private Avion avion;

    public AvionVuelo() {

    }
}
