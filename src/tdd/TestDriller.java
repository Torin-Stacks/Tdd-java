package tdd;

public class TestDriller {
    int amount;

    public void amountToPay(int noOfCopies) {
        if (noOfCopies > 0 && noOfCopies <= 4){
           amount = 2000 * noOfCopies;}

        else if(noOfCopies >= 5 && noOfCopies <= 9){
           amount = noOfCopies * 1800;}

        else if(noOfCopies >= 10 && noOfCopies <= 29){
            amount = noOfCopies * 1600;}

        else if(noOfCopies >= 30 && noOfCopies <= 49){
            amount = noOfCopies * 1500;}

        else if(noOfCopies >= 50 && noOfCopies <= 99){
            amount = noOfCopies * 1300;}

        else if(noOfCopies >= 100 && noOfCopies <= 199){
            amount = noOfCopies * 1200;}

        else if(noOfCopies >= 200 && noOfCopies <= 499){
            amount = noOfCopies * 1100;}

        else {
            amount = noOfCopies * 1000;}

    }

    public int returnAmount(){
        return amount;
    }

    }

