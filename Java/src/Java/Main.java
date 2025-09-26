package Java;

public class Main{
	
    public int[] numeros = {10,20,30};
	
	public Main() {
		int soma = 0;
		for(int i = 0; i < numeros.length; i++) {
			soma+=numeros[i];	
		}
		System.out.println(soma);
	
	/*public char[] nome = {'P','a','u','l','o'};
	
	public Main() {
		String nomeCompleto = "";
		for(int i = 0; i < nome.length; i++) {
			nomeCompleto+=nome[i];	
		}
		System.out.println(nomeCompleto);*/
		
		/*for(int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}*/
		
		/*System.out.println(nome[0]);*/
	    
		/*nome[0] = 'p';
		System.out.println(nome[0]);*/
	}
	
	public static void main(String args[]) {
		new Main();
	}
	
}
