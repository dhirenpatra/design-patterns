package com.dhiren.patterns.template;

public class ClientRendering {

    public static void main(String[] args) {
        DataRenderer dataRenderer = new CsvDataRenderer();
        dataRenderer.render();
        System.out.println("******************************************************************");
        dataRenderer = new XmlDataRenderer();
        dataRenderer.render();
    }

}
