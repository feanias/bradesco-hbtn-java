public class Quadrado {
	public static double area(double lado) throws IllegalArgumentException {
		String mensagem = "Lado deve possuir valor positivo";
		if(lado <= 0) {
			throw new IllegalArgumentException(mensagem);
		} else {
			return lado * lado;
		}		
	}

}
