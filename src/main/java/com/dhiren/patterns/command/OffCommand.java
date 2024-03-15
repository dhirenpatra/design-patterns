package com.dhiren.patterns.command;

public class OffCommand implements Command {

    private Television television;

    public OffCommand(Television television) {
        this.television = television;
    }
    @Override
    public void execute() {
        System.out.println("Executing television OFF Command");
        television.switchOff();
    }
}
