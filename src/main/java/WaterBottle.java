public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;

    }


    public int getVolume() {
        return this.volume;
    }

    public int drink() {
        return this.volume - 10;
    }

    public int emptyBottle() {
        return this.volume = 0;
    }
}
