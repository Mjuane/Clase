import java.util.Arrays;

public class Main {

    public static double mitjaAritmetica(int[] m){
        double mitja;
        int temp = 0;

        for (int i = 0; i < m.length;i++){
            temp += m[i];
        }

        mitja = (double) temp/m.length;

        return mitja;
    }

    public static int valorMinimo(int[] m){
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < m.length; i++) {
            if (minimo > m[i]){
                minimo = m[i];
            }
        }
        return minimo;
    }
    public static int indexMinimo(int[] m){
        int minimo = Integer.MAX_VALUE;
        int indexMin = 0;

        for (int i = 0; i < m.length; i++) {
            if (minimo > m[i]){
                minimo = m[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
    public static int valorMaximo(int[] m){
        int minimo = Integer.MIN_VALUE;

        for (int i = 0; i < m.length; i++) {
            if (minimo < m[i]){
                minimo = m[i];
            }
        }
        return minimo;
    }
    public static int indexMaximo(int[] m){
        int minimo = Integer.MIN_VALUE;
        int indexMin = 0;

        for (int i = 0; i < m.length; i++) {
            if (minimo < m[i]){
                minimo = m[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static boolean estaOrdenadoAscendente(int[] m){
        boolean ordenado = false;

        for (int i = 0; i < m.length-1;i++){
            if (m[i] < m[i+1]){
                ordenado = true;
            }else {
                ordenado = false;
                break;
            }
        }

        return ordenado;
    }

    public static boolean estaOrdenadoDescendiente(int[] m){
        boolean ordenado = false;

        for (int i = 0; i < m.length-1;i++){
            if (m[i] > m[i+1]){
                ordenado = true;
            }else {
                ordenado = false;
                break;
            }
        }

        return ordenado;
    }

    public static String invertir(int[] m){
        int[] invertido = new int[m.length];
        String inv;
        for (int i = 0; i < m.length;i++){
            invertido[(m.length-1)-i] = m[i];
        }

        inv = Arrays.toString(invertido);//Arrays.toString(array) pasa a string toda la infomracion de la array
        return inv;
    }

    public static int indexPrimeraOcurrencia(int[] m, int numero){
        int index = 0;

        for (int i = 0; i < m.length-1;i++){
            if (m[i] == numero) {
                index = i;
                break;
            }else {
                index = -1;
            }
        }

        return index;
    }

    public static int valorMasCercanoMedia(int[] m, double media){
        int numCercano = Integer.MAX_VALUE;
        int resta;
        int respuesta = -1;
        int mediaAritmetica = (int) media;

        for(int i = 0; i < m.length-1;i++){
            resta = Math.abs(m[i] - mediaAritmetica);
            if (resta < numCercano) {
                numCercano = resta;
                respuesta = m[i];
            }
        }

        return respuesta;
    }

    public static void main(String[] args) {
        int[] m = {5, 6, 3, 5, 3, 8, 1, 5};
        //int[] m = {1, 2, 3, 4, 5, 6, 7, 8};
        //int[] m = {8, 7, 6, 5, 4, 3, 2, 3};
        int numero = 3;

        System.out.println("Media Artimetica: " + mitjaAritmetica(m));
        System.out.println("Valor minimo: " + valorMinimo(m));
        System.out.println("Index minimo: " + indexMinimo(m));
        System.out.println("Valor maximo: " + valorMaximo(m));
        System.out.println("Index maximo: " + indexMaximo(m));
        System.out.println("Esta ordenado ascendente: " + estaOrdenadoAscendente(m));
        System.out.println("Esta ordenado descendiente: " + estaOrdenadoDescendiente(m));
        System.out.println("Ordenado a la inversa: " + invertir(m));
        System.out.println("Primer index del numero dado: " + indexPrimeraOcurrencia(m, numero));
        System.out.println("Valor mas cercano a la media: " + valorMasCercanoMedia(m, mitjaAritmetica(m)));
    }
}