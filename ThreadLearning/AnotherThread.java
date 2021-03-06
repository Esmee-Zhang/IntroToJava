package ThreadLearning;

import static ThreadLearning.ThreadColor.ANSI_BLUE;
/**
 * @author Esmee Zhang
 * @date 11/23/20 9:12 下午
 * @projectName IntroToJava-NYU
 */
public class AnotherThread extends Thread {
    public void run(){
        System.out.println(ANSI_BLUE + "hello fomr " + currentThread().getName());
        try{
            Thread.sleep(5000);

        }catch(InterruptedException e){
            System.out.println(ANSI_BLUE+"Another thread woke me up");
            return;
        }

        System.out.println(ANSI_BLUE + "Thread seconds have passed and i'm awake");
    }
}
