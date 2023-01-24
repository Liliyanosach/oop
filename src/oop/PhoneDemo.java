package oop;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone phone1 = new Phone("89504212321", "IPhone", 0.5);
        Phone phone2 = new Phone("89514212324","Nokia");
        Phone phone3 = new Phone();

        phone2.weight = 0.3;

        phone3.number = "89503252321";
        phone3.model = "Samsung";
        phone3.weight = 0.4;

        System.out.println("Номер телефона " + phone1.getNumber() + " , модель " + phone1.model + " , вес " + phone1.weight);
        System.out.println("Номер телефона " + phone2.getNumber() + " , модель " + phone2.model + " , вес " + phone2.weight);
        System.out.println("Номер телефона " + phone3.getNumber() + " , модель " + phone3.model + " , вес " + phone3.weight);

        phone1.receiveCall("Женя");
        phone2.receiveCall("Злата");
        phone3.receiveCall("Алиса");

        phone1.receiveCall("Жена", phone1.number);


    }
}
