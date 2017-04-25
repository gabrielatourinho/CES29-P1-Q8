package P1Gabriela.Q8;

public class Controlador {
	BDUsuario bancodeusuarios;
	
	void newUser(String name) {
		if (bancodeusuarios.newUser(name))
			System.out.println("Usuário adicionado");
		else
			System.out.println("O usuário já existe");
	}
	
	void removeUser(String name) {
		if (bancodeusuarios.removeUser(name))
			System.out.println("Usuário removido");
		else
			System.out.println("O usuário não existe no banco de dados.");
	}
	
	void blockUser(String name, Object dueDate) {
		if (bancodeusuarios.blockUser(name, dueDate))
			System.out.println("Usuário bloqueado");
		else
			System.out.println("O usuário não existe no banco de dados.");
	}
}
