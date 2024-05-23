

// Input
// ----------------
// 100
// Tesla
// 1000
// 500
// Hills
// 200
// Ford
// 2000
// 1500
// Desert
// 300
// Royce
// 3000
// 1700
// Hills
// 400
// Mercedez
// 1000
// 400
// Desert
// Desert
// Mercedez

// Output
// -----------
// 1900
// Mercedez::B2

import java.util.ArrayList;
import java.util.Scanner;

public class OopsQuestionEight {
    static class AutonomousCar{
        private int id, pass, conducted;
        private String brand, env, grade;
        public AutonomousCar(int id, int pass, int conducted, String brand, String env){
            this.id=id;
            this.pass=pass;
            this.conducted=conducted;
            this.brand=brand;
            this.env=env;
            int rating= (pass * 100)/conducted;
            if(rating >=80){
                this.grade= "A1";
            }else{
            this.grade="B1";
            }
        }
        public int getid(){
            return this.id;
        }
        public int getpass(){
            return this.pass;
        }
        public int getConducted(){
            return this.conducted;
        }
        public String getbrand(){
            return this.brand;
        }
        public String getEnv(){
            return this.env;
        }
        public String getGrad(){
            return this.grade;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        AutonomousCar[] autonomousCars= new AutonomousCar[n];
        for(int i=0;i<n;i++){
            int id= sc.nextInt();
            sc.nextLine();
            String brand= sc.nextLine();
            int conducted= sc.nextInt();
            int pass= sc.nextInt();
            sc.nextLine();
            String env= sc.nextLine();
            autonomousCars[i]= new AutonomousCar(id, pass, conducted, brand, env);
        }
        String env= sc.nextLine();
        String bname= sc.nextLine();
        int sum= findTestPassedByEnv(autonomousCars, env);
        if(sum==0){
            System.out.println("There are no tests passed in this particular environment");
        }else{
            System.out.println(sum);
        }

        AutonomousCar obj= updateCarGrade(autonomousCars, bname);
        if(obj==null){
            System.out.println("No Car is available with the specified brand");
        }else{
            System.out.println(obj.getbrand()+ "::" +obj.getGrad());
        }

    }
    public static int findTestPassedByEnv(AutonomousCar[] autonomousCars, String env){
        int sum=0;
        for(AutonomousCar i:autonomousCars){
            if(i.getEnv().equalsIgnoreCase(env)){
                sum+=i.getpass();
            }
        }
        return sum;
    }
    public static AutonomousCar updateCarGrade(AutonomousCar[] autonomousCars, String brandname){
        AutonomousCar temp=null;
        for(AutonomousCar i: autonomousCars){
            if(i.getbrand().equalsIgnoreCase(brandname)){
                temp=i;
            }
        }
        return temp;
    }
}
