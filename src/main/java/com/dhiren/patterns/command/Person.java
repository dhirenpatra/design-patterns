package com.dhiren.patterns.command;

public class Person {

    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl control = new RemoteControl();
        control.setCommand(new OnCommand(television));
        control.pressButton();

        control.setCommand(new OffCommand(television));
        control.pressButton();
    }

}
