
public class Main {


    public static void main(String[] args) {
        tablero();
    }

    public static final String ANSI_CYAN = "\u001B[36m";

    public static void tablero(){
        int filas = 14;
        int columnas = 18;

        for (int i = 0; i < filas; i++){
            for (int k = 0; k < columnas;k++){
                System.out.print(ANSI_CYAN + "0 " + ANSI_CYAN);
            }
            System.out.println(" ");
        }
    }
}