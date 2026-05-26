package ar.edu.unahur.obj2.decoradores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class ArtesMarciales extends EntrenamientoDecorator {

    public ArtesMarciales(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getHabilidad(){
        return Math.min(100, profugo.getHabilidad()*2);

    }


}
