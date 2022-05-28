package mx.uv.t4is.articulos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String articuloPrestado;
    private String prestatario;
    private String lugarP;
    private String horaPrestamo;

    public Prestamo() {}

    public int getId() {
        return this.id;
    }

    public void setIdPrestamo(int id) {
        this.id = id;
    }

    public String getArticuloPrestado() {
        return this.articuloPrestado;
    }

    public void setArticuloPrestado(String articuloPrestado) {
        this.articuloPrestado = articuloPrestado;
    }

    public String getPrestatario() {
        return this.prestatario;
    }

    public void setPrestatario(String prestatario) {
        this.prestatario = prestatario;
    }

    public String getLugarP() {
        return this.lugarP;
    }

    public void setLugarP(String lugarP) {
        this.lugarP = lugarP;
    }

    public String getHoraPrestamo() {
        return this.horaPrestamo;
    }

    public void setHoraPrestamo(String horaPrestamo) {
        this.horaPrestamo = horaPrestamo;
    }
}