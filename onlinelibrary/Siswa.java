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
    public class Siswa implements Pengguna {
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa(){
        //Tambah Siswa
        
        //ID ke 3
        this.nama.add("Aoyama Gosho");
        this.alamat.add("Japan");
        this.telp.add("095678");
        this.status.add(true);

        //ID ke 3
        this.nama.add("Shisio Makoto");
        this.alamat.add("Japan");
        this.telp.add("098674");
        this.status.add(true);
    }
    
    public void listSiswa(){
        System.out.println("Siswa terdaftar : ");
        System.out.println("ID\t\t|Nama Siswa\t\t|Alamat\t\t|Telp\t\t|Status");
        for (int i = 0; i < this.nama.size(); i++) {
            System.out.println(i+"\t\t|"+this.nama.get(i)+"\t\t|"+this.alamat.get(i)+"\t\t|"+this.telp.get(i)+"\t\t|"+this.status.get(i));
        }
        System.out.println("");
    }
    
    public int getJmlSiswa(){
        return this.nama.size();
    }
    
    public void updateStatus(int idSiswa, boolean status){
        this.status.set(idSiswa, status);
    }
    
    //Setter
    //@Override
    public void setNama(String nama){
        this.nama.add(nama);
    }
    
    //@Override
    public void setAlamat(String alamat){
        this.nama.add(alamat);
    }
    
    //@Override
    public void setTelepon(String telp){
        this.telp.add(telp);
    }
    
    public void setStatus(Boolean status){
        this.status.add(status);
    }
    
    //Getter
    //@Override
    public String getNama(int id){
        return this.nama.get(id);
    }
    
    //@Override
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    
    //@Override
    public String getTelepon(int id){
        return this.telp.get(id);
    }
    
    public boolean getStatus(int id){
        return this.status.get(id);
    }
}