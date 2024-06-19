package navegadorinternet;

public abstract class NavegadorAbst implements NavegadorInt {

	  @Override
	  public void exibirPagina() {
	    System.out.println("Exibindo a p�gina.");
	  }

	  @Override
	  public void adicionarNovaAba() {
	    System.out.println("Adicionando p�gina.");
	  }

	  @Override
	  public void atualizarPagina() {
	    System.out.println("Atualizando p�gina.");
	  }
	}