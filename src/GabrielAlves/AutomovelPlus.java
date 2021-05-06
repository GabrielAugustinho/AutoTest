package GabrielAlves;

// Herança
public class AutomovelPlus extends Automovel {
	// Atributos
	private boolean Gps;
	private boolean Bluetooth;
	private boolean CadeirinhaBebe;
	private boolean SensorEstacionamento;

	// Construtores
    public AutomovelPlus() {
		super();
	}
    
	public AutomovelPlus(String marca, String modelo, int ano, String cor, String combustivel, double preco_custo) {
		super(marca, modelo, ano, cor, combustivel, preco_custo);
	}
	
	// Métodos
	public boolean isGps() {
		return Gps;
	}

	public void setGps(boolean gps) {
		Gps = gps;
	}

	public boolean isBluetooth() {
		return Bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		Bluetooth = bluetooth;
	}

	public boolean isSensorEstacionamento() {
		return SensorEstacionamento;
	}

	public void setSensorEstacionamento(boolean sensorEstacionamento) {
		SensorEstacionamento = sensorEstacionamento;
	}

	public boolean isCadeirinhaBebe() {
		return CadeirinhaBebe;
	}

	public void setCadeirinhaBebe(boolean cadeirinhaBebe) {
		CadeirinhaBebe = cadeirinhaBebe;
	}
	
	// Sobrecarga
	@Override
	public String toString() {
		return "DADOS DO AUTOMÓVEL PLUS:\n" +
			   "Marca: " + Marca + "\n" +
			   "Modelo: " + Modelo + "\n" +
			   "Ano: " + Ano + "\n" +
			   "Cor: " + Cor + "\n" +
			   "Combustível: " + Combustivel + "\n" +
			   "Preço original: R$ " + Preco_custo + "\n\n" + 
			   "Usa GPS: " + Gps + "\n" +
			   "Usa Bluetooth: " + Bluetooth +"\n" +
			   "Usa Sensor: " + SensorEstacionamento + "\n" +
			   "Usa cadeirinha: " + CadeirinhaBebe + "\n" +
			   "Preço de saída: R$ " + quantoCusta();
	}
	
	// Método do preço conceito de sobrecarga
	@Override
    public double quantoCusta() {
			double precoVenda;
			
			switch (Combustivel) {
			  case "GASOLINA":
			    precoVenda = Preco_custo * 0.075 ;
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
			
			if(Gps = true) {
				precoVenda += 780.0;				
			}
			
			if(Bluetooth == true) {
				precoVenda += 450.0;
			}
			
			if(SensorEstacionamento == true) {
				precoVenda += 1180.0;
			}
			
			if(CadeirinhaBebe == true) {
				precoVenda += 380.0;
			}
			    
			return precoVenda;
	}
	
}
