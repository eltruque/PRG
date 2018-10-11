public class lul {

	public static void main(String[] args){
		int contador, suma, centinela, nota;
		contador = 0;
		suma=0;
		centinela=-1;
		System.out.println("Introducir nota (fin=-1):");
		nota=in.nextIn();
		while(nota!=centinela)
		{
			contador++;
			suma+=nota;
			System.out.println("introducir nota (fin=-1):");
			nota=in.nextInt();

		}
		if(contador>0)System.out.println("Media: "+ suma/contador);
		else System.out.println("no hay notas para calcular la media");
		

	}
}