/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BJ;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author guest1Day
 */
abstract class Human {
    
    protected  ArrayList<Integer> myCards = new ArrayList<Integer>();
    abstract public int open();
    abstract public void setCard(ArrayList<Integer> draw);
    abstract public boolean checkSum();
    
}