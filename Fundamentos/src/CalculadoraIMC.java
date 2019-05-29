import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		double peso,altura,imc;
		System.out.println("=============");

		System.out.println("Cálculo do IMC");
		System.out.println("=============");

		Scanner leia = new Scanner(System.in);
		

		DecimalFormat formatador = new DecimalFormat("0.00");

		System.out.print("Digite seu peso: ");
		peso = leia.nextDouble();
		System.out.print("Digite sua altura: ");
		altura = leia.nextDouble();
		imc = peso /(altura * altura);
		
		System.out.println("IMC: " + formatador.format(imc));
		//para criar um intervalo usamos o operador AND (&&)
		if (imc <18.5) {
			System.out.println("Abaixo do peso");
		}else if (imc >=18.5 && imc <25) {
			System.out.println("Peso Normal");
		}else if (imc >=25 && imc < 30) {
		System.out.println("Acima do Peso");

		}
		else {
			System.out.println("Obeso");
		}
		leia.close();
	}

}

