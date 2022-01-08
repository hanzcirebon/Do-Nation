package Model;


public class InNeedInstitution {

    public InNeedInstitution(int InNeedPK, String InstName) {
        this.InNeedPK = InNeedPK;
        this.InstName = InstName;
    }

   
    private String InstName;
    private int InNeedPK;

    public String getInstName() {
        return InstName;
    }

    public int getInNeedPK() {
        return InNeedPK;
    }

    public void setInstName(String InstName) {
        this.InstName = InstName;
    }

    public void setInNeedPK(int InNeedPK) {
        this.InNeedPK = InNeedPK;
    }


 
 
}
