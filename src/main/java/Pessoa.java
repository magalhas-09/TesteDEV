import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Pessoa {
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(name="nome")
	private String nome;

	@Column(name="idade")
	private Integer idade;
	
	@Column(name="sexo")
	private String sexo;
	
	public Pessoa () {
		
	}
	
	public Pessoa(Long id, String nome, Integer idade, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, idade, nome, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(sexo, other.sexo);
	}
}
