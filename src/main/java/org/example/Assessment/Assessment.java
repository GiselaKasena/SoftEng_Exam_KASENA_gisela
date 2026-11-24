package org.example.Assessment;

import java.util.ArrayList;


abstract class Assessment { //no public because only class in this package can access Assessment
    private String name;
    private ArrayList<String> SubAssessment = new ArrayList<>();        // where the service is right now
    private ArrayList<Double> MarksPerSub  = new ArrayList<>();

    Assessment (String name,ArrayList<String> SubAssessment ) {

        this.name = name;
        this.SubAssessment = SubAssessment;
    }

    String getName(){
        return name;
    }

    public ArrayList<String> getSubAssessment(){
        return SubAssessment
    };

    public ArrayList<Double> getMark(){
        return MarksPerSub;
    };

    abstract void getFinalMark();


}
