package net.onlinenotepad.tasks;

import net.serenitybdd.screenplay.Performable;

public class escribirNota {
    private escribirNota() {
    }

    public static Performable conTextoenNegrita(){
        return Task.where("el actor escibe el texto")
    }
}
