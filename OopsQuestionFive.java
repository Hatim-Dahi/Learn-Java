// Create a class called Employee with the below attributes:

// employeeld - int
// name - String
// branch - String
// rating - double
// company Transport - boolean
// The above attributes should be private. write getters, setters and parameterized constructor as required.

// Create class MyClass with main method.
// Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
// in MyClass class.

// findCountOfEmployeesUsingCompTransport method: 
// ----------------------------------------------
// This method will take an array of Employee object and a String parameter as input parameters. 
// This method will calculate and return the count of Employees who are all using company transport 
// in the given branch (String parameter passed).
// If no Employee in the given branch using company transport in the array of Employee objects, then 
// the method should return 0.

// findEmployeeWithSecondHighestRating method: 
// --------------------------------------------
// This method will take an array of Employee objects as an input parameter. This method will return 
// the object of the second highest rating employee from the array of Employee objects who are not using 
// company transport.
// If all Employees using company transport in the array of Employee objects, then the method should return null.

// Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee 
// is unique.
// For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it 
// is if the returned value is greater than 0, else it should print "No such Employees".
// Ex: 2 , where 2 is the count
// For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from 
// the returned object if the returned value is not null. If the returned value is null, then it should 
// print "All Employees using company transport".
// Ex: 1003
//     Uma
// where 1003 is the employeeld and Uma is the name.
// Before calling these static methods in main, use Scanner object to read the values of four Employee 
// objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
// parameter for capturing branch.

// Input : 

// 1001
// Ashwa
// IT
// 5
// true
// 1002
// Preeti
// IT
// 4
// true
// 1003
// Uma
// Admin
// 3
// false
// 1004
// Akash
// Hardware
// 4.5
// false
// IT



// Output : 

// 2
// 1003
// Uma

import java.util.*;

public class OopsQuestionFive {
    static class Employee{
        private int id;
        private String name, branch;
        private double rating;
        private boolean isTransport;

        public Employee(int id, String name, String branch, double rating, boolean istransport){
            this.id=id;
            this.name=name;
            this.branch=branch;
            this.rating=rating;
            this.isTransport=istransport;
        }

        public int getId(){
            return this.id;
        }
        public String getName(){
            return this.name;
        }
        public String getBranch(){
            return this.branch;
        }
        public boolean isTransport(){
            return this.isTransport;
        }
        public double getRating(){
            return this.rating;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Employee[] employees= new Employee[n];
        for(int i=0;i<n;i++){
            int id= sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String branch=sc.nextLine();
            double rating=sc.nextDouble();
            boolean isTrans = sc.nextBoolean();
            employees[i]= new Employee(id, name, branch, rating, isTrans);
        }
        sc.nextLine();
        String branchName= sc.nextLine();
        int count= findCountOfEmployeesUsingCompTransport(employees, branchName);
        if(count==0){
            System.out.println("No such Employees");
        }else {
            System.out.println(count);
        }

        Employee obj= findEmployeeWithSecondHighestRating(employees);
        if(obj==null){
            System.out.println("All Employees using company transport");
        }else{
            System.out.println(obj.getId());
            System.out.println(obj.getName());
        }
    }
    public static int  findCountOfEmployeesUsingCompTransport(Employee[] employees, String branchName){
        int count=0;
        for(Employee i:employees){
            if(i.getBranch().equalsIgnoreCase(branchName) && i.isTransport()){
                count++;
            }
        }
        return count;
    } //1 5 3 6 8
    public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
    Employee highest = null;
    Employee secHighest = null;

    for (Employee i : employees) {
        if (!i.isTransport()) {
            if (highest == null || i.getRating() > highest.getRating()) {
                secHighest = highest;
                highest = i;
            } else if (secHighest == null || i.getRating() > secHighest.getRating()) {
                secHighest = i;
            }
        }
    }

    return secHighest;
}

}
