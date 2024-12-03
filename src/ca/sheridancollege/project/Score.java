/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author myame
 */
public class Score {
    private int points;

    public Score() {
        this.points = 0;
    }

    public void addPoint() {
        this.points++;
    }

    public int getPoints() {
        return points;
    } 
}
