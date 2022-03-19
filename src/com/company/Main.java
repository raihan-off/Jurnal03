package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList<Pegawai> list = new SinglyLinkedList<>();
        list.insertAtFront(new Pegawai("6706213033",
                "Raihan", "Teknisi"));
        list.insertAtFront(new Pegawai("6706213031",
                "Rere", "Pegawai"));

        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("Pilihlah menu:");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cetak list pegawai");
            System.out.println("4. Keluar");

            int opsiUser = in.nextInt();
            if (opsiUser == 1 ){

                System.out.println("Input menu");
                System.out.println("Tuliskan nip, nama, dan divisi pegawai");
                int nip = in.nextInt();
                String namaPegawai = in.nextLine();
                String divisi = in.nextLine();

                //add data should be with method linkedlist

                System.out.println("nip = " + nip + "; nama = " + namaPegawai + "; divisi : " + divisi);
                System.out.println("Tambahkan data di awal list? (y/n)");
                String sortList = in.nextLine();

                if(sortList.equals("y")){
                    System.out.println("ditambah ke awal");
                }else {
                    System.out.println("ditambah ke akhir");
                }

            } else if (opsiUser == 2){
                System.out.println("Hapus data");
                    list.removeFromBack();
            }else if (opsiUser == 3){
                System.out.println("List pegawai");
                list.print();
            }else{
                System.out.println("Keluar");
                running = false;
            }
        }

    }
}

