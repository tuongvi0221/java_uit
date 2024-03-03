/*
 Câu 4: Thông tin của xe bao gồm: tên chủ xe, loại xe, trị giá xe, dung tích xylanh của xe. 
Dựa vào trị giá xe và dung tích xylanh của xe để tính mức thuế phải đóng sau khi mua xe 
như sau:
o Dung tích dưới 100cc, 1% trị giá xe. 
o Dung tích từ 100 đến 175cc, 3% trị giá xe. 
o Dung tích trên 175cc, 5% trị giá xe.
Hãy cài đặt lớp Xe với các thuộc tính và phương thức phù hợp yêu cầu. 
Xây dựng các hàm để thực hiện các yêu cầu sau:
o Nhập danh sách xe vào một mảng, việc nhập kết thúc khi ta nhập tên chủ xe bằng 
rỗng.
o Xuất bảng kê khai tiền thuế phải đóng của các xe trong danh sách. Thông tin xuất 
bao gồm: tên chủ xe, loại xe, trị giá xe, dung tích xylanh của xe, thuế phải đóng.
o Nhập tên chủ xe và loại xe vào, xuất hiện thuế phải đóng của chủ xe.
 */
package Bai04;
import java.util.Scanner;


public class Car {
    private String user_name;
    private String type;
    private double cost;
    private double dungTichXyLanh;
  

    public Car() {
        this.user_name ="";
        this.type = "";
        this.cost = 0.0;
        this.dungTichXyLanh = 0.0;
    }

    public Car(String user_name, String type, double cost, double dungTichXyLanh) {
        this.user_name = user_name;
        this.type = type;
        this.cost = cost;
        this.dungTichXyLanh = dungTichXyLanh;
        
    }

    public double getCost() {
        return cost;
    }

    public double getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getType() {
        return type;
    }


    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDungTichXyLanh(double dungTichXyLanh) {
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

   
    
    public double getVAT(){
        double vat;
        if(dungTichXyLanh < 100){
            vat = 0.01 * cost;
        }else if(dungTichXyLanh > 100 && dungTichXyLanh < 175 ){
            vat = 0.03 * cost;
        } else{
            vat = 0.05 * cost;
        }
        return vat;
    }
 
 public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten chu xe (Enter de ket thuc nhap): ");
        user_name = scanner.nextLine();

        if (!user_name.isEmpty()) {
            System.out.println("Nhap loai xe: ");
            type = scanner.nextLine();

            System.out.println("Nhap tri gia xe: ");
            cost = scanner.nextDouble();

            System.out.println("Nhap dung tich xylanh: ");
            dungTichXyLanh = scanner.nextInt();
        }
    }
 
 public void hienThiThue() {
        System.out.println("Thue phai dong cua chu xe " + user_name + " voi loai xe " + type + " la: " + getVAT());
    }
}
