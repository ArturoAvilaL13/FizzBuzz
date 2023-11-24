package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidadNumeros = 100;
		
		for (int i=0;i<=cantidadNumeros;i++) {
			
			if(i%3==0)
				System.out.println("Fizz");
			else
				System.out.println("N. "+i);
		}
	}

}
