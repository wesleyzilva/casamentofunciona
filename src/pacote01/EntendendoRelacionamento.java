package pacote01;

public class EntendendoRelacionamento {

	public static void main(String[] args) {

//		ClasseDosFilhos.setEmCasa(false);

		// Criando diferentes situações com as esposas
		ClasseDasMulheres mulher[] = new ClasseDasMulheres[3];
		/*
		 * @estaDeTpm
		 * @filhoEmCasa
		 * @bebeDrinks
		 */
		mulher[0] = new ClasseDasMulheres(false, false, true);
//		mulher[1] = new ClasseDasMulheres(false, true, true);
//		mulher[2] = new ClasseDasMulheres(true, false, true);
//		mulher[3] = new ClasseDasMulheres(true, true, false);

//		mulher[4] = new ClasseDasMulheres(false, false, false);
//		mulher[5] = new ClasseDasMulheres(true, false, false);
//		mulher[6] = new ClasseDasMulheres(false, true, false);
//		mulher[7] = new ClasseDasMulheres(false, false, true);

		ClasseDosHomens homem[] = new ClasseDosHomens[3];
		homem[0] = new ClasseDosHomens();

//		homem[0].querSexo();

		
		Casamento casal1 = new Casamento();
		casal1.rolaSexo(mulher[0], homem[0]);

	}
}
