public class Main {
    public static void main(String[] args) {
        //Tema 2
        //Creacion de objetos
        Dog dog1 = new Dog();

        //Assignacion de valores
        dog1.name = "Gilda";
        dog1.age = 6;
        dog1.race = "Huscky";
        dog1.dangerous = false;

        //Metodos
        dog1.displayDog();

        //Tema 7
        //Asignar valores
        int a = 5;
        int b = 10;

        String nombre1 = "Fred";
        String nombre2 = "Joseph";

        int i = 2;
        int j = 8;

        //Metodos
        if (a < b){
            System.out.println("B es mayor que A");
        } else {
            System.out.println("A es mayor o igual a B");
        }

        if (nombre1 == nombre2){
            System.out.println("Los dos nombres son iguales");
        }else {
            System.out.println("Los nombres son diferentes");
        }

        if (i < 10 && j > 5){
            System.out.println("i es menor a 10 y j es mayor a 5");
        }else {
            System.out.println("Alguno de las dos variables no cumple el requisito");
        }
        if (i < 10 || j > 9){
            System.out.println("i es menor a 10 o j es mayor que 9");
        }else {
            System.out.println("Ninguna de las dos variables no cumple el requisito");
        }

    }
}