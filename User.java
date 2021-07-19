/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author 249bh
 */
class User {
    private int id,price;
    private String name,size, veg;
    private byte[] picture ;
    
    public User(int id ,String name , String size, String veg,int price,byte[] image)
    {
        this.id=id;
        this.name= name;
        this.size=size;
        this.veg= veg;
        this.price = price;
        this.picture = image;
    }

    
    public int getid(){
        return id;
    }
     public String getname(){
        return name;
    }
      public String getsize(){
        return size;
    }
       public String getveg(){
        return veg;
    }
        public int getprice(){
        return price;
    }
        public byte[] getimage(){
        return picture;
    }
        
}   

