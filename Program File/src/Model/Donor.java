package Model;


public class Donor {

    public Donor(int DonorPK, int UserFK, String donName, String orgName, String donAddress) {
        this.DonorPK = DonorPK;
        this.donName = donName;
        this.orgName = orgName;
        this.donAddress = donAddress;
        this.UserFK = UserFK;
    }

 
    private int DonorPK;
    private int UserFK;
    private String donName;
    private String orgName;
    private String donAddress;


    public int getDonorPK() {
        return DonorPK;
    }

    public String getDonName() {
        return donName;
    }

    public String getOrgName() {
        return orgName;
    }

    public String getDonAddress() {
        return donAddress;
    }

 

    public void setDonorPK(int DonorPK) {
        this.DonorPK = DonorPK;
    }

    public void setDonName(String donName) {
        this.donName = donName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setDonAddress(String donAddress) {
        this.donAddress = donAddress;
    }

    public int getUserFK() {
        return UserFK;
    }

    public void setUserFK(int UserFK) {
        this.UserFK = UserFK;
    }



    
   
    
} 
