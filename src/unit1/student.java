package unit1;
import java.io.Console;
import java.text.DecimalFormat;
import java.util.Scanner;
public class student {
	public static void main(String[] args) {
        double diemKiemTraHS1, diemKiemTraHS2, diemThi, diemTrungBinh;
        String ketQuaXepLoai;   
         
        Scanner scanner = new Scanner(System.in);  
        
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        
        System.out.println("Nhập vào điểm kiểm tra C:");
        diemKiemTraHS1 = scanner.nextDouble();
        System.out.println("Nhập vào điểm kiểm tra P: ");
        diemKiemTraHS2 = scanner.nextDouble();
        
        
        if ((diemKiemTraHS1 < 0 || diemKiemTraHS1 > 10) 
            || (diemKiemTraHS2 < 0 || diemKiemTraHS2 > 10)) {
            System.out.println("Nhập điểm không hợp lệ.");
        } else {
         
            
            diemTrungBinh = ((diemKiemTraHS1 + diemKiemTraHS2 ) /2);
            decimalFormat.format(diemTrungBinh);
             
            
            if (diemTrungBinh >= 8) {
                ketQuaXepLoai = "Giỏi";
            } else if ((diemTrungBinh >=6 ) && (diemTrungBinh < 8)) {
                // toán tử AND: đúng khi cả hai biểu thức đều đúng
                ketQuaXepLoai = "Khá";
            } else if ((diemTrungBinh >= 5) && (diemTrungBinh < 6)) {
                ketQuaXepLoai = "Trung Bình";
            }  else {
                ketQuaXepLoai = "Yếu";
            }
            System.out.println("Kết quả xếp loại môn học của sinh viên là " + ketQuaXepLoai);
        }
     
    }
 
}
