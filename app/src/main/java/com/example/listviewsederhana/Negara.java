package com.example.listviewsederhana;

public class Negara {

    private String negara;
    private String ibuKota;
    private String imageUrl;

    public Negara(String negara, String ibuKota, String imageUrl){
        this.negara = negara;
        this.ibuKota = ibuKota;
        this.imageUrl = imageUrl;
    }

    public String getNegara(){
        return negara;
    }

    public void setNegara(String negara){
        this.negara = negara;
    }

    public String getIbuKota(){
        return ibuKota;
    }

    public void setIbuKota(String ibuKota){
        this.ibuKota = ibuKota;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
}
