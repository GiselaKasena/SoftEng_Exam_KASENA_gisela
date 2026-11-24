package org.example.Assessment;

public class Sheet {
    //organize all the informations from AssessmentFeed, and does the weighting average
    //for each assessment using the assessment subclasses and methods
    // bridge between assessment and the layout GUI class

    string[] CID = new double[];
    string[] assessmentName = new string[];

    arrayList<double> fullSheet = new arrayList<>();
    double resultPerPerson = double AssessmentFeed.getResult();
    int aI_Avg = ;
    int nonAI_Avg;

    public void buildSheet(){
        getResult(String cid, String assessmentName,
                String subAssessmentName)
    }

    public boolean isOverReliant(double CID){
        if (nonAI_Avg-Ai_Avg>20){
            return true;
        }else{
            return false;
        }

    }
}
