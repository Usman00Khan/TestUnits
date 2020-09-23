import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
   {
           TestAddition.class,
           TestSubtraction.class,
           TestMultiplication.class,
           TestDivision.class
   }
)
public class SuiteAddMulSubDiv {
}
