package GabrielAlves;

public class Automovel {
	// Atributos
	public String Cor;
    public String Marca;
	public String Modelo;
	public String Combustivel;
	
	public int Ano;
    public double Preco_custo;
	
	// Construtores
	public Automovel() {}
	public Automovel(String marca, String modelo, int ano, String cor, String combustivel, double preco_custo) {
		Marca = marca;
		Modelo = modelo;
		Ano = ano;
		Cor = cor;
		Combustivel = combustivel;
		Preco_custo = preco_custo;
	}
	
	// Métodos para visualizar e alterar os valores
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getCombustivel() {
		return Combustivel;
	}
	public void setCombustivel(String combustivel) {
		Combustivel = combustivel;
	}
	public double getPreco_custo() {
		return Preco_custo;
	}
	public void setPreco_custo(double preco_custo) {
		Preco_custo = preco_custo;
	}	
	
	// Método que retorna os valores
	public String toString() {
		return "DADOS DO AUTOMÓVEL:\n" +
			   "Marca: " + Marca + "\n" +
			   "Modelo: " + Modelo + "\n" +
			   "Ano: " + Ano + "\n" +
			   "Cor: " + Cor + "\n" +
			   "Combustível: " + Combustivel + "\n" +
			   "Preço original: R$ " + Preco_custo + "\n" +
			   "Preço de saída: R$ " + quantoCusta();
	}
	
	// Método do preço
	public double quantoCusta() {
		double precoVenda;
		
		switch (Combustivel) {
		  case "GASOLINA":
		    precoVenda = Preco_custo * 0.075;
		    break;
		  case "ALCOOL":
			precoVenda = Preco_custo * 0.10;
		    break;
		  case "DIESEL":
			precoVenda = Preco_custo * 0.175;
		    break;
		  case "GNV":
			precoVenda = Preco_custo * 0.23;
			break;
		  default:
			precoVenda = Preco_custo * 0.15; 
		}
		    
		return precoVenda;
	}
}
