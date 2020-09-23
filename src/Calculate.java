public class Calculate {
    public float sum(float a, float b) {
        return a + b;
    }

    public float diff(float a, float b) {
        return a - b;
    }

    public float mul(float a, float b){

        return a*b;
    }
    public float div(float a,float b){
        if (b==0)
            throw new ArithmeticException();
        return a/b;
    }
}
