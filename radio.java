import java.util.Scanner;
public class radio {

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);
		final double Pi=3.1415;
		double v, s, r;
		System.out.println("introduce el radio");
		r=teclado.nextDouble();
		v=(double)4/3.0*Pi*Math.pow(r,3);
		s=4*Pi*Math.pow(r,2);
		System.out.println("volumen es " + v );
		System.out.println("Area es " + s );

	}
}