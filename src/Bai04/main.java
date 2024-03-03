package Bai04;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách xe vào một mảng, việc nhập kết thúc khi nhập tên chủ xe bằng rỗng
        System.out.println("Nhap thong tin xe. Nhap ten chu xe rong de ket thuc.");

        Car[] listCar = new Car[100]; // Giả sử có tối đa 100 xe
        int count = 0;

        do {
            listCar[count] = new Car("", "", 0.0, 0.0);
            listCar[count].nhapThongTin();
            count++;
        } while (!listCar[count - 1].getUser_name().isEmpty());

        // In thông tin và mức thuế của từng xe
        System.out.println("\nThong tin va muc thue cua cac xe:");
        System.out.printf("%-10s%-25s%-15s%-15s%-15s\n", "Ten chu xe", "Loai xe", "Tri gia xe", "Dung tich xylanh", "Muc thue");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-10s%-25s%-15.2f%-15.2f%-15.2f\n",
                    listCar[i].getUser_name(), listCar[i].getType(), listCar[i].getCost(), listCar[i].getDungTichXyLanh(), listCar[i].getVAT());
        }

        System.out.println("-------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < count - 1; i++) {
            if (!listCar[i].getUser_name().isEmpty()) {
                listCar[i].hienThiThue();
            }
        }
    }
}
