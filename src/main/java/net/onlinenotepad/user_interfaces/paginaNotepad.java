package net.onlinenotepad.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.online-notepad.net/es/bloc-de-notas-online")
public class paginaNotepad extends PageObject {
    public static final Target NOTA_BOTON = Target.the("Nota Enriquecida Boton")
            .located(By.xpath("//div//button[contains(text(), 'Nota de texto enriquecido')]"));
}
