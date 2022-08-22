package Conversor;

public class ConversorMoneda {

	public static void main(String[] args) {
		
		double valor1 = 1;
		double valor2 = 1;
		double cantidad = 0;
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
		
		valor1 = valorUS;
		valor2 = valorPESOARG;
		cantidad = 100;
		
		double conversion = (valor1*valor2)*cantidad;
		
		
		
		
		
		System.out.println(cantidad + " Dolares"+ " son " + conversion + " Pesos Argentinos");
		
	}

	public boolean launch() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
