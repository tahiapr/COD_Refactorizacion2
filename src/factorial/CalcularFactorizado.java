/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 * Esta clase haya el número factorizado
 *
 * @author tperezrodriguez
 */
public class CalcularFactorizado {

    /**
     * Método que se encarga de factorizar un número que ya sabemos
     *
     * @param num número que queremos factorizar, recibido de la main class
     * @return factorizado
     */
    public int calcularNumero(int num) {
        int factorizado, contador;

        if (num == 0) {
            factorizado = 1;
        } else {
            factorizado = 1;
            for (contador = num; contador >= 1; contador--) {
                factorizado = factorizado * contador;
            }
        }

        return factorizado;
    }
}
