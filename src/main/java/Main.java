public class Main {
        public static void main(String[] args) {
            CalcularFrete calcularFrete = new CalcularFrete();
            CalculoFrete fretea = new FreteFracionado();

            calcularFrete.setFrete(fretea);
            System.out.println("Valor do frete fracionado: R$" + calcularFrete.valorFrete());

             fretea = new FreteLotacao();
            calcularFrete.setFrete(fretea);
            System.out.println("Valor do frete lotação: R$" + calcularFrete.valorFrete());
        }
    }

