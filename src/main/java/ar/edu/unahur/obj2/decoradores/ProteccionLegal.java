package ar.edu.unahur.obj2.decoradores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class ProteccionLegal extends EntrenamientoDecorator {

    public ProteccionLegal(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getInocencia() {
        return Math.max(40, profugo.getInocencia());
    }

}
