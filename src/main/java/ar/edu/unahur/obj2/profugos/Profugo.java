package ar.edu.unahur.obj2.profugos;

public class Profugo implements IProfugo{
    private Integer inocencia;
    private Integer habilidad;
    private Boolean nervioso;

    public Profugo(Integer inocencia, Integer habilidad) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.nervioso = false;
    }

    @Override
    public Integer getInocencia() {
        return inocencia;
    }

    @Override
    public Integer getHabilidad() {
        return habilidad;
    }

    @Override
    public Boolean esNervioso() {
        return nervioso;
    }

    @Override
    public void volverseNervioso() {
        this.nervioso = true;
    }

    @Override
    public void dejarDeEstarNervioso() {
       this.nervioso = false;
    }

    @Override
    public void reducirHabilidad() {
        this.habilidad--;
    }

    @Override
    public void disminuirInocencia() {
      this.inocencia--;
    }

}
