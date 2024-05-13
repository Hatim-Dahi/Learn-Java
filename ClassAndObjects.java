 class Student{
        private int id;
        private String name;
        private String city;
        //constructor which will be called every time an object is created
        public Student(int s_id, String s_name, String  s_city){
            id=s_id;
            name=s_name;
            city=s_city;
        }
        public void setStudentId(int s_id){
            id=s_id;
        }
        public int getId(){
            return id;
        }
        public void setStudentName(String s_name){
            name=s_name;
        }
        public String getName(){
            return name;
        }
        public void setStudentCity(String s_city){
            city=s_city;
        }
        public String getCity(){
            return city;
        }
        public void showDetails(){
            System.out.println("Student ID: "+getId());
            System.out.println("Student Name : "+getName());
            System.out.println("Student City : "+getCity());
        }
    }
public class ClassAndObjects{
    public static void main(String[] args) {
       Student s1= new Student(101,"Hatim", "Indore");
       s1.showDetails();
       //to set the private properties we need to call setter function, we cannot
       //directly set the private properties
       s1.setStudentName("kunaal");
       s1.showDetails();
    }
}