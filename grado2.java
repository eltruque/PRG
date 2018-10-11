import java.util.Scanner;
public class grado2 {

	public static void main(String[] args){
	double a, b, x, c, resp, resn;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce los datos de la formula ax^2+bx+c");
		System.out.println("Introduce el valor de A");
		a=teclado.nextDouble();
		System.out.println("Introduce el valor de B");
		b=teclado.nextDouble();
		System.out.println("Introduce el valor de C");
		c=teclado.nextDouble();
		
		
		resp=b*(-1)+Math.sqrt(Math.pow(b,2)-(4*a*c))/2*a;
		resn=b*(-1)-Math.sqrt(Math.pow(b,2)-(4*a*c))/2*a;

		System.out.println("El resultado 1 es: " + resp);
		System.out.println("El resultado 2 es: " + resn);
		
			

	}
}
