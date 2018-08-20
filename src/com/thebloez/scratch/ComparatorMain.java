package com.thebloez.scratch;

import java.math.BigDecimal;
import java.util.*;

public class ComparatorMain {

    public static void main(String[] args) {

        List<MakananFave> listMakanan = initMakanan();

//        sortTanpaLambda(listMakanan);

        sortDenganLambda(listMakanan);

    }

    private static void sortDenganLambda(List<MakananFave> listMakanan) {
        System.out.println("sebelum sorting...");
        System.out.println("------------------");

        for (MakananFave mf: listMakanan) {
            System.out.print(mf.getMakanan() + "|");
            System.out.print(mf.getHarga() + "|");
            System.out.print(mf.getLevel() + "|\n");
        }

        //Comparator by name
        Comparator<MakananFave> byName = (o1, o2) -> o2.getMakanan().compareTo(o2.getMakanan());

        //lambda
//        listMakanan.sort((MakananFave o1, MakananFave o2) -> o2.getLevel() - o1.getLevel());
        listMakanan.sort(Comparator.comparing(MakananFave::getLevel).reversed());


        System.out.println("after sort");
        // java8 print foreach
        listMakanan.forEach(makananFave -> System.out.println(makananFave.getMakanan() + "|" +
                makananFave.getHarga() + "|" +
                makananFave.getLevel() + "|"));

    }

    private static void sortTanpaLambda(List<MakananFave> makananFaveList){

        System.out.println("sebelum sorting...");
        System.out.println("------------------");

        for (MakananFave mf: makananFaveList) {
            System.out.print(mf.getMakanan() + "|");
            System.out.print(mf.getHarga() + "|");
            System.out.print(mf.getLevel() + "|\n");
        }

        Collections.sort(makananFaveList, new Comparator<MakananFave>() {
            @Override
            public int compare(MakananFave o1, MakananFave o2) {
//                return o1.getHarga().compareTo(o2.getHarga());
                return o2.getLevel() - o1.getLevel();
            }
        });

        System.out.println("\nsetelah di sorting descending");
        for (MakananFave mf :
                makananFaveList) {
            System.out.print(mf.getMakanan() + "|");
            System.out.print(mf.getHarga() + "|");
            System.out.print(mf.getLevel() + "|\n");
        }


    }

    private static List<MakananFave> initMakanan(){
        List<MakananFave> makananFaves = new ArrayList<>();

        makananFaves.add(new MakananFave("jengkol",new BigDecimal(50000), 8));
        makananFaves.add(new MakananFave("emping", new BigDecimal(40000), 7));
        makananFaves.add(new MakananFave("sambel goreng kentang", new BigDecimal(20000), 9 ));

        return makananFaves;
    }

    private static class MakananFave {
        String makanan;
        BigDecimal harga;
        int level;

        public MakananFave(String makanan, BigDecimal harga, int level) {
            this.makanan = makanan;
            this.harga = harga;
            this.level = level;
        }

        public String getMakanan() {
            return makanan;
        }

        public void setMakanan(String makanan) {
            this.makanan = makanan;
        }

        public BigDecimal getHarga() {
            return harga;
        }

        public void setHarga(BigDecimal harga) {
            this.harga = harga;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }
}
