import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Capitulo2 {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Ramon Francisco Torres Bezerra ", 150);
		Usuario user2 = new Usuario("Joao Sei lá Das Contas ", 300);
		Usuario user3 = new Usuario("Guilherme dos Contos ", 130);
		
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		for(Usuario u : usuarios){
					
			System.out.println(u.getNome() + u.getPontos());
			
			}
		}	

}
