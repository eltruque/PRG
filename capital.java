import java.util.Scanner;
public class capital {

	public static void main(String[] args){
	float c, r, t, suma, cf;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el capital");
		c=teclado.nextFloat();
		System.out.println("Introduce el porcentaje de interes");
		r=teclado.nextFloat();
		System.out.println("introduce los anyos que estara el capital depositado");
		t=teclado.nextFloat();
		suma= (c*r*t)/100;
		cf=c+suma;
		System.out.printf("Capital inicial %.2f + interes %.2f = %.2f € %n", c, suma, cf);
		
			

	}
}
