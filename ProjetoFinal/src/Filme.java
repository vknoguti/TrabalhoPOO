
public class Filme {

	
	private String nome;
	private String ano;
	private String diretor;
	private String cartaz;
	private String elenco;
	private int duracao;
	private String classi;
	private boolean dublagem;
	private boolean tresd;
	
	public Filme(String nome, int duracao) {
		
		this.nome = nome;
		this.duracao = duracao;
		this.dublagem = false;
		this.tresd = false;
		this.classi = "L";
		this.ano = "0000";
	}
	
 	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public void setCartaz(String cartaz) {
		this.cartaz = cartaz;
	}
	
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public void setClassi(String classi) {
		this.classi = classi;
	}
	
	public void setDublagem(boolean dublagem) {
		this.dublagem = dublagem;
	}
	
	public void setTresD(boolean tresd) {
		this.tresd = tresd;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getAno() {
		return this.ano;
	}
	
	public String getDiretor() {
		return this.diretor;
	}
	
	public String getCartaz() {
		return this.cartaz;
	}
	
	public String getElenco() {
		return this.elenco;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	
	public String getClassi() {
		return this.classi;
	}
	
	public boolean getDublagem() {
		return this.dublagem;
	}
	
	public boolean getTresD() {
		return this.tresd;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += this.nome + "\n";
		str += "Ano: " + this.ano + "\n";
		str += "Diretor(a): " + this.diretor + "\n";
		str += "Elenco: " + this.elenco + "\n";
		str += "Duracao: " + Integer.toString(this.duracao) + " minutos\n";
		str += "Classificacao Indicativa: " + this.classi + "\n";
		str += "Idiomas disponiveis: Original";
		if(this.dublagem) str += ", Portugues";
		str += "\nOpcao 3D:";
		if(this.tresd) str += "Disponivel\n\n";
		else str += " Indisponivel\n\n";
 		return str;
	}
	
	public boolean equals(Filme f) {
		if(this.nome.equals(f.getNome())) return true;
		return false;
	}



public static void main(String[] args) {
	Filme teste = new Filme("teste", 136);
	teste.setAno("1999");
	teste.setClassi("16");
	teste.setDiretor("Delamaro");
	teste.setDublagem(true);
	teste.setElenco("Rogerio, Samuel, Gabriel, Vinicius");
	teste.setTresD(false);
	
	System.out.println(teste);
}
	
}

