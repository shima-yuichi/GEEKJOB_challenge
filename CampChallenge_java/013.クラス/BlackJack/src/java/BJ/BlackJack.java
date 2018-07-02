/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJ;
import java.util.*;
import java.io.PrintWriter;

/**
 *
 * @author guest1Day
 */
public class BlackJack {
    public static void main(String[] args){
        
        Dealer master = new Dealer();
        User player = new User();
        
        player.setCard(master.deal());
        master.setCard(master.deal());
        
        int Mside = master.myCards.get(0);
        
        System.out.print("プレイヤーの初手は"+player.open()+"です\n");
        System.out.print("ディーラーの初手は"+Mside+"です\n");
        
        
        while(player.checkSum() == true){
            player.setCard(master.hit());
            System.out.print("プレイヤーがヒットしました\n");
        }
        
        while(master.checkSum() == true){
            master.setCard(master.hit());
            System.out.print("ディーラーがヒットしました\n");
        }
        
        int Ptotal = player.open();
        int Mtotal = master.open();
            
        
        System.out.print("プレイヤーの最終手は"+Ptotal+"です\n");
        if(Ptotal>21){
            System.out.print("プレイヤーがバストしました\nディーラーの勝利です\n");
        }
        else if(Mtotal>21&&Ptotal<22){
            System.out.print("ディーラーの最終手は"+Mtotal+"です\n");
            System.out.print("ディーラーがバストしました\nプレイヤーの勝利です\n");
        }
        else if(Mtotal<22&&Ptotal<22){
            if(Mtotal>Ptotal){
                System.out.print("ディーラーの最終手は"+Mtotal+"です\n");
                System.out.print("ディーラーの勝利です\n");
            }
            else if(Ptotal>Mtotal){
                System.out.print("ディーラーの最終手は"+Mtotal+"です\n");
                System.out.print("プレイヤーの勝利です\n");
            }
            else if(Ptotal==Mtotal){
                System.out.print("ディーラーの最終手は"+Mtotal+"です\n");
                System.out.print("引き分けです\n");
            }
            
        }
        
             
     }
    
}
