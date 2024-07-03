package manager.experiments;

import org.testng.annotations.Test;

public class Exceptions {
    public static void main(String[] args) {
        try {
            exceptionTest();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exceptionTest() throws InterruptedException {
        int [] array = {1,2,3,4};
        try {
            System.out.println(array[4]);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("wrong index");
        }
        //System.out.println(array[4]);
        System.out.println("+++++++++++++++++++++");

        Thread.sleep(3000);

    }
}
