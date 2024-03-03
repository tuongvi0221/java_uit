/*
Câu 2: Viết chương trình tính diện tích, chu vi hình chữ nhật.
Hướng dẫn: cài đặt lớp HinhChuNhat gồm có:
• Thuộc tính : chiều dài, chiều rộng.
• Phương thức thiết lập (set), và lấy (get) thông tin chiều dài, chiều rộng.
• Phương thức tính diện tích, chu vi.
• Phương thức toString gồm các thông tin dài, rộng, diện tích, chu vi.
• Xây dựng lớp chứa hàm main cho phần kiểm nghiệm. Dài rộng có thể nhập từ
bàn phím
 */
package Bai02;
public class Rectangle {
    int length;
    int width;
    
    Rectangle(){
    this.length = 0;
    this.width = 0;
    }
    
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    
    public void set_Length(int length){
        this.length = length;
    }
    
    public void set_Width(int width){
        this.width = width;
    }
    
    public int get_Length(){
        return length;
    }
    
    public int get_Width(){
        return width;
    }
    
    public int getArea(){
        return this.length * this.width;
    }
    
    public int getPerimeter(){
        return(this.length + this.width)*2;
    }
    
   public String toString() {
    return "Length: " + this.length + ", Width: " + this.width + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter();
}

    
    
}
