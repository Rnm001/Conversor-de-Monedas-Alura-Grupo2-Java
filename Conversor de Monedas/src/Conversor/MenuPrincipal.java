package Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	//public static void menu(String[] args) {
		
	public static void menu(String[] args) {

			int input = JOptionPane.showConfirmDialog(null, "¿Que tipo de conversion desea realizar?");
		    switch (input) {
		       case 0:
		           main1(args);
		           
		       case 1:
		           main1(args);
		           break;
		       case 2:
		           System.exit(0);
		       }
	}

	private static void main1(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
