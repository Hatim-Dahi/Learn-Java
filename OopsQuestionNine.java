// Create class Movie with below attributes: 

// movieName - String 
// company - String 
// genre - String 
// budget - int

// Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
// take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
// objects where the searchGenre String matches with the original array of Movie object's genre attribute 
// (case insensitive search).

// Write necessary getters and setters.

// Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
// attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
// logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
// print "Low Budget Movie".

// Input
// ---------
// aaa
// Marvel
// Action
// 250000000
// bbb
// Marvel
// Comedy
// 25000000
// ccc
// Marvel
// Comedy
// 2000000
// ddd
// Marvel
// Action
// 300000000
// Action

// Output
// -------------------
// High Budget Movie
// High Budget Movie

import java.util.ArrayList;
import java.util.Scanner;

public class OopsQuestionNine {
    static class Movie{
        private String name, company, genre;
        private int budget;

        public Movie(String name, String company, String genre, int budget){
            this.name=name;
            this.company= company;
            this.genre=genre;
            this.budget=budget;
        }
        public int getbudget(){
            return this.budget;
        }
        public String getname()
        {
            return this.name;
        }
        public String getcompany()
        {
            return this.company;
        }
        public String getgenre()
        {
            return this.genre;
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Movie[] movies= new Movie[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String name= sc.nextLine();
            String company= sc.nextLine();
            String genre= sc.nextLine();
            int budget= sc.nextInt();
            movies[i]= new Movie(name, company, genre, budget);
        }
        sc.nextLine();
        String genre= sc.nextLine();
        Movie[] obj= getMovieByGenre(movies, genre);
        for(Movie i: obj){
            if(i.getbudget() < 80000000){
                System.out.println("Low budget moive");
            }else{
                System.out.println("high budget moive");
            }
        }
    }
    public static Movie[] getMovieByGenre(Movie[] moives, String genre){
        ArrayList<Movie> temp= new ArrayList<>();
        for(Movie i: moives){
            if(i.getgenre().equalsIgnoreCase(genre)){
                temp.add(i);
            }
        }
        if(temp.size()==0){
            return null;
        }
        return temp.toArray(new Movie[0]);
    }
}
