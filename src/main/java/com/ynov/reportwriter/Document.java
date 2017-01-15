package com.ynov.reportwriter;

public class Document implements Printable {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("----------------------- DOCUMENT -----------------------");
        System.out.println(content);
        System.out.println("----------------------- DOCUMENT END -----------------------");
    }
}
