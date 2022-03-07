/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinelibrary;
import java.util.Scanner;
/**
 *
 * @author ChesstaDevaAdabi
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        Siswa siswa = new Siswa();
        Petugas petugas = new Petugas();
        Buku buku = new Buku();
        Pinjam pinjam = new Pinjam();
        
        System.out.println("Selamat Datang di Horford Library\n");
        
        petugas.listPetugas();
        siswa.listSiswa();
        
        int idSiswa = pinjam.pilihSiswa(siswa);
        
        Boolean ulang = true;
        while(ulang){
            int menu = pinjam.pilihMenu();
            switch (menu) {
                case 1 : buku.listBuku();
                break;
                case 2 : pinjam.prosesPinjam(idSiswa, siswa, buku);
                break;
                case 3 : pinjam.prosesPengembalian(idSiswa, siswa, buku);
                break;
                case 4 : pinjam.pinjamSiswa(siswa, buku);
                break;
                case 5 : pinjam.statusSiswa(siswa);
                break;
                case 10 : ulang = false;
                break;
                default : {
                    System.out.println("Menu Terpilih Tak Tersedia\n");
                }
            }
        }
        
        in.close();
        
    }
    }