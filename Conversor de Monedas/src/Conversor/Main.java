package Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {


	
	public static void main(String[] args) {
		
		  
		double valor1 = 1;
		double valor2 = 1;
		String cantidad = "";
		double valorUS = 1;
		double valorEURO = 1;
		double valorPESOARG = 136.16;
		double valorREALBR = 5.19;
		double valorPESOURG = 40.40;
		double valorPESOMEX = 20.20;
		double valorPESOCHI = 944.35;
		double valorPESOCOLM = 4387.33;
		double valorPESODOMI = 53.65;
		double valorRUBLORUS = 59.38;
		double valorLIBRAEST = 0.85;
		double valorGUARANI = 6880.26;
		double valorBOLIVIANO = 6.92;
		double valorBOLVENE = 6.09;
		double valorPESOCUB = 24.01;
		String Nombre1 = "";
		String Nombre2 = "";

		
		Object [] monedas ={"Dolar", "Peso Argentino","Euro","Real","Peso Uruguayo","Peso Mexicano","Peso Chileno","Peso Dominicano", "Rublo Ruso", "Libra Esterlina", "Guarani", "Boliviano", "Bolivar", "Peso Cubano", "Peso Colombiano" }; 
		Object opcion1 = JOptionPane.showInputDialog(null,"Selecciona una Moneda", "Elegir",JOptionPane.QUESTION_MESSAGE,null,monedas, monedas[0]);
		Object opcion2 = JOptionPane.showInputDialog(null,"Selecciona una Moneda", "Elegir",JOptionPane.QUESTION_MESSAGE,null,monedas, monedas[0]);
		cantidad = (JOptionPane.showInputDialog(null, " Introduce Cantidad ", 1));
		
		

	
		if (opcion1.toString().equalsIgnoreCase("Peso Argentino")){
			Nombre1 = "Pesos Argentinos";
			valor1 = valorPESOARG;
			System.out.println("Eligió el Peso Argentino");
			}
		if (opcion1.toString().equalsIgnoreCase("Dolar")){
			Nombre1 = "Dolares";
			valor1 = valorUS;
			System.out.println("Eligió el Dolar");
			}
		if (opcion1.toString().equalsIgnoreCase("Euro")){
			Nombre1 = "Euros";
			valor1 = valorEURO;
			System.out.println("Eligió el EURO");
			}
		if (opcion1.toString().equalsIgnoreCase("Real")){
			Nombre1 = "Reales";
			valor1 = valorREALBR;
			System.out.println("Eligió el REAL");
			}
		if (opcion1.toString().equalsIgnoreCase("Peso Uruguayo")){
			Nombre1 = "Pesos Uruguayos";
			valor1 = valorPESOURG;
			System.out.println("Eligió el Peso Uruguayo");
			}
		if (opcion1.toString().equalsIgnoreCase("Peso Mexicano")){
			Nombre1 = "Pesos Mexicanos";
			valor1 = valorPESOMEX;
			System.out.println("Eligió el Peso Mexicano");
			}
		if (opcion1.toString().equalsIgnoreCase("Peso Chileno")){
			Nombre1 = "Pesos Chilenos";
			valor1 = valorPESOCHI;
			System.out.println("Eligió el Peso Chileno");
			}
		if (opcion1.toString().equalsIgnoreCase("Peso Dominicano")){
			Nombre1 = "Pesos Dominicanos";
			valor1 = valorPESODOMI;
			System.out.println("Eligió el Peso Dominicano");
			}
		if (opcion1.toString().equalsIgnoreCase("Rublo Ruso")){
			Nombre1 = "Rublos Rusos";
			valor1 = valorRUBLORUS;
			System.out.println("Eligió el Peso Rublo Ruso");
			}
		if (opcion1.toString().equalsIgnoreCase("Libra Esterlina")){
			Nombre1 = "Libras Esterlinas";
			valor1 = valorLIBRAEST;
			System.out.println("Eligió el Libra Esterlina");
			}
		if (opcion1.toString().equalsIgnoreCase("Guarani")){
			Nombre1 = "Guaranies";
			valor1 = valorGUARANI;
			System.out.println("Eligió el Guarani");
			}
		if (opcion1.toString().equalsIgnoreCase("Boliviano")){
			Nombre1 = "Bolivianos";
			valor1 = valorBOLIVIANO;
			System.out.println("Eligió el Boliviano");
			}
		if (opcion1.toString().equalsIgnoreCase("Bolivar")){
			Nombre1 = "Bolivares";
			valor1 = valorBOLVENE;
			System.out.println("Eligió el Bolivar");
			}
		if (opcion1.toString().equalsIgnoreCase("Peso Cubano")){
			Nombre1 = "Pesos Cubanos";
			valor1 = valorPESOCUB;
			System.out.println("Eligió el Peso Cubano");
			}
		if (opcion1.toString().equalsIgnoreCase("Peso Colombiano")){
			Nombre1 = "Pesos Colombianos";
			valor1 = valorPESOCOLM;
			System.out.println("Eligió el Peso Colombiano");
			}
		
		
		
		
		
		if (opcion2.toString().equalsIgnoreCase("Peso Argentino")){
			Nombre2 = "Pesos Argentinos";
			valor2 = valorPESOARG;
			System.out.println("Eligió el Peso Argentino");
			}
		if (opcion2.toString().equalsIgnoreCase("Dolar")){
			Nombre2 = "Dolares";
			valor2 = valorUS;
			System.out.println("Eligió el Dolar");
			}
		if (opcion2.toString().equalsIgnoreCase("Euro")){
			Nombre2 = "Euros";
			valor2 = valorEURO;
			System.out.println("Eligió el EURO");
			}
		if (opcion2.toString().equalsIgnoreCase("Real")){
			Nombre2 = "Reales";
			valor2 = valorREALBR;
			System.out.println("Eligió el REAL");
			}
		if (opcion2.toString().equalsIgnoreCase("Peso Uruguayo")){
			Nombre2 = "Pesos Uruguayos";
			valor2 = valorPESOURG;
			System.out.println("Eligió el Peso Uruguayo");
			}
		if (opcion2.toString().equalsIgnoreCase("Peso Mexicano")){
			Nombre2 = "Pesos Mexicanos";
			valor2 = valorPESOMEX;
			System.out.println("Eligió el Peso Mexicano");
			}
		if (opcion2.toString().equalsIgnoreCase("Peso Chileno")){
			Nombre2 = "Pesos Chilenos";
			valor2 = valorPESOCHI;
			System.out.println("Eligió el Peso Chileno");
			}
		if (opcion2.toString().equalsIgnoreCase("Peso Dominicano")){
			Nombre2 = "Pesos Dominicanos";
			valor2 = valorPESODOMI;
			System.out.println("Eligió el Peso Dominicano");
			}
		if (opcion2.toString().equalsIgnoreCase("Rublo Ruso")){
			Nombre2 = "Rublos Rusos";
			valor2 = valorRUBLORUS;
			System.out.println("Eligió el Peso Rublo Ruso");
			}
		if (opcion2.toString().equalsIgnoreCase("Libra Esterlina")){
			Nombre2 = "Libras Esterlinas";
			valor2 = valorLIBRAEST;
			System.out.println("Eligió el Libra Esterlina");
			}
		if (opcion2.toString().equalsIgnoreCase("Guarani")){
			Nombre2 = "Guaranies";
			valor2 = valorGUARANI;
			System.out.println("Eligió el Guarani");
			}
		if (opcion2.toString().equalsIgnoreCase("Boliviano")){
			Nombre2 = "Boliviano";
			valor2 = valorBOLIVIANO;
			System.out.println("Eligió el Boliviano");
			}
		if (opcion2.toString().equalsIgnoreCase("Bolivar")){
			Nombre2 = "Bolivares";
			valor2 = valorBOLVENE;
			System.out.println("Eligió el Bolivar");
			}
		if (opcion2.toString().equalsIgnoreCase("Peso Cubano")){
			Nombre2 = "Pesos Cubanos";
			valor2 = valorPESOCUB;
			System.out.println("Eligió el Peso Cubano");
			}
		if (opcion2.toString().equalsIgnoreCase("Peso Colombiano")){
			Nombre2 = "Pesos Colombianos";
			valor2 = valorPESOCOLM;
			System.out.println("Eligió el Peso Colombiano");
			}
		while (!isNumber(cantidad)) {
			cantidad = JOptionPane.showInputDialog(null,"No es un valor valido, pruebe de nuevo");
		}
		if (cantidad == null) {
			JOptionPane.showMessageDialog(null, "No es un valor valido, pruebe de nuevo");
		}
			if  (Integer.parseInt(cantidad) <= 0) {
			cantidad = "1";
			JOptionPane.showMessageDialog(null, "El valor debe ser un numero y no menor que cero se pondra el valor de 1 como ejemplo");
		
			
		};
		
		
		double conversion = 0;
		 DecimalFormat df = new DecimalFormat("#.00");
		if (valor1 <= valor2) {
			System.out.println("valor1 es mayor que valor2");
			conversion = (valor1*valor2)*Integer.parseInt(cantidad);
			JOptionPane.showMessageDialog(null, cantidad + " " + Nombre1 + " son " + df.format(conversion) + " " + Nombre2 );
		} else if (valor1 >= valor2) {
			System.out.println("valor2 es mayor que valor1");
			conversion = (valor2*Integer.parseInt(cantidad))/valor1;
		    JOptionPane.showMessageDialog(null, cantidad + " " + Nombre1 + " son " + df.format(conversion) + " " + Nombre2 );
		    
	     };
	     int input = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra conversión?");
	     String mensaje = "";
	        switch (input) {
	        case 0:
	            mensaje = "Has pulsado Sí";
	            main(args);
	            
	        case 1:
	            mensaje = "Has pulsado No";
	            JOptionPane.showMessageDialog(null,"Programa Terminado","Alert",JOptionPane.WARNING_MESSAGE);     
	            System.exit(0);
	            break;
	        case 2:
	        	 JOptionPane.showMessageDialog(null,"Programa Terminado","Alert",JOptionPane.WARNING_MESSAGE);     
	            mensaje = "Has pulsado Cancelar";
	            System.exit(0);
	        }
	        JOptionPane.showMessageDialog(null, mensaje);
	}

	private boolean launch() {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean isNumber(String cantidad) {
		try {
			Integer.parseInt(cantidad);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
	}
    }

}
	