package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio t1 = new Tio("Maria");
		Tio t2 = new Tio("João");
		
		Sobrinho s1 = new Sobrinho("Davi");
		Sobrinho s2 = new Sobrinho("Ana");
		
		t1.getSobrinhos().add(s1);
		s1.getTios().add(t1);
		
		t1.getSobrinhos().add(s2);
		s2.getTios().add(t1);
		
		t2.getSobrinhos().add(s1);
		s1.getTios().add(t2);
		
		t2.getSobrinhos().add(s2);
		s2.getTios().add(t2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluir(t1)
			.incluir(t2)
			.incluir(s1)
			.incluir(s2)
			.fecharTransacao()
			.fechar();
		
	}
	
}
