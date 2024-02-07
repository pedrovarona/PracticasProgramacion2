package aplicacion;
import mates.Matematicas;
import java.util.Scanner;


public class Principal{

public static void main(String[] args){

1
Scanner sc = new Scanner(System.in);
System.out.println ("Introduce la cantidad de puntos que gustes: ");


long puntostotales = sc.nextInt();

System.out.println("El número PI es " + Matematicas.generarNumeroPi(puntostotales));

sc.close();
}
}