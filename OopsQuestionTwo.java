//Travel agency problem

import java.util.Scanner;

public class OopsQuestionTwo {
    public static class Travel{
        private int regNo;
        private String name;
        private String packageType;
        private int price;
        private boolean isFlightFacility;
        
        public Travel(int regNo, String name, String type, int price, boolean isfacility){
            this.regNo=regNo;
            this.name=name;
            this.price=price;
            this.isFlightFacility=isfacility;
            this.packageType=type;
        }
        // Getter and Setter methods for encapsulation

        public int getRegNo() {
            return regNo;
        }

        public void setRegNo(int regNo) {
            this.regNo = regNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPackageType() {
            return packageType;
        }

        public void setPackageType(String packageType) {
            this.packageType = packageType;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public boolean isFlightFacility() {
            return isFlightFacility;
        }

        public void setFlightFacility(boolean isFlightFacility) {
            this.isFlightFacility = isFlightFacility;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Travel[] travels= new Travel[n];

        for(int i=0;i<n;i++){
            int regNo=sc.nextInt();
            sc.nextLine();
            String name= sc.nextLine();
            String type=sc.nextLine();
            int price=sc.nextInt();
            boolean isfacility= sc.nextBoolean();
            travels[i]= new Travel(regNo, name, type, price, isfacility);
        }

        int no=sc.nextInt();        
        sc.nextLine();
        String name=sc.nextLine();

        int maxPrice=findAgencyWithHighestPackagePrice(travels);        
        System.out.println(maxPrice);

        Travel obj= agencyDetailsforGivenIdandType(travels, no, name);
        if(obj==null){
            System.out.println("not found");
        }else{
            System.out.println(obj.getName() + ": " + obj.getPrice());
        }
    }
    public static int findAgencyWithHighestPackagePrice(Travel[] travels){
        int maxPrice=travels[0].getPrice();
        for(Travel i:travels){
            if(i.getPrice() >maxPrice){
                maxPrice=i.getPrice();
            }
        }
        return maxPrice;
    }
    public static Travel agencyDetailsforGivenIdandType(Travel[] travels, int regNo, String name ){
        Travel travel=null;
        for(Travel i:travels){
            if(i.isFlightFacility() && i.getRegNo()==regNo && i.getName().equalsIgnoreCase(name)){
                travel=i;
            }
        }
        return travel;
    }
}
