package com.thebloez.oop;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.thebloez.oop.SekutuArmy.MachineGun;
import com.thebloez.oop.SekutuArmy.SupportUnit;

/**
 * Created by thebloez on 09/07/18.
 */
public class CompanyOfHeroes {

    public static void main(String[] args){

        MachineGun machineGun1 = (MachineGun) new SupportUnit();

        System.out.println(machineGun1.menembakPasukanMusuh());
    }
}
