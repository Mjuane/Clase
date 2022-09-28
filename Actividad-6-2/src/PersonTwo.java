public class PersonTwo {
    //Variables
    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();

    //Metodos
    public void displayPersonInfo(){
        name.append("Fernando");
        name.append(" ");
        name.append("Gonzalez");
        //Mostrar el objeto name
        System.out.println("Nombre: " + name.toString());
        //Mostrar la capacidad
        System.out.println("Capacidad del objeto name: " + name.capacity());
    }
}
