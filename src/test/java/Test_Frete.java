import junit.framework.TestCase;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test_Frete extends TestCase{
        //Testes Unitários do Frete Fracionado e o Frete Lotação
        @Test
        public void test_CalcularFreteFracionado(){
            NotaFiscal n1 = new NotaFiscal();
            CalcularFrete calcularFretef = new CalcularFrete();
            CalculoFrete fretea = new FreteFracionado();
            double resultado_esperado_01=100.00;
            double resultado_obtido_01= fretea.calcular("6000","6000",n1);
            assertEquals(resultado_esperado_01,resultado_obtido_01);
        }

        @Test
        public void test_CalcularFreteLotacao(){
            NotaFiscal n1 = new NotaFiscal();
            CalcularFrete calcularFretel = new CalcularFrete();
            CalculoFrete freteb = new FreteLotacao();
            double resultado_esperado_02=250.00;
            double resultado_obtido_02= freteb.calcular("6000","6000",n1);
            assertEquals(resultado_esperado_02,resultado_obtido_02);
        }



    //Mock Objects do Frete Fracionado e o Frete Lotação
    @Test
        public void test_MockCalcularFreteFracionado(){
            NotaFiscal n1 = new NotaFiscal();
            CalcularFrete calcularFretel = new CalcularFrete();
            CalculoFrete fretemock1 = mock(FreteFracionado.class);
            when(fretemock1.calcular("","",n1)).thenReturn(100.00);
            assertEquals(100.00,fretemock1.calcular("","",n1));
        }

        public void test_MockCalcularFreteLotacao(){
            NotaFiscal n1 = new NotaFiscal();
            CalcularFrete calcularFrete2 = new CalcularFrete();
            CalculoFrete fretemock2 = mock(FreteLotacao.class);
            when(fretemock2.calcular("","",n1)).thenReturn(250.00);
            assertEquals(250.00,fretemock2.calcular("","",n1));
        }

    }


