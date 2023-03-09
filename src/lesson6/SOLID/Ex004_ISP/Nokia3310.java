package lesson6.SOLID.Ex004_ISP;

// Разделение интерфейсов по принципу SOLID "Interface Segregation Principal" дало возможность не перегружать
// кнопочный телефон функциями, которые он не может реализовать в принципе - посылать факсы и почту.
// Только базовый функционал - звонки и смс

public class Nokia3310 implements BasePhone{
    @Override
    public void call() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sendSMS() {
        // TODO Auto-generated method stub

    }
}
