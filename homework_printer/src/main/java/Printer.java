public class Printer {

    private int volume;
    private int toner;

    public Printer(int volume, int toner){
        this.volume = volume;
        this.toner = toner;

    }

    public int getVolume(){
        return this.volume;
    }

    public int getToner(){
        return this.toner;
    }

    public int print(int pages, int copies) {
        if (this.volume >= pages * copies) {
            this.volume -= pages * copies;
            return volume;
        }else{
            return volume;
        }
    }

    public int toner(int pages, int copies) {
        if (this.toner >= pages * copies) {
            this.toner -= pages * copies;
            return toner;
        }else{
            return toner;
        }
    }
}
