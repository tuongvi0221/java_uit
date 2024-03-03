package Bai03;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Khởi tạo mảng chứa danh sách sinh viên
        Student[] students = new Student[3];

        // Nhập thông tin cho từng sinh viên trong hàm main
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the information of Student_" + (i + 1));

            students[i] = new Student();

            // Nhập thông tin cho sinh viên
            System.out.println("Enter maSV: ");
            students[i].setMaSV(input.nextInt());

            input.nextLine(); // Đọc dòng mới để xử lý dấu nhấn Enter từ lần nhập trước
            System.out.println("Enter name: ");
            students[i].setName(input.nextLine());

            System.out.println("Enter Score_LT: ");
            students[i].setScore_LT(input.nextFloat());

            System.out.println("Enter Score_TH: ");
            students[i].setScore_TH(input.nextFloat());
        }

        // In danh sách sinh viên
        System.out.printf("%-10s%-25s%-15s%-15s%-15s\n", "MaSV", "Name", "Score_LT", "Score_TH", "avgScore");
        System.out.println("--------------------------------------------------------------------------------");

        for (Student student : students) {
            System.out.printf("%-10d%-25s%-15.2f%-15.2f%-15.2f\n",
                    student.getMaSV(), student.getName(), student.getScore_LT(), student.getScore_TH(), student.avgScore());
        }

        System.out.println("---------------------------------------------------------------------------------");

    }
}
