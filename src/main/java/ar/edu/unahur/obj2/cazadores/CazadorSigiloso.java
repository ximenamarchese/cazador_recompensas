package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorSigiloso extends Cazador {

    @Override
    protected Boolean condicionEspecifica(IProfugo unProfugo) {
        return unProfugo.getHabilidad() < 50;
    }

}
