package unit1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class student {
	public static void main(String[] args) {
	String name, claass;
        double diemKiemTraC, diemKiemTraP, diemTrungBinh;
        String ketQuaXepLoai;   
         
        Scanner scanner = new Scanner(System.in);  
        
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.println("Nhập vào tên sv:");
        name = scanner.nextLine();
        System.out.println("Nhập vào tên lớp:");
        claass = scanner.nextLine();
        System.out.println("Nhập vào điểm kiểm tra C:");
        diemKiemTraC = scanner.nextDouble();
        System.out.println("Nhập vào điểm kiểm tra P: ");
        diemKiemTraP = scanner.nextDouble();
        
        
        if ((diemKiemTraC < 0 || diemKiemTraC > 10) 
            || (diemKiemTraP < 0 || diemKiemTraP > 10)) {
            System.out.println("Nhập điểm không hợp lệ.");
        } else {
         
            
            diemTrungBinh = ((diemKiemTraC + diemKiemTraP ) /2);
            decimalFormat.format(diemTrungBinh);
             
            
            if (diemTrungBinh >= 8) {
                ketQuaXepLoai = "Giỏi";
            } else if ((diemTrungBinh >=6 ) && (diemTrungBinh < 8)) {
                
                ketQuaXepLoai = "Khá";
            } else if ((diemTrungBinh >= 5) && (diemTrungBinh < 6)) {
                ketQuaXepLoai = "Trung Bình";
            }  else {
                ketQuaXepLoai = "Yếu";
            }
            System.out.println("Kết quả xếp loại môn học của sinh viên :  : "+name+" Lớp " + claass+" là " + ketQuaXepLoai);
        }
     
    }
 
}
