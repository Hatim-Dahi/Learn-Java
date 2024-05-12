public class Strings {
    public static void main(String[] args) {
        // direct method to create a string
        // here string store in the pool inside the heap and will have unique strings 
        String str= "Hatim";
        // if we create same name string wih different varaible , it will 
        //point to the same string in the pool
        String s= "Hatim";
        System.out.println(str==s); //output: true
        System.out.println(str.charAt(0)); // to access the first char


        //another method is using new keyword,
        //by using new the strings are stored outside the pool but inside heap
        String a= new String("Hatim");
        String b= new String("Hatim");
        // if we campare it now it will give us false
        System.out.println(a==b); //output: false
        // so we need to use equals method to compare
        System.out.println(a.equals(b)); //output: true
        System.out.println(a.charAt(1));
        
    }
}
