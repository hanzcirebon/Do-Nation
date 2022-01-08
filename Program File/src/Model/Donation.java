package Model;




public  class Donation   {

    public Donation(int donationPK, int InNeedInstitutionFK, int donorFK, int donationDateTime, String donationPurpose) {
        this.donationPK = donationPK;
        this.InNeedInstitutionFK = InNeedInstitutionFK;
        this.donorFK = donorFK;
        this.donationDateTime = donationDateTime;
        this.donationPurpose = donationPurpose;
    }
    
    private int donationPK;
    private int InNeedInstitutionFK ;
    private int donorFK;
    private int donationDateTime;
    private String donationPurpose;

    public int getDonationPK() {
        return donationPK;
    }

    public int getInNeedInstitutionFK() {
        return InNeedInstitutionFK;
    }

    public int getDonorFK() {
        return donorFK;
    }

    public int getDonationDateTime() {
        return donationDateTime;
    }

    public String getDonationPurpose() {
        return donationPurpose;
    }

    public void setDonationPK(int donationPK) {
        this.donationPK = donationPK;
    }

    public void setInNeedInstitutionFK(int InNeedInstitutionFK) {
        this.InNeedInstitutionFK = InNeedInstitutionFK;
    }

    public void setDonorFK(int donorFK) {
        this.donorFK = donorFK;
    }

    public void setDonationDateTime(int donationDateTime) {
        this.donationDateTime = donationDateTime;
    }

    public void setDonationPurpose(String donationPurpose) {
        this.donationPurpose = donationPurpose;
    }
  
  

   
}
