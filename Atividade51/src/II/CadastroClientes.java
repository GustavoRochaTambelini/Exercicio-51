package II;
import javax.swing.JOptionPane;

/**

* Esse programa visa exemplificar a utilização de array, aplicando sobre um

* cadastro de clientes.

*

* @author Douglas Daniel Del Frari

*/

public class CadastroClientes {

// array de clientes

private static String[] listaClientes;

private static String menu = "CADASTRO CLIENTES\n\n" +

"1 --> Cadastrar clientes\n" +

"2 --> Listar clientes\n" +

"3 --> Sair";

/**

* Método inicial das aplicações Java SE

* @param args argumentos opcionais

*/

public static void main(String[] args) {

// escolha do usuario

String opcao = "";

do {

opcao = JOptionPane.showInputDialog(menu);

if (opcao.equals("1")) {

// cadastrar clientes

cadastrarClientes();

} else if (opcao.equals("2")) {

// listar clientes

listarClientes();

}

} while (!opcao.equals("3")); // comparacao usando String

} // fim do main

/**

* Lista os clientes cadastrados no ARRAY.

*/

private static void listarClientes() {

if (listaClientes!=null) {

// acumula a listagem numa variavel local

String listaClientesTemporario = "Lista de Clientes \n\n";

for (int i = 0; i < listaClientes.length; i++) {

listaClientesTemporario += listaClientes[i] + "\n";

}

// exibe na tela a listagem de clientes

JOptionPane.showMessageDialog(null,listaClientesTemporario);

} else {

// se nao tiver clientes o ARRAY será null, entao pode-se tratar com

// uma mensagem personalizada.

JOptionPane.showMessageDialog(null,

"É necessário realizar cadastro de clientes primeiro");

}

}

/**

* Esse metodo cadastra os usuarios na quantidade

* informada pelo usuario.

*/

private static void cadastrarClientes() {

// utiliza o metodo showInputDialog para perguntar a quantidade e

// converte o valor de String para inteiro e armazena na variavel

// local quantidade.

int quantidade = Integer.parseInt(JOptionPane

.showInputDialog("Quantos clientes deseja cadastrar?"));

// inicializa o ARRAY com tamanho informado pelo usuario

listaClientes = new String[quantidade];

// percorre todo tamanho do ARRAY e cadastra seus elementos

for (int i = 0; i < quantidade; i++) {

listaClientes[i] = JOptionPane.showInputDialog("Nome do cliente "+(i+1));

}

JOptionPane.showMessageDialog(null, "Clientes cadastrados");

}

} // fim da classe
	    
	    
	

