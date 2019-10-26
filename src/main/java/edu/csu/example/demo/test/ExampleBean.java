package edu.csu.example.demo.test;

public class ExampleBean {
    private int years;

    // The Answer to Life, the Universe, and Everything
    private String ultimateAnswer;

    public ExampleBean(int years, String ultimateAnswer) {
        this.years = years;
        this.ultimateAnswer = ultimateAnswer;
    }

    @Override
    public String toString() {
        return "year: "+this.years+" ultimateAnswer: "+this.ultimateAnswer;
    }
}
