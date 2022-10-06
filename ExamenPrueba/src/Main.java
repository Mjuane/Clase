public class Main {

    public static double mitjaAritmetica(int[] m){
        double mitja = 0;
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

    public static void main(String[] args) {
        int[] m = {5, 6, 3, 5, 3, 8, 1, 5};
//        int[] m = {1, 2, 3, 4, 5, 6, 7, 8};
        //int[] m = {8, 7, 6, 5, 4, 3, 2, 3};

        System.out.println("Media Artimetica: " + mitjaAritmetica(m));
        System.out.println("Valor minimo: " + valorMinimo(m));
        System.out.println("Index minimo: " + indexMinimo(m));
        System.out.println("Valor maximo: " + valorMaximo(m));
        System.out.println("Index maximo: " + indexMaximo(m));
        System.out.println("Esta ordenado ascendente: " + estaOrdenadoAscendente(m));
        System.out.println("Esta ordenado descendiente: " + estaOrdenadoDescendiente(m));

    }
}