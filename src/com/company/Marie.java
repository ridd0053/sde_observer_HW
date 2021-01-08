package com.company;

public class Marie extends Student {

    public Marie() {
        super("Marie");
    }

    @Override
    public String getOpinion() {

        String msg = "Oh no! %s is so boring..";

        return msg;
    }
}
