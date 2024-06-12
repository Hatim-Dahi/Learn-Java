// Create a class Hotel with the below attributes:

// hotelId - int
// hotelName - String
// dateOfBooking – String (in the format dd-mon-yyyy)
// noOfRoomsBooked – int
// wifiFacility – String
// totalBill- double

// The above attributes should be private, write getters, setters and parameterized constructor as required.

// Create class Solution with main method.

// Implement two static methods – noOfRoomsBookedInGivenMonth and searchHotelByWifiOption in Solution class.

// noOfRoomsBookedInGivenMonth method:
// This method will take two input parameter - array of Hotel objects and a String parameter.
// The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String parameter passed).
// If no rooms are booked for the given month in the array of Hotel objects, then the method should return 0.

// searchHotelByWifiOption method:
// This method will take two input parameter - array of Hotel objects and a String parameter
// The method will return Hotel object with second highest totalbill, from the array of Hotel objects where wifiFacility attribute 
// matches with the given wifi facility(String parameter passed).
// If no Hotel with the given wifi option is present in the array of Hotel objects, then the method should return null.

// Note : 
// No two Hotel object would have the same hotelId.
// No two Hotel object would have the same totalbill.
// The Array either has at least two objects with specified wifi option OR  no object with specified wifi option. 
// All the searches should be case insensitive. 
// dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)

// The above mentioned static methods should be called from the main method. 

// For noOfRoomsBookedInGivenMonth method - The main method should print the total number of booked rooms as it is, 
// if the returned value is greater than 0, else it should print "No rooms booked in the given month"

// For searchHotelByWifiOption method - The main method should print the hotelId from the returned Hotel object if the returned value is not null. 
// If the returned value is null then it should print "No such option available".

// Before calling these static methods in main, use Scanner object to read the values of four Hotel objects referring attributes in the above mentioned attribute sequence. 
// Next, read the value of two String parameters for capturing the month and wifi option .

// Consider below sample input and output:

// Input1:
// 101
// Best Stay
// 01-jan-2022
// 10
// Yes
// 20000
// 102
// Apple Stay
// 12-Feb-2022
// 3
// Yes
// 4000
// 103
// Accord
// 11-May-2022
// 5
// Yes
// 15000
// 104
// Royal Park
// 22-Dec-2021
// 7
// Yes
// 12000
// May
// Yes

// Output1:
// 5
// 103

// Input2:
// 101
// Best Stay
// 01-jan-2022
// 10
// Yes
// 20000
// 102
// Apple Stay
// 12-Feb-2022
// 3
// Yes
// 4000
// 103
// Accord
// 11-May-2022
// 5
// Yes
// 15000
// 104
// Royal Park
// 22-Dec-2021
// 7
// Yes
// 12000
// May1
// Yes1

// Output2:
// No rooms booked in the given month
// No such option available

// --------------------------------------------------
// Sample code snippet for reference: 
// Please use below code to build your Solution.
// --------------------------------------------------
// import java.util.Scanner;
// public class Solution
// {
//     public static void main(String[] args)
//  {
//     //code to read values 
//   //code to call required method
//   //code to display the result
//  }

//  //code the first method 

//  //code the second method    

// }

// //code the class

// -------------------------------------------------
// Note on using Scanner object:
// Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
// Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

// Consider below input values:
// 1001
// Savings

// Referring below code:

// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// String str = sc.nextLine(); -&gt; here we expect str to have value Savings.Instead it may be "".

// If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.

import java.util.Scanner;

public class hotelQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hotel[] hotels = new Hotel[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();
            hotels[i] = new Hotel(a, b, c, d, e, f);
        }
        sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = m1(hotels, a);
        if (count == 0) {
            System.out.println("no room booked");
        } else {
            System.out.println(count);
        }

        Hotel obj = m2(hotels, b);
        if (obj == null) {
            System.out.println("no such room available");
        } else {
            System.out.println(obj.getid());
        }
    }

    public static int m1(Hotel[] hotels, String x) {
        int count = 0;
        for (Hotel i : hotels) {
            String[] s = i.getdate().split("-");
            if (s[1].equalsIgnoreCase(x)) {
                count += i.getno();
            }
        }
        return count;
    }

    public static Hotel m2(Hotel[] hotels, String x) {
        Hotel highes = null;
        Hotel secHighest = null;
        for (Hotel i : hotels) {
            if (i.getwifi().equalsIgnoreCase(x)) {
                if (highes == null || i.getbill() > highes.getbill()) {
                    secHighest = highes;
                    highes = i;
                }
                if (secHighest == null || i.getbill() > secHighest.getbill() && i.getbill() < highes.getbill()) {
                    secHighest = i;
                }
            }
        }
        return secHighest;
    }
}

class Hotel {
    private int id, no;
    private String name, date, wifi;
    private double totalbill;

    public Hotel(int id, String name, String date, int no, String wifi, double totalBill) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.wifi = wifi;
        this.totalbill = totalBill;
        this.date = date;
    }

    public int getid() {
        return this.id;
    }

    public String getname() {
        return this.name;
    }

    public String getdate() {
        return this.date;
    }

    public int getno() {
        return this.no;
    }

    public String getwifi() {
        return this.wifi;
    }

    public double getbill() {
        return this.totalbill;
    }
}