package JAVA_CODE.JAVA_2;

public class HelloWorld implements Runnable{
    private int number;

    public HelloWorld(int number){
        this.number=number;
    }

    public void run(){
        System.out.println("// " + number);
    }
    
}
