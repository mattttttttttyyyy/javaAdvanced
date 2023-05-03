package org.majowkaReview.postOffice;
public class Package extends PackageTemplate{
    private float price;
    //private String status = "created";
    public Package(String sender, String recipient, int weightInGrams, boolean priority) {
        super(sender, recipient, weightInGrams, priority);
    }
    public Package(String sender, String recipient, int weightInGrams){
        super(sender, recipient, weightInGrams);

    }

    public float priceOfPackage(){
        if (weightInGrams <  500){
            price = 5;
        } else if (weightInGrams < 1000) {
            price = 8;

        } else if (weightInGrams < 2000) {
            price = 12;

        } else {
            int weightInKg = Math.round((float) weightInGrams / 1000) ;
            System.out.println("Weight in KG: " + weightInKg);
            price = 12 + weightInKg;

        }
        if (priority){
            price = price + ((price * 10) / 100);
        }

        return price;
    }


    /*    public String getStatus() {
        return status;
    }*/
}
