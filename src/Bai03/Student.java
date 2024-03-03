/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai03;
public class Student {
    private int maSV;
    private String name;
    private float Score_LT;
    private float Score_TH;
    
    Student(){
        this.maSV = 0;
        this.name = "";
        this.Score_LT = 0;
        this.Score_TH = 0;
    }
    
    Student(int maSV, String name, float Score_LT, float Score_TH){
        this.maSV = maSV;
        this.name = name;
        this.Score_LT = Score_LT;
        this.Score_TH = Score_TH;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getName() {
        return name;
    }

    public float getScore_LT() {
        return Score_LT;
    }

    public float getScore_TH() {
        return Score_TH;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore_LT(float Score_LT) {
        this.Score_LT = Score_LT;
    }

    public void setScore_TH(float Score_TH) {
        this.Score_TH = Score_TH;
    }
    
    public float avgScore(){
        return (this.Score_LT + this.Score_TH) / 2;    
    }
    
    public String toString(){
        return "MaSV: " + maSV + "Name: " + name + "Score_LT: " + Score_LT + "Score_TH: " + Score_TH + "avgScore: " + avgScore();
    }
    
        
}
