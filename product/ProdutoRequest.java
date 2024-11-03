import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequest {
    private String id;
    private String nome;
    private Double preco;
    private Integer quantidade;
}
