import javax.swing.JOptionPane;

public class Lavautos {
      int añoActual;
      int antiguedad;
      double precioLimpieza;
      String tipoAutomovil;
      String tipoCampero;
      String tipoCamionero;
      String menuLavautosTipoAutomovil;
      String menuLavautosTipoCampero;
      String menuLavautosTipoCamionero;
      
      
      
      public void pedirAño() {
    	  añoActual=Integer.parseInt(JOptionPane.showInputDialog("ingrese el año de antiguedad de su  vehiculo"));
      }
      

      
      public void mostrarMenuTipoAutomovil() {
    	  menuLavautosTipoAutomovil="   PRECIO POR TIPO AUTOMOVIL    \n\n";
    	  menuLavautosTipoAutomovil+="A.pequeño $4000 \n";
    	  menuLavautosTipoAutomovil+="B.mediano $5000 \n";
    	  menuLavautosTipoAutomovil+="C.de lujo $6000  \n";
    	  menuLavautosTipoAutomovil+="D Salir ";
    	  
    	  
    	  
    	   
    	  
			do {
				tipoAutomovil=JOptionPane.showInputDialog(menuLavautosTipoAutomovil);
				
				
					
					switch (tipoAutomovil.toUpperCase()) {
					
					case "A":
						 pedirAño();
							CalcularAntiguedad(añoActual);
						if (antiguedad > 8) {
							precioLimpieza= 4000 *1.25;
							System.out.println("El costo se incrementa un 20%, limpieza del vehículo es: $" + precioLimpieza);
						} else {
			               precioLimpieza=4000;
			               System.out.println("El costo de limpieza del vehículo es: $" + precioLimpieza);
						}
						break;
					case "B":
						 pedirAño();
							CalcularAntiguedad(añoActual);
						if (antiguedad > 8) {
							precioLimpieza= 5000 *1.25;
							System.out.println("El costo se incrementa un 20%, limpieza del vehículo es: $" + precioLimpieza);
						} else {
			               precioLimpieza=5000;
			               System.out.println("El costo de limpieza del vehículo es: $" + precioLimpieza);
						}
						break;
					case "C":
						 pedirAño();
							CalcularAntiguedad(añoActual);
						if (antiguedad > 8) {
							precioLimpieza= 6000 *1.25;
							System.out.println("El costo se incrementa un 20%, limpieza del vehículo es: $" + precioLimpieza);
						} else {
			               precioLimpieza=6000;
			               System.out.println("El costo de limpieza del vehículo es: $" + precioLimpieza);
						}
						break;
					case "D":
					
						break;

					default:
						break;
					}
			} while (!tipoAutomovil.equalsIgnoreCase("D"));
    	  
      }
      
      
      
      
      public void mostrarMenuTipoCampero() {
    	  menuLavautosTipoCamionero="   PRECIO POR TIPO CAMPERO   \n\n";
    	  menuLavautosTipoCamionero+="A.sencillo $5000 \n";
    	  menuLavautosTipoCamionero+="B.de lujo $8000\n";
    	  menuLavautosTipoCamionero+="D. salir";
    	 
    	  
    	  do {
    	  tipoCampero=JOptionPane.showInputDialog(menuLavautosTipoCampero);
    	  
  	    
  	  
  	  switch (tipoCampero.toUpperCase()) {
		case "A":
			 pedirAño();
				CalcularAntiguedad(añoActual);
			if (antiguedad > 8) {
				precioLimpieza= 5000 *1.25;
				System.out.println("El costo se incrementa un 20%, limpieza del vehículo es: $" + precioLimpieza);
			} else {
             precioLimpieza=5000;
             System.out.println("El costo de limpieza del vehículo es: $" + precioLimpieza);
			}
			break;
		case "B":
			 pedirAño();
				CalcularAntiguedad(añoActual);
			if (antiguedad > 8) {
				precioLimpieza= 8000 *1.25;
				System.out.println("El costo se incrementa un 20%, limpieza del vehículo es: $" + precioLimpieza);
			} else {
             precioLimpieza=8000;
             System.out.println("El costo de limpieza del vehículo es: $" + precioLimpieza);
			}
			break;
		case "D":
			break;

		default:
			break;
		}
  	  
    	  }while(!tipoCampero.equalsIgnoreCase("D"));
      }
      
      
      
      public void mostrarMenuTipoCamionero() {
    	  menuLavautosTipoCamionero="   PRECIO POR TIPO CAMIONERO   \n\n";
    	  menuLavautosTipoCamionero+="A.Cabina sencilla $6000 \n";
    	  menuLavautosTipoCamionero+="B.doble cabina $8000\n";
    	  menuLavautosTipoCamionero+="D. salir";
    	
    	  
    	 do {
    	  tipoCamionero=JOptionPane.showInputDialog(menuLavautosTipoCamionero);
    	  
  	    
  	  
  	  switch (tipoCamionero.toUpperCase()) {
		case "A":
			 pedirAño();
				CalcularAntiguedad(añoActual);
			if (antiguedad > 8) {
				precioLimpieza= 6000 *1.25;
				System.out.println("El costo se incrementa un 20%, limpieza del vehículo es: $" + precioLimpieza);
			} else {
             precioLimpieza=6000;
             System.out.println("El costo de limpieza del vehículo es: $" + precioLimpieza);
			}
			break;
		case "B":
			 pedirAño();
				CalcularAntiguedad(añoActual);
			if (antiguedad > 8) {
				precioLimpieza= 8000 *1.25;
				System.out.println("El costo se incrementa un 20%, limpieza del vehículo es: $" + precioLimpieza);
			} else {
             precioLimpieza=8000;
             System.out.println("El costo de limpieza del vehículo es: $" + precioLimpieza);
			}
			break;
		case "D":
			break;

		default:
			break;
		}
  	  
    	 }while(!tipoCamionero.equalsIgnoreCase("D"));
      }
      
      
      
      public void CalcularAntiguedad(int añoActual) {
    	  antiguedad=2023-añoActual;
      }
      
     }
