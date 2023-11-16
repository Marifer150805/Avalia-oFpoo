package AvaliaçãoFormativa;

public class Principal2 extends Fisica{

	public static void main(String[] args) {
		
		Fisica fisica = new Fisica("Marifer", "1525652", "998252460");
		System.out.println("nome: "+fisica.getNome());
		System.out.println("cpf: " +fisica.getCpf());
		System.out.println("rg: "+fisica.getRg());
	}
}