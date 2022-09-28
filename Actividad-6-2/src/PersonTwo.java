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
        System.out.println("Nombre: " + name);
        //Mostrar la capacidad
        System.out.println("Capacidad del objeto name: " + name.capacity());

        phoneNumber.append("5551234567");
        phoneNumber.insert(3,"-");
        phoneNumber.insert(7,"-");
        //Mostrar phoneNumber
        System.out.println("Tel: " + phoneNumber);

        //Mostrar solo primer nombre
        System.out.println("Primer nombre: " + name.substring(0,8));
    }
}
