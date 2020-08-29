
public class Program {

	public static void main(String[] args) 
	{
		//Ejercicio A
		Recursividad Rec = new Recursividad();
		int a = 60, b = 15;
		System.out.println(Rec.division(a, b));
		
		
		//Ejercicio B
		int c = 2, d = 3;
		System.out.println(Rec.potencia(c, d));
		
		
		//Ejercicio c
		int top = 5;
		System.out.println(Rec.funcionFactorial(top));
		
		
		//Ejercicio d 
		int[] arrSum = new int[] {1, 3, 4};
		System.out.println(Rec.sumaArr(arrSum, 0));
		
	}
}
