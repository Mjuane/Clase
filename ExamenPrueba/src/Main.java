public class Main {
    public static void main(String[] args) {
        int[] m = {5, 6, 3, 5, 3, 8, 1, 5};

        System.out.println(mitjaAritmetica(m));
    }

    public static double mitjaAritmetica(int[] m){
        double mitja = 0;
        int temp = 0;

        for (int i = 0; i < m.length;i++){
            temp += m[i];
        }

        mitja = (double) temp/m.length;

        return mitja;
    }
}