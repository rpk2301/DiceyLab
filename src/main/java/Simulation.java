public class Simulation {

    public static void main(String[] args) {
        Simulation z = new Simulation(2, 10000);
        z.runsimulation(z);
    }

    public int getNumberofdie() {
        return numberofdie;
    }

    int numberofdie;

    public int getNumberoftosses() {
        return numberoftosses;
    }

    int numberoftosses;

    public Simulation(int numberofdie, int numberoftosses) {
        this.numberofdie = numberofdie;
        this.numberoftosses = numberoftosses;
    }


    public void runsimulation(Simulation z) {
        Dice dicey = new Dice(getNumberofdie());
        Bins binny = new Bins(getNumberofdie(), getNumberofdie() * 6);
        for (int i = 0; i <= getNumberoftosses(); i++) {
            int f = dicey.tossandsum();
            binny.incrementbin(f);

        }
        printResults(binny.getCount());
    }

    public String printstarts(int i) {
        String ret = "";
        for (int f = 1; f <= i; f++) {
            ret += "*";
        }
        return ret;
    }

    public void printResults(int[] bin) {
        System.out.println("***");
        System.out.println("Simulation of " + getNumberofdie() + " dice tossed for " + getNumberoftosses() + " times.");
        System.out.println("***");
        System.out.println("");

        for (int i = 0; i < bin.length; i++) {
            if (i >= getNumberofdie()) {
                int fl = (int) (bin[i]/(double)getNumberoftosses()*100);
                String formattedString = String.format("%2d:  %9d:  %.2f %s",i, bin[i], (double)((bin[i]/(double) getNumberoftosses())), printstarts(fl));
                System.out.println(formattedString);
            }


        }
    }
}