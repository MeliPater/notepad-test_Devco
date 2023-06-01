package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class abrirPagina implements Task {
    private net.onlinenotepad.user_interfaces.paginaNotepad paginaNotepad;

    public static abrirPagina urlPage() {
        return Tasks.instrumented(abrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaNotepad));
    }
}
