import java.util.List;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    //Construtor
    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    //Getters
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    //toString

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                " valor =" + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
