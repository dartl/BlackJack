/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;


import java.util.ArrayList;
public class Gamer {

    private int Points;
    ArrayList <Integer> weightList;
    ArrayList <Integer> numberList;
    
    public Gamer()
    {
        weightList = new ArrayList <Integer>();
        numberList = new ArrayList <Integer>();
    }
    public void takeAce()
    {
        Points-=10;
    }
    public Boolean hasAce()
    {
        Boolean b = false;
        for(int j=0; j < weightList.size(); j++)
            if (weightList.get(j) == 11) 
            {
                b = true;
                weightList.set(j, 1);
            }
        return b;
    }
    public int takeCard(Pack koloda) // Взять случайную карту с колоды
    {
        Card crd = new Card();
        crd = koloda.getRandomCard();
        Points += crd.getWeight();
        weightList.add(crd.getWeight());
        numberList.add(crd.getNumber());
        return crd.getNumber();
    }
    public int getPoints()
    {
        return Points;
    }
    public void Reset()
    {
        Points = 0;
        weightList.clear();
        numberList.clear();
    }

}