package com.thebloez.oop.SekutuArmy;

import java.util.List;

/**
 * Created by thebloez on 09/07/18.
 */
public class MachineGun extends SupportUnit {

    public MachineGun(String jenisSenjata) {
        this.jenisSenjata = jenisSenjata;
    }

    public String menembakPasukanMusuh(){
        String result = "Machine Gun menembak dengan senapan " + jenisSenjata;
        return result;
    }
}
