package com.example.mortezasaadat.app18;

/**
 * Created by mortezasaadat on 6/16/16.
 */
public class CompanyAndDevice {


    private final String COMPANY_NAME;
    private final String COMPANY_DEVICE;



    public CompanyAndDevice(String COMPANY_NAME, String COMPANY_DEVICE) {


        this.COMPANY_NAME = COMPANY_NAME;
        this.COMPANY_DEVICE = COMPANY_DEVICE;

    }


    @Override
    public String toString() {

        return " " + COMPANY_DEVICE + " From " + COMPANY_NAME +
                " Company " + ". \n\n\n";
    }
}
