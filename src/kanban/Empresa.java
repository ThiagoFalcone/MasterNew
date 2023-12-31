package kanban;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nomeEmpresa;
    private List<Projeto> projetos;  
    
    // Construtor
    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    // Getter e Setter para nomeEmpresa
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adicionarProjeto(Projeto projeto) {
        if (projetos == null) {
            projetos = new ArrayList<>();
        }
        projetos.add(projeto);
    }
}
