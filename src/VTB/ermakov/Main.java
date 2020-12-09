//мин число
package VTB.ermakov;

public class Main {

	public static void main(String[] args) {
		int x=301;
		int y=300;
		int i;

		if (x<y) i=x; else i=y;

		System.out.println ("мин число");
		System.out.println (i);

	}
}

//Положительно или отрицательное число

package VTB.ermakov;

public class Main {
	public static void main(String[] args) {
		int a=2000;
		String b;
		String [] S= {"отрицательное","положительное"};
		if (a>0) b=S[1]; else b=S[0];
		System.out.println("тип числа");
		System.out.println(b);


	}
}

//Таблица усножения

package VTB.ermakov;

public class Main {
	public static void main(String... args) {
		System.out.println("таблица умножения");
		{
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++)
					System.out.println(i + " x " + j + " = " + (i * j));
				System.out.println(" ");
			}

		}

	}
}

//Арифметическая прогрессия
package VTB.ermakov;

public class Main {
	public static void main(String... args) {
		System.out.println("арифметическая прогрессия");
		int a, d, n, i, x;
		a = 1; // первое число
		d = 10; // шаг прогрессии
		i = 1; //порядковый номер числа
		n = 5; //количество чисел в прогрессии
		while (i <= n) {
			x = a + (i - 1) * d;
			i += 1;
			System.out.println(x);
		}
	}
}
