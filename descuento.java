import java.util.Scanner;
public class descuento{

	public static void main(String[] args){

		int d, p, t;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce lo que has pagado");
		p=teclado.nextInt();
		System.out.println("Introduce el precio de tarifa");
		t=teclado.nextInt();
		d=p*100/t;
		System.out.println("El descuento aplicado es del "+ (100-d) + "%");


	}
}