// Create a class Engine with the below attributes:

// engineld – int

// engineName – String

// engine Type – String

// enginePrice – double

// The above attributes should be private, write getters, setters and parameterized constructor as required.

// Create class MyClass with main method.

// Implement two static methods – findAvgEnginePriceByType and searchEngineByName in MyClass class.

// findAvgEnginePriceByType method: This method will take two input parameters Engine objects and String parameter. 
// The method will return the average price of Engines from array of Engine objects for the given engine type 
// (String parameter passed). If no Engine with the given type is present in the array of Engine objects, then the method 
// should return 0.


// searchEngineByName method: This method will take a String parameter and an array of Engine objects as the other parameter. 
// The method will return Engine object array in an ascending order of their engine ids, from the array of Engine objects whose 
// name attribute matches with the given engine name (String parameter passed). If no Engine with the given name is present in 
// the array of Engine objects, then the method should return null.

// Note: No two Engine object would have the same engine id.

// All searches should be case insensitive.

// The above mentioned static methods should be called from the main method.

// For findAvgEnginePriceByType method: The main method should print the average enginePrice of Engines as it is, if the returned 
// value is greater than 0, or it should print “There are no engine with given type”

// For searchEngineByName method: The main method should print the engineld from the returned Engine object array if the returned 
// value is not null. If the returned value is null, then it should print “There are no engine with the given name”. 

// Before calling these static methods in main, use Scanner object to read the values of four Engine objects referring attributes 
// in the above mentioned attribute sequence. next, read the value of two String parameters for capturing engine type and engine 
// name respectively.

// Input :

// 1001
// Maruti
// Diesel
// 20000
// 1002
// Kia
// Pertro
// 17000
// 1003
// Hyundai
// Diesel
// 24000
// 1000
// Maruti
// Petrol
// 27500
// Petrol
// Maruti

// Output :

// 27500
// 1000
// 1001

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OopsQuestion12{
    static class Engine{
        private int id;
        private String name, type;
        private double price;
        public Engine(int id, String name, String type, double price){
            this.id=id;
            this.name=name;
            this.type=type;
            this.price=price;
        }
        public int getId(){
            return this.id;
        }
        public String getname(){
            return this.name;
        }
        public String getType(){
            return this.type;
        }
        public double getprice(){
            return this.price;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Engine[] engines= new Engine[n];
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            sc.nextLine();
            String b= sc.nextLine();
            String c= sc.nextLine();
            double d= sc.nextDouble();
            engines[i]=  new Engine(a,b,c,d);
        }
        sc.nextLine();
        String type= sc.nextLine();
        String name= sc.nextLine();
        double avg= findAvgEnginePriceByType(engines, type);
        if(avg==0){
            System.out.println("There are no engine with given type");
        }else{
            System.out.println(avg);
        }

        Engine[] obj= searchEngineByName(engines, name);
        if(obj==null){
            System.out.println("There are no engine with the given name");
        }else{
            for(Engine i:obj){
                System.out.println(i.getId());
            }
        }
    }
    public static double findAvgEnginePriceByType(Engine[] engines,String type ){
        double sum=0;
        int count=0;
        for(Engine i:engines){
            if(i.getType().equalsIgnoreCase(type)){
                count++;
                sum+=i.getprice();
            }
        }
        if(sum==0){
            return 0;
        }
        return sum/count;
    }

    public static Engine[] searchEngineByName(Engine[] engines, String name){
        ArrayList<Engine> arr= new ArrayList<>();
        for(Engine i: engines){
            if(i.getname().equalsIgnoreCase(name)){
                arr.add(i);
            }
        }
        if(arr.isEmpty()){
            return null;
        }
        Engine[] result= new Engine[arr.size()];
        result= arr.toArray(result);
        Arrays.sort(result, Comparator.comparing(Engine::getId));
        return result;
    }

}