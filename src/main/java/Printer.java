public class Printer {

    public int sheetsLeft;


    public Printer(int sheetsLeft){
        this.sheetsLeft = sheetsLeft;

    }

    public void print(int numberOfPages, int numberOfCopies){
        int sheetsUsed = numberOfCopies * numberOfPages;
        if(numberOfCopies * numberOfPages <= this.sheetsLeft){
            this.sheetsLeft = this.sheetsLeft - sheetsUsed;
        }



    }
}
