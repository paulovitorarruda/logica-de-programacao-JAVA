package Java;

import java.util.Scanner;

public class Main{
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double tempoAntigo = System.currentTimeMillis();
		
		String s = scanner.nextLine();
		
		
		if(Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2) {
			if(s.length() >=5) {
				System.out.println("Show! A mensagem é "+s);
			}else {
				System.out.println("Sua mensagem é muito curta!");
			}
		}else {
			System.out.println("Ops! Você precisa esperar pelo menos 2 segundos.");
			System.out.println("Vamos tentar novamente?");
			tempoAntigo = System.currentTimeMillis();
			s = scanner.nextLine();
			if(Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2) {
				System.out.println("Agora sim!");
			}else {
				System.out.println("Você falhou 2x! Acabamos o programa!");
			}
		}
	}
	
	public static double convertTime(double tempo) {
		return tempo/1000;
	}
}

/*{	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double tempoAntigo = System.currentTimeMillis();
		
		String s = scanner.nextLine();
		
		
		if(Main.convertTime(System.currentTimeMillis() - tempoAntigo) >= 2) {
			System.out.println(s);
		}
	}
	
	public static double convertTime(double tempo) {
		return tempo/1000;
	}
}
*/
/*{
    public static void main(String args[]) {
	    Scanner scanner = new Scanner(System.in);
	    String s = scanner.nextLine();
	    
	    System.out.println(s);	 
	}

}*/