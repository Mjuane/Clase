import javax.swing.*;
import java.lang.Math;

public class Main {


    public static void main(String[] args) {
        //Variables
        int filas = 14;
        int columnas = 18;
        int minas = 40;
        String[][] tablero = new String[filas][columnas];

        //Metodos
        crearTablero(tablero, filas, columnas);
        ponerMinas(tablero, filas, columnas, minas);
        dibujarTablero(tablero, filas, columnas);
    }

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void crearTablero(String[][] args, int x, int z){
        int filas = x;
        int columnas = z;
        String[][] tablero = args;

        for (int i = 0; i < filas; i++){
            for (int k = 0; k < columnas;k++){
                tablero[i][k] = "0";
            }
        }
    }

    public static void ponerMinas(String[][] args, int x, int z, int c) {
        int filas = x;
        int columnas = z;
        int minas = c;
        String[][] tablero = args;
        int minasColocadas = 0;
        int nRandom1 = 0;
        int nRandom2 = 0;

        while (minasColocadas < minas) {
            nRandom1 = (int) (Math.random() * (filas - 1)) + 1;
            nRandom2 = (int) (Math.random() * (columnas - 1)) + 1;

            if (tablero[nRandom1][nRandom2] == "x") {
            } else {
                tablero[nRandom1][nRandom2] = "x";
                minasColocadas++;
                sumarColindantes(tablero, nRandom1, nRandom2, filas, columnas);
            }
        }
    }

    public static void sumarColindantes(String[][] args, int x, int y, int z, int c){
        int filaActual = x;
        int columnaActual = y;
        String[][] tablero = args;
        int filas = z;
        int columnas = c;

        //Esquina izq-arriba
        if (filaActual == 0 && columnaActual == 0){
            tablero[filaActual+1][y] += 1;
            tablero[filaActual][y+1] += 1;
            tablero[filaActual+1][y+1] += 1;
        }else {// Pared izq
            if (filaActual >= 1 && columnaActual == 0){
                tablero[filaActual+1][columnaActual] += 1;
            }else {//Pared arriba
                if (filaActual == 0 && columnaActual >= 1){
                    tablero[filaActual+1][columnaActual+1] += 1;
                }else {//Esquina der-abajo
                    if (filaActual == filas-1 && columnaActual == columnas-1){
                        tablero[filaActual+1][columnaActual+1] += 1;
                    }else {//Pared derecha
                        if (filaActual < filas-1 && columnaActual == columnas-1){
                            tablero[filaActual+1][columnaActual+1] += 1;
                        }else {//Pared abajo
                            if (filaActual < filas-1 && columnaActual == columnas-1){
                                tablero[filaActual+1][columnaActual+1] += 1;
                            }
                        }
                    }
                }
            }
        }



    }

    public static void dibujarTablero(String[][] args, int x, int z){
        int filas = x;
        int columnas = z;
        String[][] tablero = args;

        for (int i = 0; i < filas; i++){
            for (int k = 0; k < columnas;k++){
                if (tablero[i][k] == "0"){
                    System.out.print(ANSI_CYAN + tablero[i][k] + " " + ANSI_CYAN);
                }else {
                    System.out.print(ANSI_RED + tablero[i][k] + " " + ANSI_RED);
                }

            }
            System.out.println();
        }
    }

}