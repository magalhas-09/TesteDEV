import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="lougradouro")
	private String lougradouro;
	
	@Column(name="numero")
	private Integer numero;
	
	private Pessoa pessoa;
	
	public Endereco () {
		
	}
	
	public Endereco(int id, String descricao, String estado, String cidade, String lougradouro, Integer numero,
			Pessoa pessoa) {
		this.id = id;
		this.descricao = descricao;
		this.estado = estado;
		this.cidade = cidade;
		this.lougradouro = lougradouro;
		this.numero = numero;
		this.pessoa = pessoa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLougradouro() {
		return lougradouro;
	}

	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidade, descricao, estado, id, lougradouro, numero, pessoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(estado, other.estado) && id == other.id
				&& Objects.equals(lougradouro, other.lougradouro) && Objects.equals(numero, other.numero)
				&& Objects.equals(pessoa, other.pessoa);
	}
}
