package com.dhiren.patterns.template;

public class CsvDataRenderer extends DataRenderer {
    @Override
    String read() {
        System.out.println("Reading CSV");
        return "CSV";
    }

    @Override
    String process(String data) {
        System.out.println("Processing CSV");
        return data.toLowerCase();
    }
}
