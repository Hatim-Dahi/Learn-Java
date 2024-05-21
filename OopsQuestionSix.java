// Create a class Player with below attributes: 

// playerId - int 
// skill - String 
// level - String 
// points - int

// Write getters, setters and parameterized constructor in the above mentioned attribute 
// sequence as required.

// Create class Solution with the main method.

// Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

// findPointsForGivenSkill method: 
// ------------------------------------
// This method will take two input parameters - array of Player objects 
// and string parameter skill. The method will return the sum of the points attribute from player objects 
// for the skill passed as parameter. If no player with the given skill is present in the array of player 
// objects, then the method should return 0.

// getPlayerBasedOnLevel method: 
// -------------------------------------
// This method will take two String parameters level and skill, along with the array of Player objects. 
// The method will return the player object, if the input String parameters matches with the level and 
// skill attribute of the player object and its point attribute is greater than or equal to 20. If any 
// of the conditions are not met, then the method should return null.

// Note : No two player object would have the same value for skill and level attribute. All player object 
// would have the points greater than 0. All the searches should be case insensitive.

// These above mentioned static methods should be called from the main method.

// For findPointsForGivenSkill method - The main method should print the points as it is if the returned 
// price is greater than 0, or it should print "The given Skill is not available".

// For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object.
// If the returned value is null then it should print "No player is available with specified level, skill 
// and eligibility points".

// Before calling these static methods in main, use Scanner object to read the values of four Player objects 
// referring attributes in the above mentioned attribute sequence. Next, read the value for skill and level.
// Please consider the skill value read above as skill parameter for both the static methods.

// Input:
// -----------
// 101
// Cricket
// Basic
// 20
// 102
// Cricket
// Intermediate
// 25
// 111
// Football
// Intermediate
// 50
// 113
// BaseBall
// Advanced
// 100
// Cricket
// Intermediate

// Output:
// --------------
// 45
// 102

import java.util.Scanner;

public class OopsQuestionSix {
    static class Player{
        private int id, points;
        private String skill, level;
        public Player(int id, int points, String skills, String level){
            this.id=id;
            this.points=points;
            this.skill=skills;
            this.level=level;
        }
        public int getId(){
            return this.id;
        }
        public int getpoints(){
            return this.points;
        }
        public String getskill(){
            return this.skill;
        }
        public String getLevel(){
            return this.level;
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Player[] players= new Player[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            sc.nextLine();
            String skill= sc.nextLine();
            String level= sc.nextLine();
            int points= sc.nextInt();
            players[i]= new Player(id, points, skill, level);
        }

        sc.nextLine();
        String skill= sc.nextLine();
        String level= sc.nextLine();
        int points= findPointsForGivenSkill(players, skill);
        if(points==0){
            System.out.println("The given Skill is not available");
        }else{
            System.out.println(points);
        }

        Player obj= getPlayerBasedOnLevel(players, skill, level);
        if(obj==null){
            System.out.println("No player is available with specified level, skill ");
        }else{
            System.out.println(obj.getId());
        }
    }
    public static int findPointsForGivenSkill(Player[] players, String skill){
        int sum=0;
        for(Player i:players){
            if(i.getskill().equalsIgnoreCase(skill)){
                sum+=i.getpoints();
            }
        }
        return sum;
    }
    public static Player getPlayerBasedOnLevel(Player[] players,
    String skill, String level){
        Player temp= null;
        for(Player i:players){
            if(i.getskill().equalsIgnoreCase(skill) && i.getLevel().equalsIgnoreCase(level) && i.getpoints() >=20){
                temp=i;
            }
        }
        return temp;
    }
}
