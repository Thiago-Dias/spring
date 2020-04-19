package dias.thiago.exemplohelloworld.model;

/**
 * @Thiago Dias
 * @version 1.0
 * @since 18/04/2020 - 10:46
 */

public class Cliente {

    private String nome;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
