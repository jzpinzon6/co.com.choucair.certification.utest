package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Tasks {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class)
    }

    @Override
    public <T extends Actor> void performAS(T actor){
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),,
                Enter.theValue("ingresarTuUsuario").into(UtestLoginPage.INPUT_USER),
                Enter.theValue("ingresarTuContraseña").into(UtestLoginPage.INPUT_PASSWORD),
                Click.on(UtestLoginPage.ENTER_BUTTON));

    }
}
