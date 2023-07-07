import java.util.Random;



public class Dice {
    Random rand = new Random();
    int Number;
    int[] numArray = {1,2,3,4,5,6};

    public Dice(int i)
    {
        this.Number=i;
    }


    //     n.rolldice()

    public int rolldice(int number)
    {

       int randomnumber = rand.nextInt(6);
       if(number>0) {
           rolldice(number - 1);
       }


    }









}
