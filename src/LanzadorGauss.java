public class LanzadorGauss {

    public static void main(String[] args) {

        // Obtiene la matriz aumentada definida para el sistema.
        double[][] matriz = DefinicionMatriz.defmatriz();

        // Convierte la matriz en una matriz triangular superior.
        Gauss.eliminacionGaussiana(matriz);

        // Calcula las soluciones mediante sustitución regresiva.
        double[] soluciones = Gauss.sustitucionRegresiva(matriz);

        // Muestra las soluciones obtenidas.
        System.out.println("Soluciones del sistema:");

        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}