
public class Recursividad
{
	
	int division(int a, int b)
	{
        if (b > a) 
        {
            return 0;
        }
        
        return 1 + division(a - b, b);
	}
	
	/*
	void imprimirN (int N)
	{
		for(int i = 1; i <= N; i++)
		{
			if (i != N)
			{
				System.out.print(i + ", ");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	*/
	
	int potencia (int numero, int potencia)
	{
		if (potencia == 1) {
			return numero;
		}
		
		return numero * potencia (numero, potencia - 1);
	}
	
	
	int funcionFactorial(int top)
	{
		
		if (top == 1) {
			return 1;
		}
		return top * funcionFactorial(top -1);
	}
	
	int sumaArr (int[] arr, int posicion) {
		
		if (posicion < arr.length) {
			return arr[posicion] + sumaArr(arr, posicion + 1);
		}
		
		return 0;
	}
	
	/*
	int ContPares (int [] arr, int posicion)
	{
		int i = 0;
		
		if(posicion < arr.length & arr[posicion] % 2 == 0)
		{
			i++;
			return arr[posicion] + sumaArr(arr, posicion + 1);
		}
		else
		{
			return i;
		}
		
	}
	int ContImpares (int [] arr)
	{
		
	}
	*/
}
