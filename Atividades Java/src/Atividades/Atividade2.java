package Atividades;

public class Atividade2 {
	public static void main(String[] args) {
		int i = 0;
		for (i=1000;i<=1999;i++)
		{
			if (i % 11 == 0 || i % 11 == 5)
				System.out.println(i);
		}
	}
}
