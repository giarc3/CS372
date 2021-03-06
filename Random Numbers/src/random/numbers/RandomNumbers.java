/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random.numbers;
import java.util.Random;

/**
 * This class prints random numbers and designates which of a pair is greater.
 * @author ccolegrove17
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j,k; //make some integers
        for(int i=1;i<=25;i++)//for loop runs 25 times
        {
            //PT: As we talked about in class, place this line outside the for loop
            Random rand=new Random();//seeds the random number generator
            j = rand.nextInt(100) + 1;//sets integer between 1 and 100
            k = rand.nextInt(100) + 1;//sets integer between 1 and 100
            if (j>k) //if first is larger
                System.out.printf("%d>%d\n",(int)j,(int)k);//displays
            else if (j<k)//if second is larger
                System.out.printf("%d<%d\n",(int)j,(int)k);//displays
            else//if they are equal
                System.out.printf("%d=%d\n",(int)j,(int)k);//displays
        }
    }
}
