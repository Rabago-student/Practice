/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author CERVANTESPC11
 */


public class Menu{
    
Menu(){
    
}
private String meals;
private String desserts;
private String drinks;

public void setmeals(String meals){
    this.meals=meals;
}
public String getmeals(){
    return this.meals;
}
public void setdesserts(String desserts){
    this.desserts=desserts;
}
public String getdesserts(){
    return this.desserts;
}
public void setdrinks(String drinks){
    this.drinks=drinks;
}
public String getdrinks(){
    return this.drinks;
}
public static void main(String[] args) {
    Menu s = new Menu();
    s.setmeals("Sisig");
    System.out.println(s.getmeals());
    s.setdesserts("Leche plan");
    System.out.println(s.getdesserts());
    s.setdrinks("Coke");
    System.out.println(s.getdrinks());
}
}

    
    
    
