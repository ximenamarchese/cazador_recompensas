package ar.edu.unahur.obj2.zonas;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugos.IProfugo;
import ar.edu.unahur.obj2.profugos.Profugo;

public class Zona {
    private String nombre;
    private List<Profugo> profugos;

    public Zona(String nombre) {
        this.nombre = nombre;
        this.profugos = new ArrayList<>();
    }

    public void agregarProfugo(Profugo profugo) {
        profugos.add(profugo);
    }

    public List<Profugo> getProfugos() {
        return profugos;
    }


}
