public class JavaGeneric {
    public static void main(String[] args) {
        Student<Integer> s= new Student<>(8);
        s.display();
    }
}

class Student<Mytype>{
    //we can create out onwn type
    Mytype id;
    public Student(Mytype id){
        this.id=id;
    }
    public void display(){
        System.out.println(this.id);
    }
}