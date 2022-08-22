package Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorMedida {

	public static void ConversorMedida11(String[] args) {
	
		ConversorMedida11(args);
		
		double valor1 = 1;
		double valor2 = 1;
		String cantidad = "";
		double valorMM = 1;
		double valorCM = valorMM/10;
		double valorM = valorMM/100;
		double valorKM = valorMM/1000;
		double valorML = 1609/1;
		String Nombre1 = "";
		String Nombre2 = "";
		
		
		Object [] medidas ={"Milimetros", "Centimetros","Metros","Kilometros","Millas","Yardas","Años Luz" }; 
		Object opcion1 = JOptionPane.showInputDialog(null,"Selecciona una Moneda", "Elegir",JOptionPane.QUESTION_MESSAGE,null,medidas, medidas[0]);
		Object opcion2 = JOptionPane.showInputDialog(null,"Selecciona una Moneda", "Elegir",JOptionPane.QUESTION_MESSAGE,null,medidas, medidas[0]);
		cantidad = (JOptionPane.showInputDialog(null, " Introduce Cantidad ", 1));
		
		if (opcion1.toString().equalsIgnoreCase("Milimetros")){
			Nombre1 = "Milimetros";
			valor1 = valorMM;
			System.out.println("Eligió Milimetros");
			}
		
		if (opcion1.toString().equalsIgnoreCase("Centimetros")){
			Nombre1 = "Centimetros";
			valor1 = valorCM;
			System.out.println("Eligió Centimetros");
			}
		if (opcion1.toString().equalsIgnoreCase("Metros")){
			Nombre1 = "Metros";
			valor1 = valorM;
			System.out.println("Eligió Metros");
			}
		if (opcion1.toString().equalsIgnoreCase("Kilometros")){
			Nombre1 = "Kilometros";
			valor1 = valorKM;
			System.out.println("Eligió Kilometros");
			}
		
		if (opcion1.toString().equalsIgnoreCase("Millas")){
			Nombre1 = "Millas";
			valor1 = valorML;
			System.out.println("Eligió Millas");
			}
		if (opcion1.toString().equalsIgnoreCase("Años Luz")){
			Nombre1 = "Años Luz";
			valor1 = valorMM;
			System.out.println("Eligió Años Luz");
			}
		
		if (opcion1.toString().equalsIgnoreCase("Milimetros")){
			Nombre2 = "Milimetros";
			valor2 = valorMM;
			System.out.println("Eligió Milimetros");
			}
		
		if (opcion1.toString().equalsIgnoreCase("Centimetros")){
			Nombre2 = "Centimetros";
			valor2 = valorCM;
			System.out.println("Eligió Centimetros");
			}
		if (opcion1.toString().equalsIgnoreCase("Metros")){
			Nombre2 = "Metros";
			valor2 = valorM;
			System.out.println("Eligió Metros");
			}
		if (opcion1.toString().equalsIgnoreCase("Kilometros")){
			Nombre2 = "Kilometros";
			valor2 = valorKM;
			System.out.println("Eligió Kilometros");
			}
		
		if (opcion1.toString().equalsIgnoreCase("Millas")){
			Nombre2 = "Millas";
			valor2 = valorML;
			System.out.println("Eligió Millas");
			}
		if (opcion1.toString().equalsIgnoreCase("Años Luz")){
			Nombre2 = "Años Luz";
			valor2 = valorMM;
			System.out.println("Eligió Años Luz");
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
	            
	            
	        case 1:
	            mensaje = "Has pulsado No";
	            System.exit(0);
	            break;
	        case 2:
	            mensaje = "Has pulsado Cancelar";
	            System.exit(0);
	        }
	        JOptionPane.showMessageDialog(null, mensaje);
	}

	private static void ConversorMedida1(String[] args) {
		// TODO Auto-generated method stub
		
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
