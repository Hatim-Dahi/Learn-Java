// Create class Sim2 with below attributes:

// id - int
// company - String
// balance - int
// ratePerSecond - double
// circle - String

// Create class Solution and implement static method "matchAndSort" in the Solution class.

// This method will take array of Sim objects, search_circle String and search_rate double as parameters.
// And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and 
// the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by 
// means of balance attribute in descending order.

// Write necessary getters and setters.

// Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above 
// sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in 
// main method to print the id's of the result obtained.

// Input
// --------------------------
// 1
// jio
// 430
// 1.32
// mumbai
// 2
// idea
// 320
// 2.26
// mumbai
// 3
// airtel
// 500
// 2.54
// mumbai
// 4
// vodafone
// 640
// 3.21
// mumbai
// mumbai
// 3.4

// Output
// --------------------------
// 4
// 3
// 1
// 2

import java.util.*;

public class OopsQuestion13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] sims = new Sim[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            double d = sc.nextDouble();
            sc.nextLine();
            String e = sc.nextLine();
            sims[i] = new Sim(a, b, c, d, e);
        }
        String x= sc.nextLine();
        double y= sc.nextDouble();
        Sim[] obj= m1(sims, x, y);
        for(Sim i:obj){
            System.out.println(i.getid());
        }
    }

    public static Sim[] m1(Sim[] sims, String x, double y) {
        ArrayList<Sim> arr = new ArrayList<>();
        for (Sim i : sims) {
            if (i.getcircle().equalsIgnoreCase(x) && i.getrating() < y) {
                arr.add(i);
            }
        }
        Sim[] res = new Sim[arr.size()];
        res = arr.toArray(res);
        Arrays.sort(res, Comparator.comparingInt(Sim::getbalance).reversed());
        return res;
    }
}

class Sim {
    private int id, balance;
    private String circle, name;
    private double rating;

    public Sim(int id, String name, int balance, double rating, String circle) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.rating = rating;
        this.circle = circle;
    }

    public int getid() {
        return this.id;
    }

    public String getname() {
        return this.name;
    }

    public int getbalance() {
        return this.balance;
    }

    public double getrating() {
        return this.rating;
    }

    public String getcircle() {
        return this.circle;
    }
}