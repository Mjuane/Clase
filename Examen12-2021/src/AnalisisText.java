public class AnalisisText {



    public static char[] textoMinusculas(String texto) {
        int l = texto.length();
        char[] matriz = new char[l];

        texto = texto.toLowerCase();

        for (int i = 0; i < l; i++){
            matriz[i] = texto.charAt(i);
        }

        return matriz;
    }

    public static void impimirMatrizChars(char[] matriz) {
        System.out.print("Texto de trabajo: ");
        for (char letra : matriz){
            System.out.print(letra);
        }
        System.out.println();
    }

    public static boolean esDelimitador(char[] matriz, int posicion, char[] deli) {
        boolean esDeli = false;
        int l = deli.length;

        for (char c : deli) {
            if (matriz[posicion] == c) {
                esDeli = true;
                break;
            }
        }

        return esDeli;
    }

    public static boolean esInicioDePalabra(char[] matriz, int posicion, char[] deli) {
        boolean esInicio = false;

        if (esDelimitador(matriz, posicion, deli)){
        }else if (posicion == 0){
            esInicio = true;
        }else if (posicion >= 1 && esDelimitador(matriz, posicion - 1, deli)){
            esInicio = true;
        }

        return esInicio;
    }

    public static int longitudPalabra(char[] matriz, int posicion, char[] deli){
        int longitud = 0;
        boolean finDePalabra = false;

        for (int i = posicion; i < matriz.length; i++){
            for (int k = 0; k < deli.length; k++) {
                if (matriz[i] != deli[k]){
                    longitud++;
                }else {
                    finDePalabra = true;
                }
                break;
            }
            if (finDePalabra){
                break;
            }
        }

        return longitud;
    }

    public static String retornarPalabra(char[] matriz, int posicion, char[] deli){
        String palabra = "";
        int longitud = longitudPalabra(matriz, posicion, deli );

        for (int i = 0; i <= longitud; i++){
            palabra += matriz[i + longitud];
        }

        return palabra;
    }

    public static void main(String[] args) {
        char[] delimitadores = {' ', '-', ',', '.', '!', '?', '\''};
        String pruebaEjecucion = "Una noia anomenada Anna va anar a cercar al bosc un home, alla hi va trobar un cec que intentava  trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";
        int posicion = 9;

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.print("Lista de delimitadores: ");
        for (char delimitador : delimitadores){
            System.out.print(delimitador);
        }
        System.out.println();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        impimirMatrizChars(textoMinusculas(pruebaEjecucion));
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");

        if (esInicioDePalabra(textoMinusculas(pruebaEjecucion), posicion, delimitadores )){
            System.out.println("Es inicio");
        }else {
            System.out.println("No es inicio");
        }

        System.out.println(longitudPalabra(textoMinusculas(pruebaEjecucion), posicion, delimitadores ));

        System.out.println(retornarPalabra(textoMinusculas(pruebaEjecucion), posicion, delimitadores ));


    }

}