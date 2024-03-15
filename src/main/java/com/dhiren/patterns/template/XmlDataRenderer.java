package com.dhiren.patterns.template;

public class XmlDataRenderer extends DataRenderer {
    @Override
    String read() {
        System.out.println("Reading XML");
        return "XML";
    }

    @Override
    String process(String data) {
        System.out.println("Processing XML");
        return data.toLowerCase();
    }
}
