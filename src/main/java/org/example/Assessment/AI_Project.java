package org.example.Assessment;

public class AI_Project extends Assessment {
    private double programMark;
    private boolean explanationResult;
    private double finalResult;

    Programming_Test(){
        super("PROGRAMMING_TEST", );
    }

    public double finalMark(){
        if (explanationResult == false){
            finalResult = programMark*0.4;
        }else{
            finalResult = ProgramMark;
        }
        return finalResult
    }
}
