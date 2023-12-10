package com.example.ukesoppgave_2;

import java.util.ArrayList;
import java.util.List;

public class OppgaveController {
    private List<Oppgave> oppgaver = new ArrayList<>();

    public void leggTilOppgave(Oppgave oppgave) {
        oppgaver.add(oppgave);
    }

    public List<Oppgave> hentAlleOppgaver() {
        return oppgaver;
    }
}
