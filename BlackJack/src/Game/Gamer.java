/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

/**
 *
 * @author 801763
 */
import Cards.Pack;
import Cards.Card;
public class Gamer {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//    }
    int Points;  
    
    public void takeCard(Pack koloda) // Взять случайную карту с колоды
    {
        Card crd = new Card();
        crd = koloda.getRandomCard();
        Points += crd.getWeight();
    }
    public int getPoints()
    {
        return Points;
    }
    public void reset()
    {
        Points = 0;
    }
    
    
}

