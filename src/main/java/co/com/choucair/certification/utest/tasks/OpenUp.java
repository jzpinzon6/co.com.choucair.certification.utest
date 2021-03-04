package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.utest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private co.com.choucair.certification.utest.userinterface.utest utest;
    public static Open thePage() {
        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAS(T actor){
        actor.attemptsTo(Open.browserOn(utest));
    }
}
