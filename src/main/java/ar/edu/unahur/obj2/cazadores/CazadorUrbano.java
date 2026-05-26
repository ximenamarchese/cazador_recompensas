package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugos.IProfugo;

public class CazadorUrbano extends Cazador {

    @Override
    protected Boolean condicionEspecifica(IProfugo unProfugo) {
        return !unProfugo.esNervioso();
    }

    @Override
    protected void intimidacionEspecifica(IProfugo unProfugo) {
        unProfugo.dejarDeEstarNervioso();
    }
    

}
