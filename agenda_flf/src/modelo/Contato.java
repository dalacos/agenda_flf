package modelo;

public class Contato {
	
	private String nome;
	private String tel;
	
	Contato(){
		
		
		
	}

	Contato(String tel){
		this.nome = nome;
		this.tel = tel ; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void mostraContato() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.tel);
		
		
	}
	
}
	
