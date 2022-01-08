package Model;
import java.sql.Date;
import java.util.Calendar;

public class BloodDonation extends Donation implements Distinguishable {

    
    public BloodDonation( int donationPK,int InNeedInstitutionFK, int donorFK, int HospitalTechFK,  double BodyWeight, String Gender, double Height, int Age, boolean Smoking_Condition, int donationDateTime, String donationPurpose) {
        super(donationPK, InNeedInstitutionFK, donorFK, donationDateTime, donationPurpose);
        this.BodyWeight = BodyWeight;
        this.Gender = Gender;
        this.Height = Height;
        this.Age = Age;
        this.Smoking_Condition = Smoking_Condition;
        this.HospitalTechFK = HospitalTechFK;
        super.setDonationPurpose("Blood Donation");
    }
    
    private double BodyWeight;
    private String Gender;
    private double Height;
    private int Age;
    private boolean Smoking_Condition;
    private int HospitalTechFK;
    
    public double countBMI(){
        return getBodyWeight()*(getHeight()/100)*(getHeight()/100);
    }    
    public boolean BloodAcceptance(){
        if(countBMI()>=17.8){
            return !getSmoking_Condition();
        }else{
            return false;
        }
    }

    @Override
    public int SetType() {
        return 3;
    }

    public double getBodyWeight() {
        return BodyWeight;
    }
    public String getGender() {
        return Gender;
    }
    public double getHeight() {
        return Height;
    }
    public int getAge() {
        return Age;
    }
    public boolean getSmoking_Condition() {
        return Smoking_Condition;
    }
    public int getHospitalTechFK() {
        return HospitalTechFK;
    }

    public void setBodyWeight(double BodyWeight) {
        this.BodyWeight = BodyWeight;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public void setHeight(double Height) {
        this.Height = Height;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setSmoking_Condition(boolean Smoking_Condition) {
        this.Smoking_Condition = Smoking_Condition;
    }
    public void setHospitalTechFK(int HospitalTechFK) {
        this.HospitalTechFK = HospitalTechFK;
    }
}
