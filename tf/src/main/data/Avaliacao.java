package main.data;

public class Avaliacao {

    private String idAvaliacao;
    private double nota;
    private String descricao;
    private String data;

    public Avaliacao(String idAvaliacao, double nota, String descricao, String data) {
        this.idAvaliacao= idAvaliacao;
        this.nota = nota;
        this.descricao = descricao;
        this.data = data;
    }

    public String getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(String idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "idAvaliacao='" + idAvaliacao + '\'' +
                ", nota=" + nota +
                ", descricao='" + descricao + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
