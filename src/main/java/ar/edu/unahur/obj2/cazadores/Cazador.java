package ar.edu.unahur.obj2.cazadores;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ar.edu.unahur.obj2.profugos.IProfugo;
import ar.edu.unahur.obj2.zonas.Zona;

public abstract class Cazador {
    protected Integer experiencia = 0;
    private List<IProfugo> profugosCapturados = new ArrayList<>();
    private List<IProfugo> profugosIntimidados = new ArrayList<>();

    public Cazador(Integer experiencia) {}

    public List<IProfugo> getProfugosCapturados() {
        return profugosCapturados;
    }

    public void cazarProfugo(Zona zona){
        zona.getProfugos().stream().forEach(unProfugo -> {
            if(sePuedeCazar(unProfugo)) {
                zona.profugoCapturado(unProfugo);
                capturarAlProfugo(unProfugo);
                this.experiencia = profugosIntimidados.stream().min(Comparator.comparing(p -> p.getHabilidad())).get().getHabilidad() +  2 * profugosCapturados.size();
            }
            else {
                intimidar(unProfugo);
            }
        });

    }

    protected Boolean sePuedeCazar(IProfugo unProfugo) {
        return Boolean.valueOf(unProfugo.getInocencia() < this.experiencia) && condicionEspecifica(unProfugo);
    }

    protected abstract Boolean condicionEspecifica(IProfugo unProfugo);
    protected abstract void intimidacionEspecifica(IProfugo unProfugo);

    protected void intimidar(IProfugo unProfugo){
        unProfugo.seIntimida(); 
        intimidacionEspecifica(unProfugo);
        profugosIntimidados.add(unProfugo);
    }

    protected void capturarAlProfugo(IProfugo unProfugo){
        profugosCapturados.add(unProfugo);
    }



}
