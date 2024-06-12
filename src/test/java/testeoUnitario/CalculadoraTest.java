package testeoUnitario;

import cl.calculadora.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Testeo Clase Calculadora")
public class CalculadoraTest {
	public static Logger Logger = java.util.logging.Logger.getLogger("Testing Calculadora");

	private final Calculadora calculadora = new Calculadora();

	@Test
	public void testSumar(){
		Logger.info("Información test Sumar");
		Integer calculadora1 =  calculadora.sumar(123,  123);
		assertEquals(246, calculadora1);
	}

	@Test
	public void testRestar(){
		Logger.info("Información test Restar");
		Integer calculadora1 =  calculadora.restar(4,  2);
		assertEquals(2, calculadora1);
	}

	@Test
	public void testMultiplicar(){
		Logger.info("Información test Multiplicar");
		Integer calculadora1 =  calculadora.multiplicar(4,  4);
		assertEquals(16, calculadora1);
	}

	@Test
	public void testDividir(){
		Logger.info("Información test Dividir");
		Integer calculadora1 =  calculadora.dividir(12,  3);
		assertEquals(4, calculadora1);
	}


}
