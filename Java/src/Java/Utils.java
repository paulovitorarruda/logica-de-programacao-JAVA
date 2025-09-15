package Java;

public class Utils {
	
	/* ATRIBUTOS:
	int,double,char,String,float
	*/
	private int idade = 21;
	public double peso = 72;
	public float peso2 = 72f;
	public String nome = "Paulo";
	
	public void printHelloWorld() {
		idade = 21;
		printOutraCoisa();
	}
	
	public int pegaIdade() {
		return idade;
	}
	
	private void printOutraCoisa() {
		System.out.println("outra coisa");
	}

}