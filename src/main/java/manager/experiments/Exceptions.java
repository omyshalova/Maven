package manager.experiments;

import org.testng.annotations.Test;

public class Exceptions {

    @Test
    public void exceptionTest(){
        int [] array = {1,2,3,4};
        try {
            System.out.println(array[4]);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("wrong index");
        }
        //System.out.println(array[4]);
        System.out.println("+++++++++++++++++++++");


    }
}
