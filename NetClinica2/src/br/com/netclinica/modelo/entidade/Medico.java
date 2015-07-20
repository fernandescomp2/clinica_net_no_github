package br.com.netclinica.modelo.entidade;

public class Medico {
	
	//ATRIBUTOS
			private long id;
			private String crm;
			private String nome;
			private String rg;
			private String cpf;
				
			private Endereco endereco;
			private Contato contato;
			
			
	//CONSTRUTORES
			
			//Método cronstrudor de Médico - sem endereço e contato
			public Medico(long id, String crm, String nome, String rg, String cpf) {
				this(crm,nome, rg, cpf);
				this.id = id;

			}

			//Método cronstrudor de Médico - sem id, endereço e contato
			public Medico(String crm, String nome, String rg, String cpf) {
				this();
				this.crm = crm;
				this.nome = nome;
				this.rg = rg;
				this.cpf = cpf;
			}
			
			//Método cronstrudor de Médico - padão
			public Medico() {
				super();
			}
			

			
	//GETS E SETS		

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getCrm() {
				return crm;
			}

			public void setCrm(String crm) {
				this.crm = crm;
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
				result = prime * result + ((crm == null) ? 0 : crm.hashCode());
				result = prime * result + (int) (id ^ (id >>> 32));
				result = prime * result + ((nome == null) ? 0 : nome.hashCode());
				result = prime * result + ((rg == null) ? 0 : rg.hashCode());
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
				Medico other = (Medico) obj;
				if (cpf == null) {
					if (other.cpf != null)
						return false;
				} else if (!cpf.equals(other.cpf))
					return false;
				if (crm == null) {
					if (other.crm != null)
						return false;
				} else if (!crm.equals(other.crm))
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
				return true;
			}
			

	//TO STRING
			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("Medico [id=").append(id)
						.append(", crm=").append(crm)
						.append(", nome=").append(nome)
						.append(", rg=").append(rg)
						.append(", cpf=").append(cpf)
						.append(", endereco=").append(endereco)
						.append(", contato=").append(contato)
						.append("]");
				return builder.toString();
			} 
			


	}