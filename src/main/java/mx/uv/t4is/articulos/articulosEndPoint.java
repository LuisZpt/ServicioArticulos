package mx.uv.t4is.articulos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class articulosEndPoint {
    @Autowired
    IInventario iInventario;

    @Autowired
    IPrestamo iPrestamo;

    @GetMapping("/articulos")
    public List<Inventario> verInventario(){
        List<Inventario> ret = new ArrayList<>();
        Iterable<Inventario> inventario = iInventario.findAll();
        for(Inventario inv : inventario){
            ret.add(inv);
        }
        return ret;
    }
    /*

    ----------------------------- Ejemplo JSON para envío y guardado de articulo ----------------------

    {
        "nombre":"Control 106",
        "tipo":"Audiovisual",
        "lugar":"Centro de cómputo"
    }

    */

    @PostMapping("/articulos")
    public void guardarArticulo(@RequestBody Inventario inv){
        iInventario.save(inv);
    }

    @GetMapping("/prestamos")
    public List<Prestamo> verPrestamos(){
        List<Prestamo> ret = new ArrayList<>();
        Iterable<Prestamo> prestamo = iPrestamo.findAll();
        for(Prestamo pres : prestamo){
            ret.add(pres);
        }
        return ret;
    }

    /*

    ----------------------------- Ejemplo JSON para envío y guardado de prestamo ----------------------
    {
        "articuloPrestado":"Control 106",
        "prestatario":"zS18014524",
        "lugarP":"Aula 106",
        "horaPrestamo":"16:02"
    }

    */

    @PostMapping("/prestamos")
    public void guardarPrestamo(@RequestBody Prestamo pres){
        iPrestamo.save(pres);
    }
}
