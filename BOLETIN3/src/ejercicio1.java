import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String lunes = "LUNES";
		String martes = "MARTES";
		String miercoles = "MIERCOLES";
		String jueves = "JUEVES";
		String viernes = "VIERNES";

		System.out.println("SELECCIONE  UN DIA DE LA SEMANA");

		String valorusuario = sc.nextLine().toUpperCase();

		String asignatura1 = "SI";
		String asignatura2 = "BBDD";
		String asignatura3 = "NO HAY NADA A PRIMERA";
		String asignatura4 = "LM";
		String asignatura5 = "NO HAY NADA A PRIMERA";

		if (lunes.equals(valorusuario)) {
			System.out.println(asignatura1);
		}

		if (martes.equals(valorusuario)) {
			System.out.println(asignatura2);
		}

		if (miercoles.equals(valorusuario)) {
			System.out.println(asignatura3);
		}
		if (jueves.equals(valorusuario)) {
			System.out.println(asignatura4);
		}
		if (viernes.equals(valorusuario)) {
			System.out.println(asignatura5);
		}

	}

}
