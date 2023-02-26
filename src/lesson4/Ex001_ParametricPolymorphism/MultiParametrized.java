package lesson4.Ex001_ParametricPolymorphism;

public class MultiParametrized<E1, E2, E3> {
    public E1 value1;
    public E2 value2;
    public E3 value3;

    public MultiParametrized(E1 e1, E2 e2, E3 e3) {
        this.value1 = e1;
        this.value2 = e2;
        this.value3 = e3;
    }

    @Override
    public String toString() {
        return String.format("""
                E1 type: %s, E2 type: %s, E3 type: %s""",
                this.value1.getClass().getSimpleName(),
                this.value2.getClass().getSimpleName(),
                this.value3.getClass().getSimpleName());
    }
}
