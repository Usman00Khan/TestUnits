import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerAddMulSubDiv {
    public static void main(String[] args) {
        Result res = JUnitCore.runClasses(SuiteAddMulSubDiv.class);
        for(Failure f: res.getFailures()){
            System.out.println(f.toString());
        }

        System.out.println(res.wasSuccessful());
    }
}
