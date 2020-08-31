/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utslinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class UTSLinkedList {
    Node head = null;
    Node tail = null;
    
    public static LinkedList <Integer> data = new LinkedList<Integer>();
    
    public static Scanner input(){
        return new Scanner(System.in);
    }
    
    //menambahkan fungsion variable
    public static void add(int nilai){
        
        System.out.println("selamat datang di tempat parkir");
        System.out.println("imput data");
        int oi = input().nextInt();
        System.out.println("anda penumpang ke-"+oi);
        data.add(oi);
        tampilan();

        
    }
    
    public static void tampilan(){
        System.out.println("data semua = "+data);
        add(0);
    }
    // fungsion menghilangkan variable
    public boolean Remove(int nilai){
        if(this.head == null){
            return false;
        }
        Node n = this.head;
        if(n.getAngka()== nilai){
            if(this.head == this.tail){
                this.head = null;
                this.tail = null;
            }else{
                this.head = this.head.getNextNode();
            }
            return true;
        }
        while(n.getNextNode() !=null && n.getNextNode().getAngka() != nilai){
            n = n.getNextNode();
        }
        if(n.getNextNode() != null){
            if(n.getNextNode() == this.tail){
                this.tail = n;
            }
            n.setNextNode(n.getNextNode().getNextNode());
            return true;
        }
        return false;
    }
    //fungsion serching
    
    
     public boolean contains(int value){
        Node n = this.tail;
        while (n != null && n.getAngka() == value){
            n = n.getNextNode();
        }
        if (n == null){
            return false;
        }
        return true;
    }
    public String txt(){
        String output = "";
        Node n = this.head;
        while(n != null){
            output += n.getAngka() + " ";
            n = n.getNextNode();
        }
        return output;
    }
}
