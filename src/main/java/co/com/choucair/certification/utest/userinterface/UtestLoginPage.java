package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[a class=\"unauthenticated-nav-bar__link\" href=\"/login?return_to=\" target=\"_self\"]"));
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("EmailAddress"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("Password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.xpath("//button[contains(button class=\"btn\" name=\"login\" id=\"kc-login\" type=\"submit\" value=\"Log In\")]"));
}
