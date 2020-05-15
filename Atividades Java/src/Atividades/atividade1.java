package Atividades;

public class atividade1 {
	public static void main(String[] args) {
		int contador =0, i = 0;
		for (i=0;i<=500;i++)
		{
			if (i % 2 != 0 && i % 3 == 0)
				contador = contador + i;
		}
		System.out.println(contador);
	}
}
