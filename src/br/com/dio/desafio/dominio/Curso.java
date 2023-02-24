package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraira;
    @Override
    public double calcularXP() {
        return XP_PADRAO*cargaHoraira;
    }
    public Curso() {
    }

    public int getCargaHoraira() {
        return cargaHoraira;
    }
    public void setCargaHoraira(int cargaHoraira) {
        this.cargaHoraira = cargaHoraira;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraira=" + cargaHoraira +
                '}';
    }



}
