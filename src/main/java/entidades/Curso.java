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
public class Curso implements Serializable {

    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 32, nullable = false, unique = true)
    private String nomeCurso;

    @Column(length = 64, nullable = false, unique = true)
    private double creditos;
    
    @Column(length = 64, nullable = false, unique = true)
    private double mensalidade;

    @NotAudited
    @Column(length = 32, nullable = false)
    private Disciplina[] disciplinas;
    
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnomeCurso() {
        return nomeCurso;
    }

    public void setnomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }
    
    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Disciplina[] getDisciplinas() {
    	return disciplinas;
    }
    
    public void setDisciplinas(Disciplina disciplina) {
    	int quantidadedisciplinas = this.disciplinas.length;
    	this.disciplinas[quantidadedisciplinas] = disciplina;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }


    @Override
    public String toString() {
        return "Curso{" + ", nomeCurso=" + nomeCurso + ", creditos=" + creditos + '}';
    }

}