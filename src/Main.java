import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 10.12345;
		System.out.printf("%.3f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Primeiro Programa do Curso");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
	}

}
