package lesson3.Ex001_Foo;

public class Main {
    public static void main(String[] args) {
        Foo foo1 = new Foo() {
            @Override
            void method1() {
                System.out.println("Method1");
            }

            @Override
            void method2() {
                System.out.println("Method2");
            }
        };
        foo1.method1();

        Foo foo2 = new Foo() {
            @Override
            void method2() {
                System.out.println(">>> Method2");
            }

            @Override
            void method1() {
                System.out.println(">>> Method1");
            }
        };
        foo2.method2();
    }
}
