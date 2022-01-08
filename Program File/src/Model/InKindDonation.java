package Model;

import java.util.Calendar;


public class InKindDonation extends Donation implements Distinguishable {

    public InKindDonation( int donationPK, int InNeedInstitutionFK, int donorFK, int DeliveryFK,  String ItemName, double TotalWeight, int donationDateTime, String donationPurpose) {
        super(donationPK, InNeedInstitutionFK, donorFK, donationDateTime, donationPurpose);
        this.ItemName = ItemName;
        this.TotalWeight = TotalWeight;
        this.DeliveryFK = DeliveryFK;
        super.setDonationPurpose("InKind Donation");
    }

   
    private String ItemName;
    private double TotalWeight;
    private int DeliveryFK;
    

    @Override
    public int SetType() {
       return 2;
    }

    public String getItemName() {
        return ItemName;
    }

    public double getTotalWeight() {
        return TotalWeight;
    }

    public int getDeliveryFK() {
        return DeliveryFK;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public void setTotalWeight(double TotalWeight) {
        this.TotalWeight = TotalWeight;
    }

    public void setDeliveryFK(int DeliveryFK) {
        this.DeliveryFK = DeliveryFK;
    }
}
