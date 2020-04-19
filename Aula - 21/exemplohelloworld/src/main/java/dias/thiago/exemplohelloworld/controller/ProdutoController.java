package dias.thiago.exemplohelloworld.controller;

import dias.thiago.exemplohelloworld.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/produtos")
    public String getProducts() {
        return "Área do produto!";
    }

    @GetMapping("/produto")
    public Produto getProduct() {
        Produto produto = new Produto();
        produto.setDescricao("Álcool em gel");
        return produto;
    }
}
