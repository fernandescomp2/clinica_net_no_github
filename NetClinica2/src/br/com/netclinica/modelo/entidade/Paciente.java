/**
 * 
 */
package br.com.netclinica.modelo.entidade;

/**
 * @author fernandes001
 *
 */
public class Paciente {
	
//ATRIBUTOS
	private long id;
	private String nome;
	private String rg;
	private String cpf;
		
	private SexoType sexo;
	private Endereco endereco;
	private Contato contato;
	
	
//CONSTRUTORES
	//M�todo cronstrudor de Paciente - completo
	public Paciente(long id, String nome, String rg, String cpf, SexoType sexo,	Endereco endereco, Contato contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	//M�todo cronstrudor de Paciente - sem endere�o e contato
	public Paciente(long id, String nome, String rg, String cpf, SexoType sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	//M�todo cronstrudor de Paciente - sem id, endere�o e contato
	public Paciente(String nome, String rg, String cpf, SexoType sexo) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	
//GETS E SETS
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public SexoType getSexo() {
		return sexo;
	}

	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	
//HASH CODE E EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}
	
	
//TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [id=").append(id)
				.append(", nome=").append(nome)
				.append(", rg=").append(rg)
				.append(", cpf=").append(cpf)
				.append(", sexo=").append(sexo)
				.append(", endereco=").append(endereco)
				.append(", contato=").append(contato)
				.append("]");
		return builder.toString();
	}
	
}