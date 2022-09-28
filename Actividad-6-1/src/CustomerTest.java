public class CustomerTest {
    public static void main(String[] args) {

        //Crear objetos
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

        //Asignar valores
        cust1.customerID = 1;
        cust1.name = "Mary Smith";
        cust1.emailAddress = "mary.smith@gmail.com;";

        cust2.customerID = 2;
        cust2.name = "Frank Jones";
        cust2.emailAddress = "frank.jones@gmail.com";
        cust2 = cust1;

        //Llamar metodos
        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();
    }
}
