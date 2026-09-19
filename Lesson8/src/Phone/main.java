package Phone;

public class main {
    public static void main() {

        Phone phone1 = new Phone("+375291234567", "iPhone 15", 171.0);
        Phone phone2 = new Phone("+375297654321", "Samsung Galaxy S24", 168.0);
        Phone phone3 = new Phone("+375331112233", "Xiaomi 14", 193.0);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Саша");
        System.out.println("Номер phone1: " + phone1.getNumber());

        phone2.receiveCall("Маша");
        System.out.println("Номер phone2: " + phone2.getNumber());

        phone3.receiveCall("Даша");
        System.out.println("Номер phone3: " + phone3.getNumber());

        phone2.receiveCall("Ольга", "+375441112233");

        phone1.sendMessage("+375291112233", "+375297778899", "+375339995566");
    }
}
