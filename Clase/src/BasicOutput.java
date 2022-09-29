public class BasicOutput {

    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("********");
        System.out.println("Ejercicio 1");
        System.out.println("********");
        //Solución
        System.out.println("Hello!");

        //Ejercicio 2
        System.out.println("********");
        System.out.println("Ejercicio 2");
        System.out.println("********");
        //Solución  %s es para determinar que el valor de var es String
        String var01 = "Hello!";
        System.out.printf("%s", var01);;
        System.out.println();

        //Ejercicio 3
        System.out.println("********");
        System.out.println("Ejercicio 3");
        System.out.println("********");
        //Solución  Cada %s determina que las dos var son string y que iran en esa posición
        String var02 = "How are you?";
        System.out.printf("My friend! %s %s", var01, var02);
        System.out.println();

        //Ejercicio 4
        System.out.println("********");
        System.out.println("Ejercicio 4");
        System.out.println("********");
        //Solución
        System.out.printf("%s %s", var01, var02);
        System.out.println();

        //Ejercicio 5
        System.out.println("********");
        System.out.println("Ejercicio 5");
        System.out.println("********");
        //Solución  \n indica salto de linea
        System.out.printf("%s\n%s", var01, var02);
        System.out.println();

        //Ejercicio 6
        System.out.println("********");
        System.out.println("Ejercicio 6");
        System.out.println("********");
        //Solución  \t indica una tabulacion de 4 espacios
        System.out.printf("%s\t%s", var01, var02);
        System.out.println();

        //Ejercicio 7
        System.out.println("********");
        System.out.println("Ejercicio 7");
        System.out.println("********");
        //Solución
        String firstName = "John";
        String lastName = "Doe";
        System.out.printf("%s %s", firstName, lastName);
        System.out.println();

        //Ejercicio 8
        System.out.println("********");
        System.out.println("Ejercicio 8");
        System.out.println("********");
        //Solución %d indica que la var asignada es un int
        int var1 = 2;
        System.out.printf("%d", var1);
        System.out.println();

        //Ejercicio 9
        System.out.println("********");
        System.out.println("Ejercicio 9");
        System.out.println("********");
        //Solución  %f defina un valor float que por defecto muestra 6 decimales
        double var001 = 2.55;
        System.out.printf("%f", var001);
        System.out.println();

        //Ejercicio 10
        System.out.println("********");
        System.out.println("Ejercicio 10");
        System.out.println("********");
        //Solución

        //Ejercicio 11
        System.out.println("********");
        System.out.println("Ejercicio 11");
        System.out.println("********");
        //Solución

        //Ejercicio 12
        System.out.println("********");
        System.out.println("Ejercicio 12");
        System.out.println("********");
        //Solución

        //Ejercicio 13
        System.out.println("********");
        System.out.println("Ejercicio 13");
        System.out.println("********");
        //Solución

        //Ejercicio 14
        System.out.println("********");
        System.out.println("Ejercicio 14");
        System.out.println("********");
        //Solución

        //Ejercicio 15
        System.out.println("********");
        System.out.println("Ejercicio 15");
        System.out.println("********");
        //Solución
    }
}
