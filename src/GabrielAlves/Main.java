package GabrielAlves;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String combustivel[] = {"ALCOOL", "DIESEL", "GASOLINA", "GNV", "FLEX" };
		String Cor = JOptionPane.showInputDialog(null, "Qual a cor do automóvel?:", "Veículo", 3);
        String Marca = JOptionPane.showInputDialog(null, "Qual a Marca do automóvel?", "Veículo", 3);
		String Modelo = JOptionPane.showInputDialog(null, "Qual o modelo do automóvel?", "Veículo", 3);
		String Combustivel =(String) JOptionPane.showInputDialog(null, "Selecione a forma de combustão:", "Veículo", 3, null,
				combustivel, combustivel[0]);
		
		boolean Gps = false;
		boolean Sensor = false;
        boolean Bluetooth = false;
		boolean Cadeirinha = false;	
		
		int Ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o ano do veículo?", "Veículo", 3));
		
		double PrecoCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual foi o valor de compra?", "Veículo", 3));	   
		
	    if (JOptionPane.showConfirmDialog(null, "Existe items externos?", "Veículo",
				JOptionPane.YES_NO_OPTION, 3) == 0) {
			String Gps_temp = JOptionPane.showInputDialog(null, "GSP?(s/n)", "Veículo", 3);
			
			// Objeto autoPlus na  classe AutomovelPlus
			AutomovelPlus autoPlus = new AutomovelPlus(Marca, Modelo, Ano, Cor, Combustivel, PrecoCompra);
			
			if(Gps_temp.equals("s")) {
				Gps = true;
				autoPlus.setGps(Gps);
			}
			String Bluetooth_temp = JOptionPane.showInputDialog(null, "Bluetooth?(s/n)", "Veículo", 3);
			if(Bluetooth_temp.equals("s")) {
				Bluetooth = true;
				autoPlus.setBluetooth(Bluetooth);
			}
			String SensorEstacionamento_temp = JOptionPane.showInputDialog(null, "Sensor?(s/n)", "Veículo", 3);
			if(SensorEstacionamento_temp.equals("s")) {
				Sensor = true;
				autoPlus.setSensorEstacionamento(Sensor);
			}
			String CadeirinhaBebe_temp = JOptionPane.showInputDialog(null, "Cadeirinha?(s/n)", "Veículo", 3);
			if(CadeirinhaBebe_temp.equals("s")) {
				Cadeirinha = true;
				autoPlus.setCadeirinhaBebe(Cadeirinha);
			}
			
		    JOptionPane.showMessageDialog(null, autoPlus.toString(), "Veículo", 3);

		}
	    else {
	    	// Objeto auto na classe Automovel 
	    	Automovel auto = new Automovel(Marca, Modelo, Ano, Cor, Combustivel, PrecoCompra); 
	    	 JOptionPane.showMessageDialog(null, auto.toString(), "Veículo", 3);
	    }
	    
	}

}
