package lesson6.SOLID.Ex004_ISP;

// Упоминание родительского интерфейса излишне, т.к. он и так имплементируется дочерними интерфейсами
//public class Iphone implements BasePhone, Fax, Email{
//}

public class Iphone implements Email, Fax {
    @Override
    public void call() {
        // TODO Auto-generated method stub
    }

    @Override
    public void sendSMS() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sendEmail() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sendFax() {
        // TODO Auto-generated method stub

    }
}