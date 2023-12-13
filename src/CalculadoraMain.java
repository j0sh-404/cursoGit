import com.acciones.Resta;
import com.acciones.Suma;

public class CalculadoraMain {

	public static void main(String[] args) {
		System.out.println("Hola mundo perros");

		Suma suma = new  Suma(2,500);// comentario en la línea 9 desde la rama agregando_resta
		
		System.out.println("La suma es "+ suma.sumar());


		Suma sumab = new  Suma(10,10); //Comentario en linea 13 desde la rama agregando_resta
		
		System.out.println("La suma es del total es  "+ sumab.sumar());
		
		Resta resta1 = new  Resta(100,45);
		
		System.out.println("La resta es: "+resta1.restar());
		//comentario de ejemplo
	}
}
