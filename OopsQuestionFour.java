// create the class Course with the below Attributes.

// courseId- int
// courseName- String
// courseAdmin- String
// quiz- int
// handson -int

// The above methods should be private ,write getter and
// setter and parametrized constructor as required.

// create class courseProgram with main method.

// implement two static methods-
//    findAvgOfQuizByAdmin method:this method will take array
// of Course objects and a String  value as input parameters.
// This method will find out Average (as int) of Quiz questions
// for given Course Admin (String parametre passed)
// This method will return Average if found.if there is no course
// that matches then the method should return 0.

// sortCourseByHandsOn method:
// This method will take an Array of Course Objects and int
// value as input parameters.
// This methods should return an Array of Course objects in an
// ascending order of their  handson which are less than the
// given handson(int parameter passed) value. if there is no
// such course then the method should return null.

// The above mentioned static methods should be called from
// main methods.

// for findAvgOfQuizByAdmin method: The main method
// should print the average if the returned value is not 0.
// if the returned value is 0 then it should print "No Course
// found."


// for sortCourseByHandsOn method:
//                         the  main method should print the name
// of the Course from the returned Course object Array if the
// returned value is not null.if the returned value is null then
// it should print "No Course found with mentioned attribute."

// input1:
// 111
// kubernetes
// Nisha
// 40
// 10
// 321
// cassandra
// Roshini
// 30
// 15
// 457
// Apache Spark
// Nisha
// 30
// 12
// 987
// site core
// Tirth
// 50
// 20
// Nisha
// 17

// output1:
// 35
// kubernetes
// Apache Spark
// cassandra

// input2:
// 111
// kubernetes
// Nisha
// 40
// 10
// 321
// cassandra
// Roshini
// 30
// 15
// 457
// Apache Spark
// Nisha
// 30
// 12
// 987
// site core
// Tirth
// 50
// 20
// Shubhamk
// 5

// output 2:
// No Course found
// No Course found with mentioned attributes.

import java.util.ArrayList;
import java.util.Scanner;

public class OopsQuestionFour {
    static class Course{
        private int id;
        private String name;
        private String admin;
        private int handson;
        private int quiz;
        
    public Course(int id, String name, String admin, int handson, int quiz){
        this.id=id;
        this.name=name;
        this.admin=admin;
        this.handson=handson;
        this.quiz=quiz;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAdmin(){
        return this.admin;
    }
    public int getHandson(){
        return this.handson;
    }
    public int getQuiz(){
        return this.quiz;
    }
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Course[] courses= new Course[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String admin=sc.nextLine();
            int handson= sc.nextInt();
            int quiz= sc.nextInt();
            courses[i]= new Course(id, name, admin, handson, quiz);
        }
        sc.nextLine();
        String adminName=sc.nextLine();
        int num= sc.nextInt();
        int avg= findAvgOfQuizByAdmin(courses, adminName);
        if(avg!=0){
            System.out.println(avg);
        }else{
            System.out.println("No courses found");
        }
        Course[] temp= sortCourseByHandsOn(courses, num);
        if( temp!=null){
            for(Course i: temp){
                System.out.println(i.getName());
            }
        }else{
            System.out.println("No Course found with mentioned attributes");
        }
        
    }
    public static int findAvgOfQuizByAdmin(Course[] courses, String adminName){
        int sum=0;
        int count=0;
        for(Course i:courses){
            if(i.getAdmin().equalsIgnoreCase(adminName)){
                count++;
                sum+=i.getQuiz();
            }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
    }
    public static Course[] sortCourseByHandsOn(Course[] courses, int num){
        ArrayList<Course> temp= new ArrayList<>();
        for(Course i:courses){
            if(i.getHandson() < num){
                temp.add(i);
            }
        }
        if(temp.size()==0){
            return null;
        }
        return temp.toArray(new Course[0]);
    }        
}
 