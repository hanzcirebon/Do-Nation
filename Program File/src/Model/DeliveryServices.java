package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hanif
 */
class DeliveryServices {

    public DeliveryServices(int DeliveryPK, String DeServiceNames) {
        this.DeliveryPK = DeliveryPK;
        this.DeServiceNames = DeServiceNames;
    }
    
    private int DeliveryPK;
    private String DeServiceNames;
    private final double SeServiceMaxWeight = 20;
 
    public int getDeliveryPK() {
        return DeliveryPK;
    }

    public String getDeServiceNames() {
        return DeServiceNames;
    }

    public double getSeServiceMaxWeight() {
        return SeServiceMaxWeight;
    }

    public void setDeliveryPK(int DeliveryPK) {
        this.DeliveryPK = DeliveryPK;
    }

    public void setDeServiceNames(String DeServiceNames) {
        this.DeServiceNames = DeServiceNames;
    }


    
    
}
