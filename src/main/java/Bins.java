
public class Bins {


    int[] count;

    public Bins(int toStart, int toEnd) {

        //Makes an array of length the maximum value of the dice
        count = new int[toEnd+1];

    }


    public void incrementbin(int i)
    {
        count[i]= count[i]+1;
    }

    public int getBin(int i)
    {
        return count[i];
    }

    public int[] getCount()
    {
        return count;
    }

}
