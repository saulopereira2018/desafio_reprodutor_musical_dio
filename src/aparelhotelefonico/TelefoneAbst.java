package aparelhotelefonico;

public abstract class TelefoneAbst implements TelefoneInt {

	  @Override
	  public void ligar(int numero) {
	    System.out.println("Ligando para " + numero);
	  }

	  @Override
	  public void atender() {
	    System.out.println("Atendendo a liga��o.");
	  }

	  @Override
	  public void iniciarCorreioVoz() {
	    System.out.println("Correio de voz.");
	  }
	}