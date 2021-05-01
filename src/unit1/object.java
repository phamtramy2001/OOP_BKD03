package unit1;

public class object {
    public static void main(String[] args) {
    	class_bkd03 sv1, sv2, sv3;
    	sv1 = new class_bkd03();
    	sv1.firstName = "Trinh";
    	sv1.lastName = "Thuy Nga";
    	sv1.age = 20;
    	
    	sv1.thongtinchitiet();
    	
    	sv2 = new class_bkd03("Pham","Thi Hoa",20);
    	sv2.thongtinchitiet();
    	sv3 = new class_bkd03("Dang","Khanh Huyen",20);
    	sv3.thongtinchitiet();
    }
}
