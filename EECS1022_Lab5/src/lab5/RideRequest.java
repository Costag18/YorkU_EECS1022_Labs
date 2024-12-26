package lab5;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name : Constantinos Giannaras
//Yorku Email : costag@my.yorku.ca
//Date : 2024-03-07
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////


public class RideRequest {

    private String customerName;
    private String rideDetails;
    private double ridePrice;
    private boolean hasDiscount;
    private static double taxRate;
    private static double discountRate;
    private static int toStringCounter;

    public RideRequest() {
        this.customerName = "";
        this.rideDetails = "";
        this.ridePrice = 0.0;
        this.hasDiscount = false;
    }

    public RideRequest(RideRequest other) {
        if (other == null)
            throw new IllegalArgumentException("Input cannot be null");

        this.customerName = other.customerName;
        this.rideDetails = other.rideDetails;
        this.ridePrice = other.ridePrice;
        this.hasDiscount = other.hasDiscount;
    }

    public RideRequest(String input) {
        if (input == null || input.isEmpty())
            throw new IllegalArgumentException("Input cannot be null or empty");

        String[] parts = input.split(",");
        if (parts.length != 4)
            throw new IllegalArgumentException("Input is not in correct format");

        this.customerName = parts[0].trim();
        this.rideDetails = parts[1].trim();
        this.ridePrice = Double.parseDouble(parts[2].trim());
        this.hasDiscount = parts[3].trim().equalsIgnoreCase("Y");
    }

    public void setRideDetails(String rideDetails) {
        this.rideDetails = rideDetails != null ? rideDetails.trim() : "";
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName != null ? (customerName.trim().length() > 10 ? customerName.trim().substring(0, 10) : customerName.trim()) : "";
    }

    public double getRidePrice() {
        return this.ridePrice;
    }

    public void setRidePrice(double ridePrice) {
        this.ridePrice = ridePrice;
    }

    public boolean isHasDiscount() {
        return this.hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public static double getTaxrate() {
        return taxRate;
    }

    public static void setTaxrate(double taxRate) {
        RideRequest.taxRate = taxRate;
    }
    

    public static double getDiscount() {
        return discountRate;
    }

    public static void setDiscount(double discountRate) {
        RideRequest.discountRate = discountRate;
    }
    

    public String getCustomerName() {
        return customerName;
    }

    public String getRideDetails() {
        return rideDetails;
    }

    @Override
    public String toString() {
        toStringCounter++;

        // Calculate total price including tax
        double totalPrice = ridePrice * (1 + taxRate);

        // Apply discount if applicable
        double discountedPrice = hasDiscount ? totalPrice * (1 - discountRate) : totalPrice;

        // Format price with tax
        String formattedPriceWithTax = String.format("%-12.2f", totalPrice);

        // Format price with discount if applicable
        String formattedPriceWithDiscount = hasDiscount ? String.format(" %12.2f", discountedPrice) : "";

        // Format the string representation
        String formattedOutput = String.format("%2d. %-10s|%-25s|%s|%s",
                toStringCounter,
                customerName.length() > 10 ? customerName.substring(0, 10) : customerName,
                rideDetails.length() > 25 ? rideDetails.substring(0, 25) : rideDetails,
                formattedPriceWithTax,
                formattedPriceWithDiscount);

        return formattedOutput;
    }



}