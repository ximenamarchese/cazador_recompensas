package ar.edu.unahur.obj2.decoradores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public abstract class EntrenamientoDecorator implements IProfugo {
    protected final IProfugo profugo;

    public EntrenamientoDecorator(IProfugo profugo){
        this.profugo = profugo;
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugo.dejarDeEstarNervioso();
        
    }

    @Override
    public Boolean esNervioso() {
        return profugo.esNervioso();
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
    }

    @Override
    public Integer getInocencia() {
        return profugo.getInocencia();
    }

    @Override
    public void reducirHabilidad() {
        profugo.reducirHabilidad();
        
    }

    @Override
    public void seIntimida() {
        profugo.seIntimida();
        
    }

    @Override
    public void volverseNervioso() {
        profugo.volverseNervioso();   
    }

}
