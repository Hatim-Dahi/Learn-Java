public class ThreadPractice {
    static class mythread extends Thread{
        secondthread s= new secondthread();
        public void run(){
            while (true) {
                System.out.println("thread 1");                
                s.start();
            }
        }
    }

    static class secondthread extends Thread{
        public void run(){
            while (true) {
                System.out.println("thread 2----");
            }
        }
    }
    public static void main(String[] args) {
        mythread t= new mythread();
        t.start();
    }    
}
