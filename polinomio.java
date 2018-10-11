import java.util.Scanner;
public class polinomio {

	public static void main(String[] args){
	double x, res;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa para resolver el polinomio 6x^4-x^2+3x-5");
		System.out.println("Introduce el valor de X");
		x=teclado.nextDouble();
		res=6*Math.pow(x,4)-(Math.pow(x,2)+3)*(x-5);
		System.out.println("el resultado es: 6*"+ x + "^4" + "-" + x + "^2" + "+3*" + x + "-5="+res);
	
		
			

	}
}
