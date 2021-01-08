package com.company;

public class Kees extends Student {

    public Kees() {
        super("Kees");
    }

    @Override
    public String getOpinion() {

        String msg = "Yeah, i'd realy like talking about %s. Tell me more about it!";

        return msg;
    }
}