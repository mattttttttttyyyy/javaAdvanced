package org.majowkaReview.postOffice;

public abstract class PackageTemplate {
    String sender;
    String recipient;
    int weightInGrams;
    boolean priority = false;
    String statusTest = "created";

    public PackageTemplate(String sender, String recipient, int weightInGrams, boolean priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.weightInGrams = weightInGrams;
        this.priority = priority;

    }

    public PackageTemplate(String sender, String recipient, int weightInGrams) {
        this.sender = sender;
        this.recipient = recipient;
        this.weightInGrams = weightInGrams;
    }

    public void sendPackage(){
        this.statusTest = "sent";
    }

    @Override
    public String toString() {
        return "Package:" + "\nPriority: " + priority +
                "\nWeight: " + weightInGrams + "\nSender: " + sender +
                "\nRecipient: " + recipient +
                "\nStatus: " + statusTest;
    }
}
