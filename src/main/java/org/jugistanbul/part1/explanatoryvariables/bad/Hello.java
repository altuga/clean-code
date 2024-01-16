package org.jugistanbul.part1.explanatoryvariables.bad;

class Hello {

    int s;
    int[] t= new int[100] ;
    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(" --> " + hello.calculate());
    }

    public double calculate() {
        t[0] = 10;
        for (int j=0; j<34; j++) {
            s += (t[j]*4)/5;
        }
        return s;

    }
}
