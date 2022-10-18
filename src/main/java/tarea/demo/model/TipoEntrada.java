package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipoentrada")
@Data
@AllArgsConstructor
public class TipoEntrada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tie_id;
    private String tieNombre;
    private String tieCaracteristica;

    public TipoEntrada() {
    }
}
