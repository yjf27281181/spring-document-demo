package edu.csu.example.demo.test;

public class ExampleBean2 {
    AnotherBean beanOne;
    YetAnotherBean beanTwo;

    int integerProperty;

    public void setBeanOne(AnotherBean beanOne) {
        this.beanOne = beanOne;
    }

    public void setBeanTwo(YetAnotherBean beanTwo) {
        this.beanTwo = beanTwo;
    }

    public void setIntegerProperty(int integerProperty) {
        this.integerProperty = integerProperty;
    }

    @Override
    public String toString() {
        return "ExampleBean2{" +
                "beanOne=" + beanOne +
                ", beanTwo=" + beanTwo +
                ", integerProperty=" + integerProperty +
                '}';
    }
}
