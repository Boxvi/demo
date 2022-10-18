package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "asiento")
@Data
@AllArgsConstructor
public class Asiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer asi_id;
    private String asiUbicacion;
    private String asiNumero; //Los numeros de los asientos suelen ser algo como B77

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "avi_id")
    private Avion avion;

    public Asiento() {

    }
}