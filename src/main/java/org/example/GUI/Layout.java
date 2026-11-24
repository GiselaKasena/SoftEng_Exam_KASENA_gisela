package org.example.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import org.example.Assessment.*;


public class Layout {
    ArrayList<AssessmentFeed> data = new ArrayList<>();
    Integer StudentNum = 4; //needs to be changed later on using info from Assessment Feed

    private static final int ROWS = (StudentNum)+1, COLS = 7;

    private final Sheet[] sheets = new sheets[ROWS * COLS];
    private final JPanel[] panels  = new JPanel[ROWS];
    private final JLabel[] labels  = new JLabel[ROWS];

    public Layout(){

        JFrame frame = new JFrame("Assessment Results Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(ROWS, COLS, 5, 5));   // 5px gaps between cells

        String[] headers = new String["Student Name","CID","Student Type","Assessment 1","Assessment 2","Assessment 3","Overall Weight"];

        //setting up the table label headers
        for (int c = 0; c < ROWS, c++){
            panels[c] = new JPanel(new BorderLayout());
            panels[c].setBackground(Color.WHITE);
            panels[c].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labels[c] = new JLabel(headers[c], SwingConstants.CENTER);
            panels[c].add(labels[c], BorderLayout.CENTER);
            frame.add(panels[c]);
        }

        //Obtaining Input Values of Student name, IDs, etc
        for (int i = 1; i < ROWS; i++) {
            labels[i].setText(s.getName());

        }

        updateDisplay();

        frame.pack();
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    //set Background red if too OverReliant on AI
    private void updateDisplay(){
        for (int i = 1; i < ROWS; i++) {
            Sheet s = sheets[i];
            if(s.isOverReliant()){
                panels[i].setBackground(Color.RED);
            } else {
                panels[i].setBackground(Color.WHITE);
            }
        }
    }

    private void printReport() {
        System.out.println("===== Technical Report of Assessment Results ======");
        System.out.printf("%-10s %5.1f %s%n", s.getName(), s.getValue(), status);
        for (int i = 1; i < ROWS; i++){
            System.out.printf("%-10s %5.1f %s%n",s.studentName(), s.cid(),s.studentType(), s.Assessment1() ,s.Assessment2(), s.Assessment3(), s.Overallweights());
        }
    }
}
