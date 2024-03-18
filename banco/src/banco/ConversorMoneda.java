package banco;

/**
 * @author Pablo
 */

/**
 * Clase: ConversorMoneda
 */
public class ConversorMoneda {
    /**
     * Métodos para convertir montos de dólares a yenes.
     *
     * @param monto
     * @return montoConvertido
     */
    public double convertirDolaresAYenes(double monto) {
        // Lógica para convertir de dólares a yenes
        double montoConvertido = monto * 110.99; // Tasa de cambio de dólares a yenes
        return montoConvertido;
    }

    /**
     * Métodos para convertir montos de dólares a libras esterlinas
     *
     * @param monto
     * @return montoConvertido
     */
    public double convertirDolaresALibrasEsterlinas(double monto) {
        // Lógica para convertir de dólares a libras esterlinas
        double montoConvertido = monto * 0.72; // Tasa de cambio de dólares a libras esterlinas
        return montoConvertido;
    }

    /**
     * Métodos para convertir montos de yenes a dólares.
     *
     * @param monto
     * @return montoConvertido
     */
    public double convertirYenesADolares(double monto) {
        // Lógica para convertir de yenes a dólares
        double montoConvertido = monto / 110.99; // Tasa de cambio de yenes a dólares
        return montoConvertido;
    }

    /**
     * Métodos para convertir montos de enes a esterlinas.
     *
     * @param monto
     * @return montoConvertido
     */
    public double convertirYenesALibrasEsterlinas(double monto) {
        // Lógica para convertir de yenes a libras esterlinas
        double montoConvertido = monto * 0.0065; // Tasa de cambio de yenes a libras esterlinas
        return montoConvertido;
    }

    /**
     * Métodos para convertir montos de libras esterlinas a dólares.
     *
     * @param monto
     * @return montoConvertido
     */
    public double convertirLibrasEsterlinasADolares(double monto) {
        // Lógica para convertir de libras esterlinas a dólares
        double montoConvertido = monto / 0.72; // Tasa de cambio de libras esterlinas a dólares
        return montoConvertido;
    }

    /**
     * Métodos para convertir montos de libras esterlinas yenes.
     *
     * @param monto
     * @return montoConvertido
     */
    public double convertirLibrasEsterlinasAYenes(double monto) {
        // Lógica para convertir de libras esterlinas a yenes
        double montoConvertido = monto / 0.0065; // Tasa de cambio de libras esterlinas a yenes
        return montoConvertido;
    }
}
