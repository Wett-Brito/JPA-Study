package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClieteAssento1 {

	public static void main(String[] args) {
		
	
	Assento assento = new Assento("2D");
	
	Cliente cliente = new Cliente("fer", assento);
	
	DAO<Object> dao = new DAO<>();
	
	dao.abrirTransacao()
		.incluir(assento)
		.incluir(cliente)
		.fecharTransacao()
		.fechar();
	
	}
}
