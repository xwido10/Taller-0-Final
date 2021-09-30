/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author guill
 */
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
    public static int LeerPeliculas(String[] Peliculas, String[] tipos, String[][]funciones, int[]recaudaciones) throws FileNotFoundException{
	Scanner arch3 = new Scanner(new File("peliculas.txt"));
	int z = 0;
        int c=0;
	while(arch3.hasNextLine()) {
            String linea = arch3.nextLine();
            String[] partes = linea.split(",");
            Peliculas[z]= partes[0];
            tipos[z]= partes[1];
            recaudaciones[z] = Integer.parseInt(partes[2]);
            for(int i=3;i<partes.length;i+=2){
                String sala=partes[i];
                String funcion=partes[i+1];
                funciones[z][i]="Sala:"+sala+" jornada:"+funcion;
                
                
            }
            
            z++;
        }
         
        return z;
	
    }
	
    public static void AsientosSala1M(Scanner entrada,String []letras,String [][]matriz){
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                matriz[i][0]=letras[i];
                matriz[0][j]=""+j;
                if((j>4 && j<25)||(i>3 )){
                    
                    matriz[i][j]="o";
                    
                }else{
                    matriz[i][j]=" ";
                }
            }
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.print("ingrese cuantas entradas comprara: ");
   
        int cantEnt=entrada.nextInt();
        
        for(int i=1;i<cantEnt+1;i++){
            System.out.println("elija la letra: ");
            String letra=entrada.next();
            
            for (int b=0;b<11;b++){
                if(letra.equalsIgnoreCase(letras[b])){
                    System.out.print("elija el numero: ");
                    int numero=entrada.nextInt();
                    while(matriz[b][numero]==" "){
                    
                        System.out.println("Asiento no valido");
                        System.out.println("elija la letra: ");
                        letra=entrada.next();
                        
                        System.out.print("elija el numero: ");
                        numero=entrada.nextInt();

                    }   
                    matriz[b][numero]="1";
                
                }
                
            }

        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void AsientosSala1T(Scanner entrada,String []letras, String [][]matriz2){
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                matriz2[i][0]=letras[i];
                matriz2[0][j]=""+j;
                if((j>4 && j<25)||(i>3 )){
                    
                    matriz2[i][j]="o";
                    
                }else{
                    matriz2[i][j]=" ";
                }
            }
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.print("ingrese cuantas entradas comprara: ");
   
        int cantEnt=entrada.nextInt();
        
        for(int i=1;i<cantEnt+1;i++){
            System.out.println("elija la letra: ");
            String letra=entrada.next();
            
            for (int b=0;b<11;b++){
                if(letra.equalsIgnoreCase(letras[b])){
                    System.out.print("elija el numero: ");
                    int numero=entrada.nextInt();
                    while(matriz2[b][numero]==" "){
                    
                        System.out.println("Asiento no valido");
                        System.out.println("elija la letra: ");
                        letra=entrada.next();
                        
                        System.out.print("elija el numero: ");
                        numero=entrada.nextInt();

                    }   
                    matriz2[b][numero]="1";
                
                }
                
            }

        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    public static void AsientosSala2M(Scanner entrada,String []letras,String [][]matriz3){
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                matriz3[i][0]=letras[i];
                matriz3[0][j]=""+j;
                if((j>4 && j<25)||(i>3 )){
                    
                    matriz3[i][j]="o";
                    
                }else{
                    matriz3[i][j]=" ";
                }
            }
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                System.out.print(matriz3[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.print("ingrese cuantas entradas comprara: ");
   
        int cantEnt=entrada.nextInt();
        
        for(int i=1;i<cantEnt+1;i++){
            System.out.println("elija la letra: ");
            String letra=entrada.next();
            
            for (int b=0;b<11;b++){
                if(letra.equalsIgnoreCase(letras[b])){
                    System.out.print("elija el numero: ");
                    int numero=entrada.nextInt();
                    while(matriz3[b][numero]==" "){
                    
                        System.out.println("Asiento no valido");
                        System.out.println("elija la letra: ");
                        letra=entrada.next();
                        
                        System.out.print("elija el numero: ");
                        numero=entrada.nextInt();

                    }   
                    matriz3[b][numero]="1";
                
                }
                
            }

        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                
                System.out.print(matriz3[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void AsientosSala2T(Scanner entrada,String []letras,String [][]matriz4){
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                matriz4[i][0]=letras[i];
                matriz4[0][j]=""+j;
                if((j>4 && j<25)||(i>3 )){
                    
                    matriz4[i][j]="o";
                    
                }else{
                    matriz4[i][j]=" ";
                }
            }
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                System.out.print(matriz4[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.print("ingrese cuantas entradas comprara: ");
   
        int cantEnt=entrada.nextInt();
        
        for(int i=1;i<cantEnt+1;i++){
            System.out.println("elija la letra: ");
            String letra=entrada.next();
            
            for (int b=0;b<11;b++){
                if(letra.equalsIgnoreCase(letras[b])){
                    System.out.print("elija el numero: ");
                    int numero=entrada.nextInt();
                    while(matriz4[b][numero]==" "){
                    
                        System.out.println("Asiento no valido");
                        System.out.println("elija la letra: ");
                        letra=entrada.next();
                        
                        System.out.print("elija el numero: ");
                        numero=entrada.nextInt();

                    }   
                    matriz4[b][numero]="1";
                
                }
                
            }

        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                
                System.out.print(matriz4[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void AsientosSala3M(Scanner entrada,String []letras,String [][]matriz5){
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                matriz5[i][0]=letras[i];
                matriz5[0][j]=""+j;
                if((j>4 && j<25)||(i>3 )){
                    
                    matriz5[i][j]="o";
                    
                }else{
                    matriz5[i][j]=" ";
                }
            }
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                System.out.print(matriz5[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.print("ingrese cuantas entradas comprara: ");
   
        int cantEnt=entrada.nextInt();
        
        for(int i=1;i<cantEnt+1;i++){
            System.out.println("elija la letra: ");
            String letra=entrada.next();
            
            for (int b=0;b<11;b++){
                if(letra.equalsIgnoreCase(letras[b])){
                    System.out.print("elija el numero: ");
                    int numero=entrada.nextInt();
                    while(matriz5[b][numero]==" "){
                    
                        System.out.println("Asiento no valido");
                        System.out.println("elija la letra: ");
                        letra=entrada.next();
                        
                        System.out.print("elija el numero: ");
                        numero=entrada.nextInt();

                    }   
                    matriz5[b][numero]="1";
                
                }
                
            }

        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                
                System.out.print(matriz5[i][j]+" ");
            }
            System.out.println("");
        }
    }    
	
    public static void AsientosSala3T(Scanner entrada,String []letras,String [][]matriz6){
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                matriz6[i][0]=letras[i];
                matriz6[0][j]=""+j;
                if((j>4 && j<25)||(i>3 )){
                    
                    matriz6[i][j]="o";
                    
                }else{
                    matriz6[i][j]=" ";
                }
            }
        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                System.out.print(matriz6[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.print("ingrese cuantas entradas comprara: ");
   
        int cantEnt=entrada.nextInt();
        
        for(int i=1;i<cantEnt+1;i++){
            System.out.println("elija la letra: ");
            String letra=entrada.next();
            
            for (int b=0;b<11;b++){
                if(letra.equalsIgnoreCase(letras[b])){
                    System.out.print("elija el numero: ");
                    int numero=entrada.nextInt();
                    while(matriz6[b][numero]==" "){
                    
                        System.out.println("Asiento no valido");
                        System.out.println("elija la letra: ");
                        letra=entrada.next();
                        
                        System.out.print("elija el numero: ");
                        numero=entrada.nextInt();

                    }   
                    matriz6[b][numero]="1";
                
                }
                
            }

        }
        for(int i=0;i<11;i++){
            for(int j=0;j<31;j++){
                
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
	String [][]funciones= new String[9999][9999];
	String []RutStatus= new String[9999];
	String []Estado= new String[9999];
	String []NombreUser= new String[9999];
        String []ApellidoUser= new String[9999];
	String []Rut= new String[9999];
	String []Password= new String[9999];
        int []Credit= new int[9999];
        String []letras={" ","A","B","C","D","E","F","G","H","I","J"};
        
        String [][]matriz=new String[10][30];
        String [][]matriz2=new String[10][30];
        String [][]matriz3=new String[10][30];
        String [][]matriz4=new String[10][30];
        String [][]matriz5=new String[10][30];
        String [][]matriz6=new String[11][31]; 
        
        
        int cantPel=LeerPeliculas(Peliculas,tipos,funciones,recaudaciones);
	int cantStat=LeerStatus(RutStatus,Estado);
	int cantClient=LeerClientes(NombreUser,ApellidoUser,Rut,Password,Credit);
	
        
        for (int i=0;i<cantPel;i++){
            System.out.println(Peliculas[i]);
        }
        
        System.out.print("ingrese la pelicula: ");
        String pel= entrada.nextLine();
	for (int i=0;i<cantPel;i++){
            if(pel.equalsIgnoreCase(Peliculas[i])){
                System.out.print(Peliculas[i]+": ");
                for(int j=0;j<9999;j++){
                    if(funciones[i][j]!=null){
                        System.out.print(funciones[i][j]+" ");
                    }
                
                }
                System.out.println("");
            
                
                
                
        
            }
            
        }
        
        System.out.print("ingrese la sala: ");
        int sala=entrada.nextInt();
        switch (sala){
            case 1:
                System.out.print("si es jornada mañana ingrese 1, si no ingrese 2: ");
                int funcion=entrada.nextInt();
                if(funcion==1){
                    AsientosSala1M(entrada,letras,matriz);
                }else{
                    if(funcion==2){
                        AsientosSala1T(entrada,letras,matriz2);
                    }
                }
                break;
            case 2:
                System.out.println("si es jornada mañana ingrese 1, si no ingrese 2: ");
                funcion=entrada.nextInt();
                if(funcion==1){
                    AsientosSala2M(entrada,letras, matriz3);
                }else{
                    if(funcion==2){
                        AsientosSala2T(entrada,letras, matriz4);
                    }
                }
                break;
            case 3:
                System.out.print("si es jornada mañana ingrese 1, si no ingrese 2: ");
                funcion=entrada.nextInt();
                if(funcion==1){
                    AsientosSala3M(entrada,letras,matriz5);
                }else{
                    if(funcion==2){
                        AsientosSala3T(entrada,letras,matriz6);
                    }
                }
                break;
            

        }
        
        for(int a=0;a<cantClient;a++){
           
        }
        	
	
    }


}
