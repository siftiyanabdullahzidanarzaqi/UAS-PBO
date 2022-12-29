/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enemy;

/**
 *
 * @author aulia
 */
public class Main {
    public static void main(String[]args){
        Enemy monster = new Enemy();
        Zombie zombi = new Zombie();
        Pocong poci = new Pocong();
        Burung owl = new Burung();
        
        monster.attack();
        
        zombi.name = "Zombie";
        zombi.hp = 900;
        zombi.attackPoin = 90;
        
        poci.name = "Pocong";
        poci.hp = 500;
        poci.attackPoin = 50;
        
        owl.name = "Burung Hantu";
        owl.hp = 800;
        owl.attackPoin = 80;
        
        System.out.println(zombi.name);
        System.out.println(zombi.hp);
        System.out.println(zombi.attackPoin);
        
        System.out.println(poci.name);
        System.out.println(poci.hp);
        System.out.println(poci.attackPoin);
        
        System.out.println(owl.name);
        System.out.println(owl.hp);
        System.out.println(owl.attackPoin);
    }
}
