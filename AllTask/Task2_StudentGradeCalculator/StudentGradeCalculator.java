package Encryptix.AllTask.Task2_StudentGradeCalculator;
import java.util.*;


public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int totalMarks=0;
        String studentGrade="NA";

        System.out.print("How many subjects do you have ?");
        int totalSubjects=sc.nextInt();
        int[] marks=new int[totalSubjects];

        System.out.println("Enter your marks for all the "+totalSubjects+" subjects out of 100.");
        for(int i=0;i<totalSubjects;i++)
        {
            marks[i]=sc.nextInt();
            totalMarks+=marks[i];
        }

        //int totalPercent=(totalMarks/(100*totalSubjects))*100;
        int averagePercentage=(totalMarks/totalSubjects);

        if(averagePercentage>=90)
        {
            //System.out.println("A+");
            studentGrade="A+";
        }
        else if(averagePercentage>=80 && averagePercentage<90)
        {
            //System.out.println("A");
            studentGrade="A";
        } else if (averagePercentage>=70 && averagePercentage<80)
        {
            studentGrade="B";
        } else if (averagePercentage>=60 && averagePercentage<70) {
            studentGrade="C";
        } else if (averagePercentage>=50 && averagePercentage<60) {
            studentGrade="D";
        } else if (averagePercentage>=40 && averagePercentage<50) {
            studentGrade="E";
        } else if (averagePercentage<40) {
            studentGrade="F";
        }


        System.out.println("Your total marks are :"+totalMarks);
        System.out.println("Your average percent is :"+averagePercentage);
        System.out.println("Your grade is :"+studentGrade);

    }
}
