public class Hello_world {
    public static void main(String[] args){
        int var = 0; 
        Threading obj = new Threading();
        Thread thread = new Thread(obj);
        thread.start();

        System.out.println("Output del thread eseguito ->");
        //System.out.println("Test fuori dal thread (nella classe main del programma chiamata Hello_world.java)");
    }
}
