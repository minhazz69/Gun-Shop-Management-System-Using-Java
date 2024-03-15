/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Minhaz
 */
import javax.swing.*;
import java.io.*;
public class Gun implements Price {
    private String type;
    private String name;
    private int quantity;
    private boolean ammo;
    private int mag;
    private String scope;
    private boolean sup;
    Gun(){}

    public Gun(String type,String name, int quantity, boolean ammo, int mag, String scope, boolean sup) {
        this.type=type;
        this.name = name;
        this.quantity = quantity;
        this.ammo = ammo;
        this.mag = mag;
        this.scope = scope;
        this.sup = sup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAmmo() {
        return ammo;
    }

    public void setAmmo(boolean ammo) {
        this.ammo = ammo;
    }

    public int getMag() {
        return mag;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isSup() {
        return sup;
    }

    public void setSup(boolean sup) {
        this.sup = sup;
    }
    public void print(){
        JOptionPane.showMessageDialog(null,"Gun Type= "+type+"\nGun Name= "+name+"\nQuantity= "+quantity+"\nAmmo= "+ammo+"\nMagazine= "+mag+"\nScope= "+scope+"\nSuppressor= "+sup,"Confirm box",JOptionPane.INFORMATION_MESSAGE);
    }
    public void priceHandle(){
        int gun=0;
        if(name.equals("P92")){
            gun=Price.p92;
        }
        else if(name.equals("P1911")){
            gun=Price.p1911;
        }
        else if(name.equals("Ak-47")){
            gun=Price.ak_47;
        }
        else if(name.equals("Scar-L")){
            gun=Price.scar_l;
        }
        else if(name.equals("M416")){
            gun=Price.m416;
        }
        else if(name.equals("SLR")){
            gun=Price.slr;
        }
        else if(name.equals("AWM")){
            gun=Price.awm;
        }
        else if(name.equals("SKS")){
            gun=Price.sks;
        }
        else if(name.equals("UZI")){
            gun=Price.uzi;
        }
        else if(name.equals("Vector")){
            gun=Price.vector;
        }
        else if(name.equals("UMP9")){
            gun=Price.ump9;
        }
        else if(name.equals("S686")){
            gun=Price.s686;
        }
        else if(name.equals("S12k")){
            gun=Price.s12k;
        }
        
        int quantityP=quantity*gun;
        int magP=mag*10;
        int supP;
        if(sup==true){
            supP=20;
        }
        else{
            supP=0;
        }
        int scopeP=0;
        if(scope.equals("2x")){
            scopeP=20;
        }
        else if(scope.equals("3x")){
            scopeP=30;
        }
        else if(scope.equals("4x")){
            scopeP=40;
        }    
        else if(scope.equals("6x")){
            scopeP=60;
        }    
        else if(scope.equals("8x")){
            scopeP=80;
        }
        
        int total=quantityP+magP+supP+scopeP;
            
        JOptionPane.showMessageDialog(null,name+"*("+quantity+")=\t$"+quantityP+"\n"+"Magazine*("+mag+")round's=\t$"+magP+"\n"+scope+" scope*(1)=\t$"+scopeP+"\nSuppresor*("+sup+")=\t$"+supP+"\n------------------------------------\nTotal=\t$"+total,"Total Price", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }
    
    public void writeFile() throws Exception{
        FileWriter fw=new FileWriter("Information.txt",true);
        PrintWriter pw=new PrintWriter(fw);
        pw.println("Gun Type= "+type);
        pw.println("Gun Name= "+name);
        pw.println("Quantity= "+quantity);
        pw.println("Ammo= "+ammo);
        pw.println("Magazine= "+mag);
        pw.println("Scope= "+scope);
        pw.println("Suppresor= "+sup);
        pw.println();
        pw.close();
        
    }
    
    
}
