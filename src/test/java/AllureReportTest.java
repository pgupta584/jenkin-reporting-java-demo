import io.qameta.allure.*;
import org.testng.annotations.Test;

public class AllureReportTest {
    @Test
    @Description("This is a sample test to demonstrate Allure integration.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Login Feature")
    @Story("User tries to login with valid credentials")
    public void testLogin() {
        // Your Selenium test logic here
        System.out.println("Running testLogin...");
        assert true;
    }
}
