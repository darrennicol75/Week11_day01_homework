public class WaterBottle {

    private int capacity;


    public WaterBottle(int capacity){
        this.capacity = capacity;

    }

    public int getCapacity(){
        return this.capacity;
    }

    public int empty(){
        this.capacity = 0;
        return capacity;
    }

    public int drink(){
        this.capacity -= 10;
        return capacity;
    }

    public int refill(){
        this.capacity = 100;
        return capacity;
    }
}
