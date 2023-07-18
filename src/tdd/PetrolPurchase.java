package tdd;

public class PetrolPurchase {

    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double discountPercentage;

    public PetrolPurchase(String location,String petrolType,int quantity,double pricePerLitre,double discountPercentage){
       this.location = location;
       this.petrolType = petrolType;
       this.quantity = quantity;
       this.pricePerLitre = pricePerLitre;
       this.discountPercentage = discountPercentage;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation(){
        return location;
    }


    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }

    public String getPetrolTYpe(){
        return petrolType;
    }


    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }


    public void setPricePerLitre(double pricePerLitre){
        this.pricePerLitre = pricePerLitre;
    }

    public double getPricePerLitre(){
        return pricePerLitre;
    }


    public void setDiscountPercentage(double discountPercentage){
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage(){
        return discountPercentage;
    }


    public double getPurchaseAmount(){

        double netAmountWithoutDiscount = quantity * pricePerLitre;
        return (netAmountWithoutDiscount - (discountPercentage * netAmountWithoutDiscount));

    }









}
