public class Numero {
	public static void dividir(int a, int b) {
		int resultado = 0;

		try {
			resultado = a/b;
		}
		catch (Exception e){
			System.out.println("Nao eh possivel dividir por zero");
		}

		finally {
			SYstem.out.println(a + " / " + b + " = " + resultado);
			}
	}
}
