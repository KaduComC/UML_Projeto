import celular.iPhone;

public class Usuario {
    public static void main(String[] args) {
        iPhone celular = new iPhone();

        System.out.println("Aparelho Telefonico");
        celular.ligar();
        celular.atender();
        celular.iniciarCorreioVoz();

        System.out.println("\nMusica");
        celular.tocarMusica();
        celular.selecionarMusica();
        celular.pausarMusica();

        System.out.println("\nNavegador");
        celular.exibirPagina();
        celular.adicionarNovaAba();
        celular.atualizarPagina();
    }
}
