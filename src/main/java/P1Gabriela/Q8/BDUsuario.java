package P1Gabriela.Q8;

import java.util.ArrayList;
import java.util.List;

public class BDUsuario {
	private List<String> usuarios;
	private List<String> permissoes;
	
	public BDUsuario () {
		usuarios = new ArrayList<String>();
		permissoes = new ArrayList<String>();
	}
	
	public boolean newUser(String name) {
		if (!usuarios.contains(name)){
			usuarios.add(name);
			permissoes.add("autorizado");
			return true;
		}
		else return false;
	}
	
	public boolean removeUser(String name) {
		if(usuarios.contains(name)){
			int index = usuarios.indexOf(name);
			usuarios.remove(name);
			permissoes.remove(index);
			return true;
		}
		else return false;
	}
	
	public boolean blockUser(String name, Object dueDate) {
		if(usuarios.contains(name)){
			int index = usuarios.indexOf(name);
			usuarios.remove(name);
			permissoes.remove(index);
			usuarios.add(name);
			permissoes.add("bloqueado");
			return true;
		}
		else return false;
	}

}
