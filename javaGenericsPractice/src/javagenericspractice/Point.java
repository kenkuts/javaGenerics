/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenericspractice;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class Point<T> {
    
    private T x;
    private T y;
    
    public Point(T x, T y){
        
        this.x = x;
        this.y = y;
    }
    
    public T getX(){
        return x;
    }
    
    public T getY(){
        return y;
    }
}
