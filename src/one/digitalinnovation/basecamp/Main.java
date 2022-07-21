package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args){
        //Calculadora
        System.out.println ("Exercício calculadora:");
        Calculadora.soma(16,25);
        Calculadora.subtracao(36,50);
        Calculadora.multiplicacao(7,2);
        Calculadora.divisao(50,5);

        //Mensagem
        System.out.println ("Exercício mensagem:");
        Mensagem.obterMensagem( 7);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(3);

        //Emprestimo
        System.out.println ("Exercício emprestimo:");
        Emprestimo.calcular(500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(500, 6);
    }
}
