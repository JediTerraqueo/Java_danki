package aula;

public class Main6 {
	public static void main(String[] args) {
		
		int vida = 100;
		
		if(vida == 100) {
			vida++;
			System.out.println("Saco Grande tem "+vida+" de vida!");
		}else {
			System.out.println("Saco grande morreu!");
		}
		
		String nome = "Godzila";
		if(nome == "Godzila") {
			System.out.println("Bola Grande radiotiva");
		}else if(nome == "Gadozila") {
			System.out.println("Gado Demais");
		}else if(nome == "Gayzila") {
			System.out.println("Baitolasso");
		}else {
			
		}
		
		if(nome != "Godzila") {
			System.out.println("Gay demais");
			
		}
		boolean var = true;
		if(var) {
			System.out.println("É verdade esse bilete");
		}
		
	}
	
}
