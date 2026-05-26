package ar.edu.unahur.obj2.jefe;

import java.util.Comparator;
import java.util.List;

import ar.edu.unahur.obj2.cazadores.Cazador;
import ar.edu.unahur.obj2.profugos.IProfugo;

public class Jefe {
    private String nombre;

    public Jefe(String nombre){
        this.nombre = nombre;
    }

    public void mostrarProfugosCapturados(List<IProfugo> profugosCapturados){
        profugosCapturados.stream().forEach(System.out::println);
    }

    public IProfugo profugoMasHabil(List<IProfugo> profugosCapturados){
        return profugosCapturados.stream().max(Comparator.comparingInt(p -> p.getHabilidad())).orElse(null);
    }

    public Cazador cazadorConMasCapturas(List<Cazador> cazadores){
        return cazadores.stream().max(Comparator.comparingInt(c -> c.getProfugosCapturados().size())).orElse(null);
    }

    

}
