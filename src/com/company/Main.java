package com.company;

public class Main {
    public Integer n = 1;

    public Main(Integer n) {
        this.n = n;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public static void main(String[] args) {
        System.out.println(new Main(13).getN());
    }
}
