public class Empresa {
    public static void main(String[] args) {
		
		Vendedor v = new Vendedor();
		v.setDataDeEntrada("25/04/2022");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setNome("Fernanda");
		v.setRg("4123321");
        v.setSalario(2500.0);
		v.calculaSalario();		
		 
		
		Gerente g1 = new Gerente();
		g1.departamento = "Vendas";
		g1.dataDeEntrada = "23/04/2022";
		g1.estaNaEmpresa = true;
		g1.nome = "Maria";		
		g1.rg = "232323";
		g1.salario = 5500.0;
		g1.calculaSalario();
		
		
		g1.setLogin("Maria");
		g1.setSenha("2342");
		
		Supervisor s = new Supervisor();
        s.departamento = "Vendas";
		s.dataDeEntrada = "23/04/2022";
		s.estaNaEmpresa = true;
		s.nome = "Lucas";		
		s.rg = "123456";
		s.salario = 5500.0;
        s.calculaSalario();

        s.setLogin("Lucas");
		s.setSenha("1423");

		
		ControleDeBonificacao controle = new ControleDeBonificacao();
		controle.calculaTotalDeBonus(v);
		controle.calculaTotalDeBonus(g1);
		controle.calculaTotalDeBonus(s);
			
		System.out.println(v.getDataDeEntrada());
		System.out.println(v.getDepartamento());
		System.out.println(v.getNome());
		System.out.println(v.getRg());
		System.out.println(v.getSalario());
		System.out.println(v.isEstaNaEmpresa());
		System.out.println(v.bonifica());
		
		
		System.out.println("//////////////////////////////");
		g1.autentica("Maria", "2342");
		System.out.println(g1.getDataDeEntrada());
		System.out.println(g1.getDepartamento());
		System.out.println(g1.getNome());
		System.out.println(g1.getRg());
		System.out.println(g1.getSalario());		
		System.out.println(g1.bonifica());
		
		System.out.println("//////////////////////////////");
		s.autentica("Lucas", "1423");
		System.out.println(s.getDataDeEntrada());
		System.out.println(s.getDepartamento());
		System.out.println(s.getNome());
		System.out.println(s.getRg());
		System.out.println(s.getSalario());		
		System.out.println(s.bonifica());

		System.out.println("Total de bonus: R$" + controle.getTotalDeBonus());
	}
    
}
