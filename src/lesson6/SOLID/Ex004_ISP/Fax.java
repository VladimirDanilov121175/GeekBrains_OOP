package lesson6.SOLID.Ex004_ISP;

// Дочерний интерфейс, расширяющий возможность родительского

public interface Fax extends BasePhone{
    void sendFax();
}
