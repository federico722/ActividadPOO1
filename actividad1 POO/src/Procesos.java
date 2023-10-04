import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
       Lavautos miL;
       double porDescuento;
       ArrayList<Lavautos> listLavautos;
       
       public Procesos () {
    	   listLavautos=new ArrayList<Lavautos>();
    	   menu();

       }

	private void menu() {
	String	menuLavautosModelo ="    SELECCIONE MODELO DE VEHICULO     \n\n";
  	  menuLavautosModelo+="1.Automovil \n";
  	  menuLavautosModelo+="2.Campero \n";
  	  menuLavautosModelo+="3.Camioneta \n";
  	  menuLavautosModelo+="4 Salir \n";
  	  menuLavautosModelo+="------------------------------------------";
	int opc=0;
	
	
	
	do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(menuLavautosModelo));
		switch (opc) {
		case 1: miL =new Lavautos();
			miL.mostrarMenuTipoAutomovil();
			listLavautos.add(miL);
			
			break;
		case 2:Lavautos miLavautos=new Lavautos();
			miLavautos.mostrarMenuTipoCampero();
			listLavautos.add(miLavautos);
			break;
		
		case 3:miL =new Lavautos();
			miL.mostrarMenuTipoCamionero();
			listLavautos.add(miL);
			break;

		case 4:
			System.out.println("Adios");
			break;
		default:
			System.out.println("No es una opcion");
			break;
		}
	} while (opc !=4);
	 System.out.println(listLavautos);

}
  	  
	

}
