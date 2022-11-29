
public class ejercicio2 {

	public static void main(String[] args) {
		
		numAleatorio();
		mostrarArray(null);
		
	
	}

	private static void numAleatorio() {
		int[]numerosA = new int [20];
		
		
		
		for (int i=0;i<numerosA.length;i++) {
			numerosA[i] = (int) Math.random()*300;
		}
		
		
		mostrarArray(numerosA);
		
	}

	private static void mostrarArray(int[]numeros) {

		System.out.print("{");
		
		for(int i=0;i<numeros.length-1;i++) {
			System.out.print(numeros[i]+ ",");
		}
		System.out.print(numeros.length-1+"}" );
	}
	
	
	
}
