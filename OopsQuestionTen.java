// Create a class Student with below attributes:

// rollNo - int
// name - String
// subject - String
// grade - char
// date - String [DD/MM/YYYY]



// The above attributes should be private.Write Getter and Setter and parametrized constructor as required.


// Create class Solution with main method.
// ****************************************************************************
// Implement one static method: findStudentByGradeAndMonth Solution Class.


// findStudentByGradeAndMonth Method:

// This method will take an array of Student objects, char value as grade and int value as month 
// for input parameters.The method will find out all Students from the given grade and month. 
// This method will return array of Student object assending based on their rollNo if found. 
// If there is no Student that matches then the method should return null.

// for this method- main method should print Student name, subject and total student found [The 
// length of the list], if the returned value is not null. If the returned value is null then 
// main method should print "No student found".


// NOTE:
// 	1. For Taking char as input use sc.nextLine().charAt(0)
// 	2. To match/check the month You havee to convert int month in the parameter to String.
// 	3. No need to count the Student array if return not null just print the array length.


// ****************************************************************************



// Consider the below input and output:


// input1:

// 111
// Arijit
// Math
// B
// 22/09/2023
// 101
// Priyanka
// English
// A
// 30/03/2022
// 107
// Shreosi
// History
// C
// 13/05/2022
// 105
// Tatan
// Physics
// A
// 27/03/2022
// A
// 3


// output1:

// Priyanka
// English
// Tatan
// Physics
// 2





// input2:

// 111
// Sohel
// Math
// B
// 22/09/2022
// 101
// Priyanka
// English
// A
// 30/03/2022
// 107
// Gopa
// History
// C
// 12/05/2022
// 105
// Kamal
// Physics
// A
// 27/03/2022
// A
// 7



// output 2:

// No student found

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OopsQuestionTen {
    static class Student {
    // Private attributes
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date; // in format DD/MM/YYYY

    // Parameterized constructor
    public Student(int rollNo, String name, String subject, char grade, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter for grade
    public char getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(char grade) {
        this.grade = grade;
    }

    // Getter for date
    public String getDate() {
        return date;
    }

    // Setter for date
    public void setDate(String date) {
        this.date = date;
    }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Student[] students= new Student[n];
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            sc.nextLine();
            String b= sc.nextLine();            
            String c= sc.nextLine();
            char d= sc.next().charAt(0);
            sc.nextLine();
            String e= sc.nextLine();       
            students[i]= new Student(a,b,c,d,e);
        }
        char grade= sc.next().charAt(0);
        int month= sc.nextInt();
        Student[] obj= findStudentByGradeAndMonth(students, grade, month);
        if(obj==null){
            System.out.println("it is null");
        }else{
            for(Student i:obj){
                System.out.println(i.getName());
                System.out.println(i.getSubject());
                System.out.println(obj.length);
                System.out.println("===========");
            }
        }
    }

    public static Student[] findStudentByGradeAndMonth(Student[] students, char grade, int month){
         ArrayList<Student> filteredStudents = new ArrayList<>();
         for(Student i: students){
            if(i.getGrade()==grade){
                String temp[]= i.getDate().split("/");
                int studentMonth = Integer.parseInt(temp[1]);
                 if (studentMonth == month) {
                    filteredStudents.add(i);
                }
            }
        }
        if(filteredStudents.size()==0){
            return null;
        }

        Student[] result = new Student[filteredStudents.size()];
        result = filteredStudents.toArray(result);
        Arrays.sort(result, Comparator.comparingInt(Student::getRollNo));
        return result;
    }
}
