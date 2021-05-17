public class Printer {

    private int sheetsLeft;
    private int tonerVolume;


    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;

    }

    public int hasSheetsLeft(){
        return this.sheetsLeft;
    }

    public int hasTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int sheetsUsed = numberOfCopies * numberOfPages;
        if(numberOfCopies * numberOfPages <= this.sheetsLeft){
            this.sheetsLeft = this.sheetsLeft - sheetsUsed;
            this.tonerVolume = this.tonerVolume - sheetsUsed;
        }



    }
}
