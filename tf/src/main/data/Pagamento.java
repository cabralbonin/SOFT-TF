package main.data;

public class Pagamento {

    private String idPagamento;
    private String metodo;

    public Pagamento(String idPagamento, String metodo) {
        this.idPagamento = idPagamento;
        this.metodo = metodo;
    }

    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "idPagamento='" + idPagamento + '\'' +
                ", metodo='" + metodo + '\'' +
                '}';
    }
}
