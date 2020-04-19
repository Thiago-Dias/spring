package dias.thiago.exemplohelloworld.model;

/**
 * @Thiago Dias
 * @version 1.0
 * @since 18/04/2020 - 10:46
 */

public class Produto {

    private String descricao;

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
