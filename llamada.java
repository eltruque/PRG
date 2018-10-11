import java.util.Scanner;
public class llamada {

	public static void main(String[] args){
	double d,total, pasada;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce los minutos que ha durado la llamada");
		d=teclado.nextDouble();
		  if ( d > 3){ 
			total=(d-3)*(0.09+0.12);

		  }else{
		  	total=0.12;
		  };
		  System.out.println("El precio de la llamada es "+total+" euros");

	}
}