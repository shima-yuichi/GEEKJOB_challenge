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
public class Main2 {
    public static void main(String[] args){
        Class2 test = new Class2();
        
        test.setProfile("島　雄一", 25, "千葉県");
        test.printProfile();
        test.clearProfile();
        test.printProfile();
    }
    
}
