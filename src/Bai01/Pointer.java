/*
Câu 1: Nhập vào 2 điểm có tọa độ (x, y). Xuất thông tin và tính khoảng cách của 2
điểm đó.
Hướng dẫn: xây dựng lớp Pointer, xác định thuộc tính và phương thức.
 */
package Bai01;

import java.util.Scanner;

public class Pointer {

    private int x;
    private int y;

    Pointer() {
        x = 0;
        y = 0;
    }

    Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void set_x(int x) {
        this.x = x;
    }

    public void set_y(int y) {
        this.y = y;
    }

    public int get_x() {
        return x;
    }

    public int get_y() {
        return y;
    }

    public void input() {
        Scanner iput = new Scanner(System.in);
        System.out.println("Enter hoanh do ");
        x = iput.nextInt();
        System.out.println("Enter tung do ");
        y = iput.nextInt();
    }

    public void output() {
        System.out.println("Hoanh do: " + this.x + " Tung do: " + this.y);
    }

    public double distance(Pointer other) {
        double result = Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
        return result;
    }
}
