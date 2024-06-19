package aparelho;

public class AparelhoMultiuso implements reprodutormusical.ReproducaoInt, aparelhotelefonico.TelefoneInt, navegadorinternet.NavegadorInt {


  @Override
  public void tocar() {
    System.out.println("Ouvindo a m�sica.");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando a m�sica.");
  }

  @Override
  public void selecionarMusica(String nome) {
    System.out.println(nome + " selecionada");
  }

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo liga��o.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }

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