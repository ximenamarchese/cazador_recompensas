package ar.edu.unahur.obj2.profugos;

public abstract class Profugo implements IProfugo{
    private Integer nivelDeInocencia;
    private Integer nivelDeHabilidad;
    private Boolean esNervioso;

    public Profugo(Integer nivelDeInocencia, Integer nivelDeHabilidad, Boolean esNervioso) {
        this.nivelDeInocencia = nivelDeInocencia;
        this.nivelDeHabilidad = nivelDeHabilidad;
        this.esNervioso = esNervioso;
    }

    @Override
    public String toString() {
        return "Inocencia: " + nivelDeInocencia +
               " | Habilidad: " + nivelDeHabilidad +
               " | Nervioso: " + esNervioso;
    }


    @Override
    public Integer getInocencia() {
        return nivelDeInocencia;
    }

    @Override
    public Integer getHabilidad() {
        return nivelDeHabilidad;
    }

    @Override
    public Boolean esNervioso() {
        return esNervioso;
    }

    @Override
    public void seIntimida() {
        this.nivelDeInocencia = Math.max(0, this.nivelDeInocencia - 2);
    }

    @Override
    public void dejarDeEstarNervioso() {
        this.esNervioso = false;
    }

    @Override
    public void reducirHabilidad() {
        this.nivelDeHabilidad = Math.max(0, this.nivelDeHabilidad -5);
        
    }

    @Override
    public void volverseNervioso() {
        this.esNervioso = true;
    }







}
