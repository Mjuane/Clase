import java.util.List;

public class Tablero {
    //Variables
    private final int filas = 16;
    private final int columnas = 31;
    private final char[][] tablero = new char[filas][columnas];

    //Metodos

    public void crearTablero(){
        List<Casilla> casilla
        for (int i = 0; i < filas; i++){
            for (int k = 0; k < columnas;k++){

                tablero[i][k] = '0';
            }
        }
    }

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_RED = "\u001B[31m";

    public void dibujarTablero(){
        for (int i = 0; i < filas; i++){
            for (int k = 0; k < columnas;k++){
                if (tablero[i][k] != 'x'){
                    System.out.print(ANSI_CYAN + tablero[i][k] + " " + ANSI_CYAN);
                }else {
                    System.out.print(ANSI_RED + tablero[i][k] + " " + ANSI_RED);
                }
            }
            System.out.println();
        }
    }
}
