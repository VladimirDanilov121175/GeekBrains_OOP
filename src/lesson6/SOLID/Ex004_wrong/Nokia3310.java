package lesson6.SOLID.Ex004_wrong;

// Последствия некорректно составленного интерфейса: кнопочный телефон имеет кнопки для реализации функционала,
// которые не умеет реализовывать - посылать факс и работать с электронной почтой, хотя умеет звонить и слать смс.

public class Nokia3310 implements Phone{
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
