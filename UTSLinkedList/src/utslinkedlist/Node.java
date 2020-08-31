/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utslinkedlist;

/**
 *
 * @author ACER
 */
public class Node {
     private int angka;
    private Node nextNode;
    
    public int getAngka(){
        return angka;
    }
    public void setAngka(int angka){
        this.angka = angka;
    }
    public Node getNextNode(){
        return nextNode;
    }
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
}
