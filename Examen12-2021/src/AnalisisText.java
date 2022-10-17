public class AnalisisText {
    public static void main(String[] args) {
        char[] delimitadores = {' ', '-', ',', '.', '!', '?', '\''};
        String pruebaEjecucion = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec que intentava  trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.print("Lista de delimitadores: ");
        for (char delimitador : delimitadores){
            System.out.print(delimitador);
        }
        System.out.println();
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Texto de trabajo: " + pruebaEjecucion);
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::");

    }


    public static char[] textoMinusculas(String texto){
        int l = texto.length();
        char[] matriz = new char[l];

        texto = texto.toLowerCase();

        for (int i = 0; i < l; i++){
            matriz[i] = texto.charAt(i);
        }

        return matriz;
    }


}