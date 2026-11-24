package org.example.Assessment;

public class Programming_Test extends Assessment {
    double understanding;
    double explanation

    Programming_Test(){
        super("PROGRAMMING_TEST", );
    }

    public double finalMark(){
        double finalPercentage = 0.5*understanding + 0.5*explanation;
        return finalPercentage;
    }
}
