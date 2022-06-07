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


        // Quadrilatero
        System.out.println("Exercicios do Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5,5);
        Quadrilatero.area(7,8,9);


        // QuadrilateroReturn
        System.out.println("Exercicio Quadrilatero return");

        double areaQuadrado = QuadrilateroRetorn.area(3);
        System.out.println("Área do quadrado:"+ areaQuadrado);

        double areaRetangulo = QuadrilateroRetorn.area(5,5);
        System.out.println("Área do retangulo:" + areaRetangulo );

        double areaTrapezio = QuadrilateroRetorn.area(7,8,9);
        System.out.println("Área do Trapezio:" + areaTrapezio);

    }
}
