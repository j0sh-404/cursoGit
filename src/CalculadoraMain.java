import com.acciones.Suma;

public class CalculadoraMain {

	public static void main(String[] args) {
		System.out.println("Hola mundo perros");

		Suma suma = new  Suma(2,5);
		
		System.out.println("La suma es "+ suma.sumar());

		Suma sumab = new  Suma(10,300);//comentario en la línea 12 desde la rama main
		
		System.out.println("La suma es "+ sumab.sumar());
	}
}
