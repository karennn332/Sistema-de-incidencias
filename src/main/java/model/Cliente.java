package model;


import java.util.Scanner;




public class Cliente {
    
  private String razonSocial;
  private String cuit;

    public Cliente(String razonSocial, String cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }

    public Cliente() {
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
  
  
   
}
