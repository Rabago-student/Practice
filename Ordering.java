/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;

/**
 *
 * @author CERVANTESPC11
 */

    public class Ordering{
    
Ordering(){
    
}
private int Price;
private String Order;
private String Food;

public void setPrice(int Price){
    this.Price=Price;
}
public int getPrice(){
    return this.Price;
}
public void setOrder(String Order){
    this.Order=Order;
}
public String getOrder(){
    return this.Order;
}
public String getFood(){
    return this.Food;
}
public void setFood(String Food){
    this.Food=Food;
}

public static void main(String[] args) {
Ordering s = new Ordering();
s.setPrice(500);
System.out.println(s.getPrice());
s.setOrder("Bucket meal");
System.out.println(s.getOrder());
s.setFood("Fries");
System.out.println(s.getFood());
}
}

