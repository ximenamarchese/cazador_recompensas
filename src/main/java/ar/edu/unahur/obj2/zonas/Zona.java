package ar.edu.unahur.obj2.zonas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;


public class Zona {
    private String nombre;
    private List<IProfugo> profugos;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.profugos = new ArrayList<>();
    }

    public void agregarProfugo(IProfugo profugo) {
        profugos.add(profugo);
    }

    public List<IProfugo> getProfugos() {
        return profugos;
    }

    public void profugoCapturado(IProfugo unProfugo) {
        profugos.remove(unProfugo);
    }

    public String getNombre() {
        return nombre;
    }
}
