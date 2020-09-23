public class Division {
    public Division() {
    }

    public float operate(float a, float b) {
        if (b == 0)
            throw new ArithmeticException();
        return a / b;
    }
}