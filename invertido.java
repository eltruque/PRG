import java.util.Scanner;
public class invertido{

	public static void main(String[] args){
		int d1, d2, d3, d4;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce 4 numeros enteros");
		d1 = teclado.nextInt();
		d1%=10000;
		System.out.print(d1 %10);
		System.out.print(d1/10 %10);
		System.out.print(d1/100 %10);
		System.out.println(d1/1000);
		//d2 = teclado.nextInt(); d2=Math.abs(d2);d2ln%=10;
		//d3 = teclado.nextInt();
		//d4 = teclado.nextInt();

		//FORMA 1

		//System.out.print((char)(d4 + '0'));
		//System.out.print((char)(d3 + '0'));
		//System.out.print((char)(d2 + '0'));
		//System.out.print((char)(d1 + '0'));

		//FORMA 2

		//System.out.print(d4);
		//System.out.print(d3);
		//System.out.print(d2);
		//System.out.println(d1);

		//FORMA 3

		//System.out.println(""+(char)(d4 + '0')+(char)(d3 + '0')+(char)(d2 + '0')+(char)(d1 + '0'));


	}
}