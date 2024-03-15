package com.dhiren.patterns.template;

public abstract class DataRenderer {
    abstract String read();
    abstract String process(String data);

    void render() {
        System.out.println("Rendering Data Started");
        String data = read();
        String processedData = process(data);
        System.out.println("Rendering Data Completed for "+ processedData);
    }

}
