package entidades;

import java.io.Serializable;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;


@Entity
@Audited
@Cacheable
public class Disciplina implements Serializable {

    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 32, nullable = false, unique = true)
    private String nomeDisciplina;

    @Column(length = 64, nullable = false, unique = true)
    private String codigo;

    @NotAudited
    @Column(length = 32, nullable = false)
    private Usuario[] alunos;
    
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnomeDisciplina() {
        return nomeDisciplina;
    }

    public void setnomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Usuario[] getAlunos() {
    	return alunos;
    }
    
    public void setAlunos(Usuario aluno) {
    	int quantidadeAlunos = this.alunos.length;
    	if(quantidadeAlunos < 10) {
    		this.alunos[quantidadeAlunos] = aluno;
    	} else {
    		System.out.println("Matrículas encerradas!");
    	}
    }


    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }


    @Override
    public String toString() {
        return "Disciplina{" + ", nomeDisciplina=" + nomeDisciplina + ", codigo=" + codigo + '}';
    }

}