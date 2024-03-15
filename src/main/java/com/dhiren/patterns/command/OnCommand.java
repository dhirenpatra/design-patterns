package com.dhiren.patterns.command;

public class OnCommand implements Command {

    private Television television;

    public OnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        System.out.println("Executing television ON Command");
        television.switchOn();
    }
}
