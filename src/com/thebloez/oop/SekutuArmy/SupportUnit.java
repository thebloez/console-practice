package com.thebloez.oop.SekutuArmy;

import com.thebloez.oop.Sekutu;

import java.util.List;

/**
 * Created by thebloez on 09/07/18.
 */
public class SupportUnit extends Sekutu{

    String jenisSenjata;
    int jmlPersonel;

    public SupportUnit() {
    }

    public String getJenisSenjata() {
        return jenisSenjata;
    }

    public void setJenisSenjata(String jenisSenjata) {
        this.jenisSenjata = jenisSenjata;
    }

    public int getJmlPersonel() {
        return jmlPersonel;
    }

    public void setJmlPersonel(int jmlPersonel) {
        this.jmlPersonel = jmlPersonel;
    }
}
