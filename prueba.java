import java.util.Scanner;
public class prueba {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		short anyo, mes, dia;
		boolean correcta = true;
		System.out.println("Dime el dia");
		dia=teclado.nextShort();
		System.out.println("Dime el mes");
		mes=teclado.nextShort();
		System.out.println("Dime el anyo");
		anyo=teclado.nextShort();


		if(fechaCorrecta(dia,mes,anyo));
		if(fechaNumerica(dia,mes,anyo)<=10001231)
					correcta=false;

		if(fechaNumerica(dia,mes,anyo)<=15821231)
		correcta=fechaJuliana(dia,mes,anyo);

		if(correcta) System.out.println("Fecha correcta");
		else System.out.println("Fecha incorrecta");
	}

	public static boolean fechaCorrecta(short dia,short mes,short anyo){
		boolean correcta = true;


		if(dia<1||dia>31)
		 correcta = false;
		
		else if (mes<1||mes>12)
			correcta = false;
		else
			switch(mes){
				case 4 : case 6 : case 9 : case 11:
					if(dia>30){
						correcta = false;
					}
					break;
				case 2 :
					if(anyo%4==0 && anyo%100!=0 || anyo%400==0){
						if(dia>29)
							correcta=false;
					}
					else if (dia>28)
							correcta = false;
					break;


		}	
		return correcta;
	}
}