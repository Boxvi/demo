package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipoavion")
@Data
@AllArgsConstructor
public class TipoAvion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tia_id;

    private String tiaNombre;
    private String tiaPeso;
    private String tiaCapacidad;
    private String tiaDescripcion;

    public TipoAvion() {

    }
}