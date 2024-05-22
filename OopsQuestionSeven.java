// Create class Medicine with below attributes: 

// MedicineName - String 
// batch - String 
// disease - String 
// price - int

// Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
// This method will take array of Medicine objects and a disease String as parameters. 
// And will return another sorted array of Integer objects where the disease String matches with the 
// original array of Medicine object's disease attribute (case insensitive search).

// Write necessary getters and setters.

// Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
// referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
// method and print the result.

// Input
// -------------

// dolo650
// FAC124W
// fever
// 100
// paracetamol
// PAC545B
// bodypain
// 150
// almox
// ALM747S
// fever
// 200
// aspirin
// ASP849Q
// flu
// 250
// fever

// Output
// ---------
// 100
// 200

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OopsQuestionSeven {
    static class Medicine{
        private String name, batch, disease;
        private int price;
        public Medicine(String name, String batch, String disease, int price){
            this.name= name;
            this.batch= batch;
            this.disease=disease;
            this.price=price;
        }
        public String getname(){
            return this.name;
        }
        public String getbatch(){
            return this.batch;
        }
        public String getdisease(){
            return this.disease;
        }
        public int getPrice(){
            return this.price;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Medicine[] medicines= new Medicine[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String a= sc.nextLine();
            String b= sc.nextLine();
            String c= sc.nextLine();
            int price= sc.nextInt();
            medicines[i]= new Medicine(a, b, c, price);
        }
        sc.nextLine();
        String disease=sc.nextLine();
        ArrayList<Integer> ans= getPriceByDisease(medicines, disease, n);
        for(Integer i:ans){
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> getPriceByDisease(Medicine[] medicines, String disease, int n){
        ArrayList<Integer> ans= new ArrayList<Integer>();
        for(Medicine i:medicines){
            if(i.getdisease().equalsIgnoreCase(disease)){
                ans.add(i.getPrice());
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
