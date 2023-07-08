import com.sun.source.tree.WhileLoopTree;

import java.util.Random;



public class Dice {
    Random rand = new Random();
    int NumberofDie;
    int[] numArray = {1,2,3,4,5,6};
    int sum=0;
    public Dice(int i)


    {
        this.NumberofDie=i;
    }


    //     n.rolldice()

    public int tossandsum() {
        sum=0;

        for (int i = getNumberofDie(); i > 0; i--)
        {
            int f = rand.nextInt(6);
            sum= sum + numArray[f];


        }

        return sum;
    }


    public int getNumberofDie() {
        return NumberofDie;
    }



}










