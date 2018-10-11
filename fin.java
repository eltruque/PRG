
import java.util.Scanner;


public class fin {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int contador, suma, nota;
		boolean fin;
		contador=0;
		suma=0;
		fin=false;
		while(!fin){
			System.out.println("Introducir nota (<0 o >10 para salir):");
			nota=teclado.nextInt();
			if(nota<0 ||nota>10)
				fin=true;
			else{
				contador++;
				suma+=nota;
			}
		}
		if(contador>0)System.out.println("Media: "+suma/contador);
		else System.out.println("No hay notas para calcular la media");

	}
}