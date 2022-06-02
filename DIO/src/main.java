public class main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicios da calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);


        // Mensagem
        System.out.println("Exercicios Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(24);

        // Emprestimo
        System.out.println("Exercicios Emprestimo");
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(1000,5);
    }
}
