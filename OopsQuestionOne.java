//Grains 

import java.util.Scanner;

public class OopsQuestionOne {
    
public static class Grain{
        private int grainId;
        private String name;
        private String state;
        private int qty;

        public Grain(int id, String name, String state, int qty){
            this.grainId=id;
            this.name=name;
            this.state=state;
            this.qty=qty;
        }

        public int getId(){
            return this.grainId;
        }
        public void setId(int id){
            this.grainId=id;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getState(){
            return  this.state;
        }
        public void setState(String state){
            this.state=state;
        }
        public int getQty(){
            return this.qty;
        }
        public void setQty(int qty){
            this.qty=qty;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Grain[] grains= new Grain[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String state=sc.nextLine();
            int qty=sc.nextInt();
            grains[i]= new Grain(id, name, state, qty);
        }
        sc.nextLine();
        String nameToSearch= sc.nextLine();
        int count=countGrainByGivenName(grains, nameToSearch);
        if(count==0){
            System.out.println("No grain found");
        }else{
            System.out.println(count);
        }
    }
    public static int countGrainByGivenName(Grain[] grains, String name){
        int count=0;
        for(Grain i:grains){
            if(i.getName().equalsIgnoreCase(name)){
                count++;
            }
        }
        return count;
    }
}
