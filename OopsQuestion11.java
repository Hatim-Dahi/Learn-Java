// create a class Antenna with below attributes.
// antennaid=int
// antennaName=String
// projectLead=String
// antennaVSWR=double

// the above attribute should be private ,write getter and setter and parametrized constructor as well.

// create class MyClass with main method.
// implement two static methods searchAntennaByName and sortAntennaByVSWR in MyClass class.


// searchAntennaByName :
// ---------------------------------------
// This method will take an array of Antenna objects and the string value as input parameter.The method will find out Antenna name(String parameterpassed).
// It will return Antennaid if found.if there is no Antenna that matches then the method will return zero.
// The main method should print the antennaid,if the returned value is not 0.if the returned value is 0 then print,"There is no antenna with the given parameter".


// sortAntennaByVSWR:
// --------------------------------------
// This method will take an array of Antenna Objects and a double value as input.
// This method will return an array of Antenna objects sorted in ascending orderof their antennaVSWR, which is less than VSWR(double value passed).       

// The main method should print name of the project leads from the returned array if the returned value is not null.if the returned value is null then main method 
// should print "No Antenna found";


// input1:

// 111
// Reconfigurable
// Hema
// 0.4
// 222
// Wearable
// Kavya
// 0.9
// 333
// Microstrip
// Teju
// 0.3
// 444
// Dielectric
// Sai
// 0.65
// Microstrip
// 0.5

// output:
// 333
// Teju
// Hema


// input 2:
// 111
// Reconfigurable
// Hema
// 0.3
// 222
// Wearable
// Kavya
// 0.9
// 333
// Microstrip
// Teju
// 0.4
// 444
// Dielectric
// Sai
// 0.65
// Resonator
// 0.25

// output:
// There is no antenna with given parameter
// No Antenna found

import java.util.*;


public class OopsQuestion11 {
 public static class Antenna {
    private int antennaId;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    // Parameterized Constructor
    public Antenna(int antennaId, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaId = antennaId;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    // Getter and Setter methods
    public int getAntennaId() {
        return antennaId;
    }

    public void setAntennaId(int antennaId) {
        this.antennaId = antennaId;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}
   public static void main(String[] args) {
        Antenna[] antennas = {
            new Antenna(111, "Reconfigurable", "Hema", 0.4),
            new Antenna(222, "Wearable", "Kavya", 0.9),
            new Antenna(333, "Microstrip", "Teju", 0.3),
            new Antenna(444, "Dielectric", "Sai", 0.65)
        };

        // Input for search
        String searchName = "Microstrip";
        double vswrThreshold = 0.5;

        // Search Antenna by Name
        int searchResult = searchAntennaByName(antennas, searchName);
        if (searchResult != 0) {
            System.out.println(searchResult);
        } else {
            System.out.println("There is no antenna with the given parameter");
        }

        // Sort Antennas by VSWR
        Antenna[] sortedAntennas = sortAntennaByVSWR(antennas, vswrThreshold);
        if (sortedAntennas != null && sortedAntennas.length > 0) {
            for (Antenna antenna : sortedAntennas) {
                System.out.println(antenna.getProjectLead());
            }
        } else {
            System.out.println("No Antenna found");
        }
    }

    public static int searchAntennaByName(Antenna[] antennas, String name) {
        for (Antenna antenna : antennas) {
            if (antenna.getAntennaName().equalsIgnoreCase(name)) {
                return antenna.getAntennaId();
            }
        }
        return 0;
    }
    public static Antenna[] sortAntennaByVSWR(Antenna[] antennas, double vswr) {
        ArrayList<Antenna> temp= new ArrayList<>();
        for(Antenna i:antennas){
            if(i.getAntennaVSWR() < vswr){
                temp.add(i);
            }
        }

        if(temp.isEmpty()) return null;
        Antenna[] obj= new Antenna[temp.size()];
        obj= temp.toArray(obj);
        Arrays.sort(obj, Comparator.comparing(Antenna::getAntennaVSWR));
        
        return obj;
 }
}
