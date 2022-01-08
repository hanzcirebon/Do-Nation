package Model;

import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Hanif
 */
public class MoneyDonation extends Donation implements Distinguishable{

    public MoneyDonation(int donationPK, int InNeedInstitutionFK, int donorFK,String AccountOwner, String BankName, int AccountNumber, String DestinationBank,  int donationDateTime, String donationPurpose) {
        super(donationPK, InNeedInstitutionFK, donorFK, donationDateTime, donationPurpose);
        this.AccountOwner = AccountOwner;
        this.BankName = BankName;
        this.AccountNumber = AccountNumber;
        this.DestinationBank = DestinationBank;
        super.setDonationPurpose("Money Donation");
    }


    private String AccountOwner;
    private String BankName;
    private int AccountNumber;
    private String DestinationBank;



    @Override
    public int SetType() {
       return 1;
    }

    public String getAccountOwner() {
        return AccountOwner;
    }

    public String getBankName() {
        return BankName;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public String getDestinationBank() {
        return DestinationBank;
    }

    public void setAccountOwner(String AccountOwner) {
        this.AccountOwner = AccountOwner;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setDestinationBank(String DestinationBank) {
        this.DestinationBank = DestinationBank;
    }
}
