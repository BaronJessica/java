package model;

import java.util.List;

//

public interface IContatoDAO {
	
	void incluir(Contato contato); 
	
	void atualizar(Contato contato); 
	
	void remover(int id); 
	
	List<Contato> obterTodos();
	
	Contato obterPorId(int id);
}
