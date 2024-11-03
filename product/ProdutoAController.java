import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produto-a")
public class ProdutoAController {

    private final ProdutoAService produtoAService;

    public ProdutoAController(ProdutoAService produtoAService) {
        this.produtoAService = produtoAService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarProduto(@RequestBody ProdutoRequest produtoRequest) {
        produtoAService.enviarProduto(produtoRequest);
        return ResponseEntity.ok("Produto enviado com sucesso");
    }
}
