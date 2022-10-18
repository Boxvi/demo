package tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "avion")
@Data
@AllArgsConstructor
public class Avion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer avi_id;
    private String aviNombre;
    private Date aviFIncripcion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tia_id")
    private TipoAvion tipoAvion;

    public Avion() {

    }
}