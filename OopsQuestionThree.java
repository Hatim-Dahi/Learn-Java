//Footwear
import java.util.Scanner;

public class OopsQuestionThree {
    static class Footwear {
        private int id;
        private String name;
        private String type;
        private int price;

        // Parameterized constructor
        public Footwear(int id, String name, String type, int price) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.price = price;
        }

        // Getter for id
        public int getId() {
            return id;
        }

        // Setter for id
        public void setId(int id) {
            this.id = id;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for type
        public String getType() {
            return type;
        }

        // Setter for type
        public void setType(String type) {
            this.type = type;
        }

        // Getter for price
        public int getPrice() {
            return price;
        }

        // Setter for price
        public void setPrice(int price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Footwear[] footwears= new Footwear[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name= sc.nextLine();
            String type=sc.nextLine();
            int price= sc.nextInt();
            footwears[i]= new Footwear(id, name, type, price);
        }
        sc.nextLine();
        String type=sc.nextLine();
        String name=sc.nextLine();
        int count=getCountByType(footwears, type);
        if(count==0){
            System.out.println("Footwear not available");
        }else{
            System.out.println(count);
        }

        Footwear obj= getSecondHighestPriceByBrand(footwears, name);
        if(obj==null){
            System.out.println("Brand not available");
        }else{
            System.out.println(obj.getPrice());
        }
    }
    public static int getCountByType(Footwear[] footwears, String type){
        int count=0;
        for(Footwear i:footwears){
            if(i.getType().equalsIgnoreCase(type)){
                count++;
            }
        }
        return count;
    }
    public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String name){
        Footwear highest= null;
        Footwear secHighest=null;
        for(Footwear i:footwears){
            if(i.getName().equalsIgnoreCase(name)){
                if(highest==null || i.getPrice()>highest.getPrice()){
                    secHighest=highest;
                    highest=i;
                }else if(secHighest==null || i.getPrice()>secHighest.getPrice() && i.getPrice() < highest.getPrice()){
                    secHighest=i;
                }
            }
        }
        return secHighest;
    }

}

