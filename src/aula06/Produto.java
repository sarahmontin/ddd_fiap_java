package aula06;

public class Produto {

    private String nome;
    private double preço;
    private int quantidadeEstoque;

    public Produto() {
        this.nome = "Sem nome";
        this.preço = 0.0;
        this.quantidadeEstoque = 0;
    }


    public Produto(String nome, double preço, int quantidadeEstoque) {
        this.nome = nome;
        this.preço = preço;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirDetalhe() {
        System.out.println("----Detalhe do produto----");
        System.out.println("Nome: " + this.nome);
        System.out.println("preço: " + this.preço);
        System.out.println("Quantidade no Estoque: " + this.quantidadeEstoque);
    }

    public boolean adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidadeEstoque += qtd;
            return true;
        } else {
            return false;
        }
    }

    public boolean realizarVenda(int qtd){
        if (qtd > 0 && qtd <- this.quantidadeEstoque) {
            return true;
        }else{
            return false;
        }
    }
}
