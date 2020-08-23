package com.certificacion.automatizacion.wappi.questions;

import com.certificacion.automatizacion.wappi.userinterfaces.ActualizarInfoPersonalUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ActualizarInformacion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((ActualizarInfoPersonalUserInterfaces.MENSAJE_POPUP_ACTUALIZACION),
                WebElementStateMatchers.isVisible()));
        return Text.of(ActualizarInfoPersonalUserInterfaces.MENSAJE_POPUP_ACTUALIZACION).viewedBy(actor).asString();
    }

    public static ActualizarInformacion mensaje(){

        return new ActualizarInformacion();
    }
}
