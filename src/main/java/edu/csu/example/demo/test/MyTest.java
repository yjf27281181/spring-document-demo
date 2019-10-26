package edu.csu.example.demo.test;

public class MyTest {
    int num;
    String str;
    boolean bool;

    public void setNum(int num) {
        this.num = num;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "MyTest{" +
                "num=" + num +
                ", str='" + str + '\'' +
                ", bool=" + bool +
                '}';
    }
}
