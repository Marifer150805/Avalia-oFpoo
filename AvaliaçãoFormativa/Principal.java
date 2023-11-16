package AvaliaçãoFormativa;

public class Principal {

	public static void main(String[] args) {

		Usuario usuario = new Usuario(526412, "Maria", 12345678, "Permitido", "sim");
		
		System.out.println("id"+usuario.getId());
		System.out.println("nome"+usuario.getNome());
		System.out.println("password"+usuario.getPassword());
		System.out.println("permissao"+usuario.getPermissao());
		System.out.println("usuario"+usuario.getUsuario());
	}
}