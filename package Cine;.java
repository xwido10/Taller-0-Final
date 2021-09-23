package Cine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class App {





	
    public static int LeerClientes(String[] NombreUser,String[]ApellidoUser,String[]Rut,String[]Password,int[]Credit) throws FileNotFoundException{
		Scanner Arch = new Scanner(new File("client.txt"));
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
		return x;	
				
	}
		
	public static int LeerStatus(String[] RutStatus,String[]Estado) throws FileNotFoundException{
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
			return y;
	}
	public static int LeerPeliculas(String[] Peliculas, String[] tipos,String[]salas, String[]funciones, int[]recaudaciones, String[][]cartelera) throws FileNotFoundException{
		Scanner arch3 = new Scanner(new File("peliculas.txt"));
		int z = 0;
			
		String cambio=" ";
		while(arch3.hasNextLine()) {
			String linea = arch3.nextLine();
			String[] partes = linea.split(",");
			Peliculas[z]= partes[0];
			tipos[z]= partes[1];
			recaudaciones[z] = Integer.parseInt(partes[2]);
				
			for(int i = 0; i<6; i++) {
				String sala= partes[3];
				String funcion= partes[4];
				 
				if(i<4){
					cambio=" "+(i+1);
					cartelera[0][0]=" ";
					cartelera[z+1][0]=Peliculas[z];
					cartelera[0][i+1]=cambio;
					cartelera[z+1][i+1]=funcion;
						
						
				}
					
			}
				
				z++;
		}
		arch3.close();
		return z;
		
	}
		
	public static void AsientosSala1M(String [][]matriz){
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				if((j>4 && j<25)||(i>3 )){
						
					matriz[i][j]="o";
						
				}else{
					matriz[i][j]=" ";
				}
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
					
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void AsientosSala1T(String [][]matriz2){
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				if((j>4 && j<25)||(i>3 )){
						
					matriz2[i][j]="o";
						
				}else{
					matriz2[i][j]=" ";
				}
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println("");
		}
			
	}
	public static void AsientosSala2M(String [][]matriz3){
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				if((j>4 && j<25)||(i>3 )){
					
					matriz3[i][j]="o";
						
				}else{
					matriz3[i][j]=" ";
				}
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				System.out.print(matriz3[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void AsientosSala2T(String [][]matriz4){
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				if((j>4 && j<25)||(i>3 )){
					
					matriz4[i][j]="o";
					
				}else{
					matriz4[i][j]=" ";
				}
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				System.out.print(matriz4[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void AsientosSala3M(String [][]matriz5){
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				if((j>4 && j<25)||(i>3 )){
						
					matriz5[i][j]="o";
						
				}else{
					matriz5[i][j]=" ";
				}
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				System.out.print(matriz5[i][j]+" ");
			}
			System.out.println("");
		}
	}    
		
	public static void AsientosSala3T(String [][]matriz6){
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				if((j>4 && j<25)||(i>3 )){
					
					matriz6[i][j]="o";
					
				}else{
					matriz6[i][j]=" ";
				}
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<30;j++){
				System.out.print(matriz6[i][j]+" ");
			}
			System.out.println("");
		}
	}    
	public static void main(String[] args) throws FileNotFoundException {
		Scanner entrada=new Scanner(System.in);	
		String []Peliculas = new String[999];
		String []tipos = new String[9999];
		int []recaudaciones= new int[9999];
		String []salas= new String[9999] ;
		String []funciones= new String[9999];
		String []RutStatus= new String[9999];
		String []Estado= new String[9999];
		String []NombreUser= new String[9999];
		String []ApellidoUser= new String[9999];
		String []Rut= new String[9999];
		String []Password= new String[9999];
		int []Credit= new int[9999];
			
		String [][]matriz=new String[10][30];
		String [][]matriz2=new String[10][30];
		String [][]matriz3=new String[10][30];
		String [][]matriz4=new String[10][30];
		String [][]matriz5=new String[10][30];
		String [][]matriz6=new String[10][30]; 
			
		String [][]cartelera=new String[999][5];
		int cantPel=LeerPeliculas(Peliculas,tipos,salas,funciones,recaudaciones,cartelera);
		int cantStat=LeerStatus(RutStatus,Estado);
		int cantClient=LeerClientes(NombreUser,ApellidoUser,Rut,Password,Credit);
		
		for(int i=0;i<cantPel+1;i++){
				
				
			for(int j=0;j<4;j++){
					
				System.out.print(cartelera[i][j]+"                                     ");
			}
			System.out.println("");
		}
		/*
		System.out.print("ingrese la pelicula: ");
		String pel= entrada.nextLine();
		for (int i=0;i<cantPel;i++){
				if(pel.equalsIgnoreCase(Peliculas[i])){
					System.out.print(Peliculas[i]);
				
					for(int j=0;j<cantPel;j++){
						System.out.println(" "+salas[j]+" "+funciones[j]);
					}
				}
		}*/
			
		
	}
	
	
}
	