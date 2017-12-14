package factorial;

/**
 * Esta programa sirve para factorizar un número.
 *
 * @author tperezrodriguez
 */
public class Factorial {

    /**
     * Método main del programa
     *
     * @param args argumentos del main
     */
    public static void main(String[] args) {

        int num;
        int factorizado;

        num = 8;

        CalcularFactorizado calculo1 = new CalcularFactorizado();
        factorizado = calculo1.calcularNumero(num);
        System.out.println(factorizado);

    }

}
