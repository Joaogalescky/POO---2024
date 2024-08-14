package Atv1_B2;

public class Brinquedo {
    // Atributos
    private String nome;
    private String faixaEtaria;
    private float preco;

    // Construtores
    public Brinquedo() {
        this.faixaEtaria = "Indefinida";
    }

    public Brinquedo(String nome, String faixaEtaria, float preco) {
        this.nome = nome;
        this.preco = preco;
        setFaixaEtaria(faixaEtaria); // Validação da faixa etária
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        if (faixaEtaria.equals("0 a 2") || faixaEtaria.equals("3 a 5") || faixaEtaria.equals("6 a 10")
                || faixaEtaria.equals("acima de 10")) {
            this.faixaEtaria = faixaEtaria;
        } else {
            this.faixaEtaria = "Inválida";
        }
    }
}