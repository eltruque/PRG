import java.util.Scanner;
public class temperatura{

	public static void main(String[] args){
		int c, r, f, k;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce los grados Celsius");
		c=teclado.nextInt();
		r= (4*c/5);
		f=(9*c/5)+32;
		k=c+237;
		System.out.println("La temperatura en Reamur es "+ r);
		System.out.println("La temperatura en Farenheit es "+ f);
		System.out.println("La temperatura en Kelvin es "+ k);
		



	}
}