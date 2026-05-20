package ar.edu.unahur.obj2.cazadores;
import ar.edu.unahur.obj2.profugos.IProfugo;
import ar.edu.unahur.obj2.zonas.Zona;

//Aplico template method para los cazadores
public abstract class Cazador {
    private Double experiencia = 0.0;

    public final void cazar(Zona zona){
        for (IProfugo profugo : zona.getProfugos()) {
            if (puedeCapturar(profugo)) {
                System.out.println("Capturado");
            } else {
                intimidar(profugo);
            }
        }
    }

    public final Boolean puedeCapturar(IProfugo profugo) {
        return experiencia > profugo.getInocencia()
              && cumpleCondicion(profugo);
    }

    public abstract Boolean cumpleCondicion(IProfugo profugo);

    public void intimidar(IProfugo profugo) {
        profugo.disminuirInocencia();
    }

    public Double getExperiencia() {
        return this.experiencia;
    };   
    
}
