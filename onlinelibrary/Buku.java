/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinelibrary;
import java.util.ArrayList;
/**
 *
 * @author ChesstaDevaAdabi
 */
public class Buku {
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku(){
        //Tambah buku
        
        //ID urutan pertama
        this.nama.add("Brute Force City");
        this.stok.add(10);
        this.harga.add(150000);
        
        //ID urutan kedua
        this.nama.add("Alpha Mike Delta");
        this.stok.add(15);
        this.harga.add(1000000);
    }
    
    public void listBuku(){
        System.out.println("Buku yang tersedia : ");
        System.out.println("ID\t|Nama Buku\t\t\t|Stok\t|Harga");
        for (int i = 0; i < this.nama.size(); i++) {
            System.out.println(i+"\t|"+this.nama.get(i)+"\t\t|"
                    +this.stok.get(i)+"\t|"
                    +this.harga.get(i));
        }
        System.out.println("");
    }
    
    public void pinjam(int id, int banyak){
        int sisaStok = this.stok.get(id);
        sisaStok -= banyak;
        
        this.stok.set(id, sisaStok);
    }
    
    public void kembali(int id, int banyak){
        int sisaStok = this.stok.get(id);
        sisaStok += banyak;
        
        this.stok.set(id, sisaStok);
    }
    
    public int getStok(int id){
        return this.stok.get(id);
    }
    
    public String getNama(int id){
        return this.nama.get(id);
    }
}
