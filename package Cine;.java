package Cine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class App {
	
    public static void LeerClientes(String[] NombreUser,String[]ApellidoUser,String[]Rut,String[]Password,int[]Credit) throws FileNotFoundException{
		Scanner Arch = new Scanner(new File("clientes.txt"));
		int x = 0;
		while (Arch.hasNextLine( )){
			String linea = Arch.nextLine();
			String [] partes = linea.split(",");
			NombreUser[x]= partes[0];
			ApellidoUser[x]=partes[1];
			Rut[x]= partes[2];
			Password[x]= partes[3];
			Credit[x] = Integer.parseInt(partes[4]);
				
	
			x++;
				
				
		}
		Arch.close();
			
				
	}
		
	public static void LeerStatus(String[] RutStatus,String[]Estado) throws FileNotFoundException{
		Scanner Arch2 = new Scanner(new File("status.txt"));
		int y = 0;
		while(Arch2.hasNextLine()) {
			String linea = Arch2.nextLine();
			String [] partes = linea.split(",");
			RutStatus[y] = partes[0];
			Estado[y]= partes[1];
				
	
			y++;
	
	
		}
		Arch2.close();
	}

	public static void LeerPeliculas(String[] Peliculas, String[] tipos,String[]salas, String[]funciones, int[]recaudaciones) throws FileNotFoundException{
		Scanner arch3 = new Scanner(new File("peliculas.txt"));
		int z = 0;
		while(arch3.hasNextLine()) {
			String linea = arch3.nextLine();
			String[] partes = linea.split(",");
			Peliculas[z]= partes [0];
			tipos[z]= partes[1];
			recaudaciones[z] = Integer.parseInt(partes[2]);
				
			for(int i = 0; i<999; i++) {
				salas[z]= partes[3];
				funciones[z] = partes[4];
					
					
			}
			z++;
		}
		arch3.close();
				
		
	}
		
			 
				
	
		
	public static void main(String[] args) throws FileNotFoundException {
			
		String Peliculas[] = new String[999];
		String tipos[] = new String[9999];
		int recaudaciones[]= new int[9999];
		String salas[]= new String[9999] ;
		String funciones[]= new String[9999];
		String RutStatus[]= new String[9999];
		String Estado[]= new String[9999];
		String NombreUser[]= new String[9999];
		String ApellidoUser[]= new String[9999];
		String Rut[]= new String[9999];
		String Password[]= new String[9999];
		int Credit[]= new int[9999];
	
		LeerPeliculas(Peliculas,tipos,salas,funciones,recaudaciones);
		LeerStatus(RutStatus,Estado);
		LeerClientes(NombreUser,ApellidoUser,Rut,Password,Credit);
			
		
			
		
	
	}
	
}