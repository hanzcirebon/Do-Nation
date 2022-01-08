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
class Hospital_Technician {

    public Hospital_Technician(int HospitalTechPK, String HospitalName, int crewAmount) {
        this.HospitalTechPK = HospitalTechPK;
        this.HospitalName = HospitalName;
        this.crewAmount = crewAmount;
    }

    
    private int HospitalTechPK;
    private String HospitalName;
    private int crewAmount;

    public int getHospitalTechPK() {
        return HospitalTechPK;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public int getCrewAmount() {
        return crewAmount;
    }

    public void setHospitalTechPK(int HospitalTechPK) {
        this.HospitalTechPK = HospitalTechPK;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public void setCrewAmount(int crewAmount) {
        this.crewAmount = crewAmount;
    }

 

}
