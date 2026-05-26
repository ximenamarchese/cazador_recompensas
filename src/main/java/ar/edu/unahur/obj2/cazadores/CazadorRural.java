package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugos.IProfugo;


public class CazadorRural extends Cazador{

	@Override
	protected Boolean condicionEspecifica(IProfugo unProfugo) {
		return unProfugo.esNervioso();
	}

	@Override
	protected void intimidacionEspecifica(IProfugo unProfugo) {
		unProfugo.esNervioso();
	}


}
