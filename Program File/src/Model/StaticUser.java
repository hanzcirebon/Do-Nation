/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fadhl
 */
public class StaticUser {
    private static int DonorPK;

    /**
     * @return the DonorPK
     */
    public static int getDonorPK() {
        return DonorPK;
    }

    /**
     * @param aDonorPK the DonorPK to set
     */
    public static void setDonorPK(int aDonorPK) {
        DonorPK = aDonorPK;
    }
}
