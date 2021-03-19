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
public class Usuario implements Serializable {

    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 32, nullable = false, unique = true)
    private String usuario;

    @Column(length = 64, nullable = false, unique = true)
    private String email;

    @NotAudited
    @Column(length = 32, nullable = false)
    private String senha;
    
   
    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }


    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", usuario=" + usuario + ", email=" + email + ", senha=" + senha + '}';
    }

}