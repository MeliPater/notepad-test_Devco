package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.onlinenotepad.user_interfaces.paginaNotepad.NOTA_BOTON;

public class escoge {
        private escoge() {
        }

        public static Performable laNotadeTextoEnriquecido() {
            return Task.where("el actor selecciona la Nota tipo enriquecida",
                    Click.on(NOTA_BOTON)
            );
        }
    }
