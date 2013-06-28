
//************************************************************
// Author: D.S. Malik
//
// Program: Student Grade Report
// This program reads students' data from a file and outputs
// the grades. If a student has not paid the tuition, the
// grades are not shown, and an appropriate message is output.
//************************************************************

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeReportProgram extends JFrame
{
    private static final int WIDTH = 550;
    private static final int HEIGHT = 430;

        //instance variables
    private Student[] studentList;
    private int noOfStudents;
    private double tuitionRate;
    private int displayedStudentIndex = 0;

        //GUI components
        //Each of the items to be displayed needs
        //a label and text field.
        //Labels end with L and text fields end with TF.
    private JLabel headingL, stNameL, stIDL, noCoursesL,
                   courseListL, creditHrsL, gpaL;
    private JTextField stNameTF, stIDTF, noCoursesTF,
                       creditHrsTF, gpaTF;
    private JTextArea courseListTA;
    private JButton exitB, nextB, prevB, firstB, lastB;

    private ButtonHandler bHandler;

    public GradeReportProgram()
    {
      setTitle("Student Information");   //set the window title
      setSize(WIDTH, HEIGHT);            //set the window size
      Container pane = getContentPane(); //get the container
      pane.setLayout(null); //set the container's layout to null

      bHandler = new ButtonHandler(); //instantiate the button
                                      //event handler

          //instantiate the labels
      headingL = new JLabel("STUDENT RECORD");
      stNameL = new JLabel("Student Name ",
                           SwingConstants.RIGHT);
      stIDL = new JLabel("Student ID ", SwingConstants.RIGHT);
      noCoursesL = new JLabel("Number of Courses ",
                               SwingConstants.RIGHT);
      courseListL = new JLabel("Course no           Course name " +
                               "                        Credits " +
                               "                Grade");

      creditHrsL = new
            JLabel("Credit Hours ", SwingConstants.RIGHT);
      gpaL = new JLabel("Midsemester GPA ",
                         SwingConstants.RIGHT);

          //instantiate the text fields
      stNameTF = new JTextField(10);
      stIDTF = new JTextField(10);
      noCoursesTF = new JTextField(10);
      creditHrsTF = new JTextField(10);
      gpaTF = new JTextField(10);

        //instantiate the text area
      courseListTA = new JTextArea(6, 20);
      courseListTA.setAutoscrolls(true);

        //instantiate the buttons and register the listener
      exitB = new JButton("Exit");
      exitB.addActionListener(bHandler);

      nextB = new JButton("Next");
      nextB.addActionListener(bHandler);

      prevB = new JButton("Previous");
      prevB.addActionListener(bHandler);

      firstB = new JButton("First");
      firstB.addActionListener(bHandler);

      lastB = new JButton("Last");
      lastB.addActionListener(bHandler);

        //set the size of the labels, text fields, and buttons
      headingL.setSize(200, 30);
      stNameL.setSize(100, 30);
      stNameTF.setSize(100, 30);
      stIDL.setSize(100, 30);
      stIDTF.setSize(100, 30);
      noCoursesL.setSize(120, 30);
      noCoursesTF.setSize(100, 30);
      creditHrsL.setSize(100, 30);
      creditHrsTF.setSize(100, 30);
      gpaL.setSize(110, 30);
      gpaTF.setSize(100, 30);
      courseListL.setSize(370, 30);
      courseListTA.setSize(370, 120);
      firstB.setSize(100, 30);
      prevB.setSize(100, 30);
      exitB.setSize(100, 30);
      nextB.setSize(100, 30);
      lastB.setSize(100, 30);

        //set the location of the labels, text fields,
        //and buttons
      headingL.setLocation(220, 10);
      stNameL.setLocation(20, 50);
      stNameTF.setLocation(120, 50);
      stIDL.setLocation(20, 100);
      stIDTF.setLocation(120, 100);
      noCoursesL.setLocation(300, 50);
      noCoursesTF.setLocation(420, 50);
      creditHrsL.setLocation(300, 100);
      creditHrsTF.setLocation(420, 100);
      gpaL.setLocation(300, 150);
      gpaTF.setLocation(420, 150);
      courseListL.setLocation(70, 200);
      courseListTA.setLocation(70, 230);
      firstB.setLocation(20, 370);
      prevB.setLocation(120, 370);
      exitB.setLocation(220, 370);
      nextB.setLocation(320, 370);
      lastB.setLocation(420, 370);

        //add the labels, text fields, and buttons to the pane
      pane.add(headingL);
      pane.add(stNameL);
      pane.add(stNameTF);
      pane.add(stIDL);
      pane.add(stIDTF);
      pane.add(noCoursesL);
      pane.add(noCoursesTF);
      pane.add(courseListL);
      pane.add(courseListTA);
      pane.add(creditHrsL);
      pane.add(creditHrsTF);
      pane.add(gpaL);
      pane.add(gpaTF);
      pane.add(firstB);
      pane.add(prevB);
      pane.add(exitB);
      pane.add(nextB);
      pane.add(lastB);

      setVisible(true); //show the window
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//end constructor

    public static void main(String[] args) throws
                                         FileNotFoundException
    {
         GradeReportProgram gradeProg =
                        new GradeReportProgram();
         Scanner inFile =
                   new Scanner(new FileReader("stData.txt"));

         gradeProg.noOfStudents =
                inFile.nextInt(); //get the number of students
         gradeProg.tuitionRate =
                inFile.nextDouble(); //get the tuition rate

         gradeProg.studentList =
                          new Student[gradeProg.noOfStudents];

         for (int i = 0; i < gradeProg.noOfStudents; i++)
            gradeProg.studentList[i] = new Student();

         gradeProg.getStudentData(inFile);
         gradeProg.displayGradeReports(0);
    } //end main

              //getStudentData
    public void getStudentData(Scanner inFile)
	{
		System.out.println("Write the definition of this method.");
		System.out.println("See Programming Exercise 1, "
		                 + "at the end of this section.");
	} //end getStudentData

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            if (e.getActionCommand().equals("Previous"))
                if (displayedStudentIndex > 0)
                    displayGradeReports(displayedStudentIndex - 1);
                else
                    displayGradeReports(displayedStudentIndex);
            else if (e.getActionCommand().equals("Next"))
                if (displayedStudentIndex + 1 < noOfStudents)
                    displayGradeReports(displayedStudentIndex + 1);
                else
                       displayGradeReports(displayedStudentIndex);
            else if (e.getActionCommand().equals("First"))
                    displayGradeReports(0);
            else if (e.getActionCommand().equals("Last"))
                    displayGradeReports(noOfStudents - 1);
            else
                System.exit(0);
        }
    } //end ButtonHandler

    public void displayGradeReports(int stNo)
    {
        displayedStudentIndex = stNo;
        String CourseListing = "";

        boolean isPaid = studentList[stNo].getIsTuitionPaid();

        stNameTF.setText(studentList[stNo].getFirstName() + " "
                       + studentList[stNo].getLastName());
        stIDTF.setText(""+studentList[stNo].getStudentId());
        noCoursesTF.setText(""+studentList[stNo].getNumberOfCourses());
        creditHrsTF.setText(""+studentList[stNo].getHoursEnrolled());

        if (isPaid)
           gpaTF.setText("" + String.format("%.2f",
                                           studentList[stNo].getGpa()));
        else
           gpaTF.setText("" + "****");

        for (int count = 0;
             count < studentList[stNo].getNumberOfCourses();
             count++)
        {
			String str;
			Course temp;

			temp = studentList[stNo].getCourse(count);

            str = temp.getCourseNumber() + "\t  "
                  + temp.getCourseName() + "\t\t"
                  + temp.getCredits() + "\t";

			if (isPaid)
			    str = str + studentList[stNo].getGrade(count);
			else
			    str = str + "***";


            if (count == 0)
                CourseListing = str;
            else
                 CourseListing = CourseListing + "\n" + str;
        }

        if (!isPaid)
            CourseListing = CourseListing + "\n"
                         + "*** Grades are being held for "
  	                     + "not paying the tuition. ***\n"
	                     + "Amount Due: $"
                         + String.format("%.2f",
                              studentList[stNo].billingAmount(tuitionRate));
        courseListTA.setText(CourseListing);
    } //end displayGradeReports
}

