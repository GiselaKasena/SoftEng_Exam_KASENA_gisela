package org.example.Assessment;

public class Design_Viva extends Assessment {
    double understanding;
    double explanation

    Programming_Test(){
        super("DESIGN VIVA", );
    }

    public double finalMark(){
        double finalPercentage = 0.5*understanding + 0.5*explanation;
        return finalPercentage;
    }
}
