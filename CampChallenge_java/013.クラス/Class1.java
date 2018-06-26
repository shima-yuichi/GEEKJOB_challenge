/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

/**
 *
 * @author guest1Day
 */
public class Class1 {
    
    public String name = null;
    public int age = 0;
    public String address = null;
    
    public void setProfile(String n,int ag,String add){
        this.name = n;
        this.age = ag;
        this.address = add;
    }
    
    public void printProfile(){
        System.out.print("名前は"+name+"です。\n年齢は"+age+"です。\n住所は"+address+"です。\n");
    }
    
}
