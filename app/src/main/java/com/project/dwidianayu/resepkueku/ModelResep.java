package com.project.dwidianayu.resepkueku;


public class ModelResep {
    private int image;
    private String judul;
    private String deskripsi;
    private String bahan;
    private String procedure;

    public ModelResep(int image, String judul, String deskripsi, String bahan, String procedure){
        this.image = image;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.bahan = bahan;
        this.procedure = procedure;
    }

    public int getImage(){
        return image;
    }
    public String getJudul(){
        return judul;
    }
    public String getDeskripsi(){
        return deskripsi;
    }
    public String getBahan(){
        return bahan;
    }
    public String getProcedure(){
        return procedure;
    }
}
