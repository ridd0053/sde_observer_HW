package com.company;

public class Me extends Student{
    public Me() {
        super("Me");
    }
    @Override
    public String getOpinion() {
        String msg = "%s is a difficult subject, but I would like to know more about it.";

        return msg;
    }
}
