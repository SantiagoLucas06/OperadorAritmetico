public class TarefaCalculoMedio {
        public static void main(String[] args) {

            double nota1 = 7.5;
            double nota2 = 8.0;
            double nota3 = 6.5;
            double nota4 = 9.0;

            double media = calcularMedia(nota1, nota2, nota3, nota4);
            imprimirResultado(media);
        }
        private static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
            return (nota1 + nota2 + nota3 + nota4) / 4;
        }
        private static void imprimirResultado(double media) {
            System.out.println("A média das notas é: " + media);
        }
}