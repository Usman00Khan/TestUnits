public class Calculate {
    private final Division division = new Division();
    private final Multiplication multiplication = new Multiplication();
    private final Subtraction subtraction = new Subtraction();
    private final Addition addition = new Addition();

    public float sum(float a, float b) {
        return addition.operate(a, b);
    }

    public float diff(float a, float b) {
        return subtraction.operate(a, b);
    }

    public float mul(float a, float b){

        return multiplication.operate(a, b);
    }
    public float div(float a,float b){
        return division.operate(a, b);
    }
}
