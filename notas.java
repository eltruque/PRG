import java.util.Scanner;
public class notas {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		float n1,n2,n3,nf;
		int nr;

		n1=teclado.nextFloat();
		n2=teclado.nextFloat();
		n3=teclado.nextFloat();
	if (n1>=5&&n2>=5&&n3>=5){
		nf=(n1+n2+n3)/3;
		System.out.println("La nota final es "+nf);
	}
	else if(n1<5&&n2>=5&&n3>=5||n1>=5&&n2<5&&n3>=5||n1>=5&&n2>=5&&n3<5){
		System.out.println("Dime la nota de recuperacion");
		nr=teclado.nextInt();
		switch(nr){
			case 5: case 6: case 7:
			nf=5;
			break;
			case 8: case 9: case 10:
			nf=6;
			break;
			default: nf=4;

		

		}

	System.out.println("La nota final es: "+ nf);
	}




	}
}