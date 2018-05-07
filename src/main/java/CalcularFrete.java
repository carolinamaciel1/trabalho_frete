public class CalcularFrete {
        private CalculoFrete frete;
        private String cepOrigem;
        private String cepDestino;
        private NotaFiscal notaFiscal;


        public double valorFrete() {
            return frete.calcular(cepOrigem, cepDestino, notaFiscal);
        }


        public void setFrete(CalculoFrete frete) {
            this.frete = frete;
        }
    }

