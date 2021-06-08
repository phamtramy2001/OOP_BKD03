/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerjava;
import java.util.Scanner;

/**
 *
 * @author T470S
 */
public class Customer {
    private String FullName;
    private String Address;
    private int phone;
    private float Amount;
    private float Discout;
    private float Tax;
    private Iterable<Customer> arrKhachHang;

    public Customer() {
    }

    public Customer(String FullName, String Address, int phone, float Amount, float Discout, float Tax) {
        this.FullName = FullName;
        this.Address = Address;
        this.phone = phone;
        this.Amount = Amount;
        this.Discout = Discout;
        this.Tax = Tax;
    }

    public String getAddress() {
        return Address;
    }

    public float getDiscout() {
        return Discout;
    }

    public String getFullName() {
        return FullName;
    }

    public int getPhone() {
        return phone;
    }

    public float getAmount() {
        return Amount;
    }

    public float getTax() {
        return Tax;
    }
    

    public void nhapThongTinKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên :");
        FullName = scanner.nextLine();
        System.out.println("Nhập vào dia chi:");
        Address = scanner.nextLine();
        System.out.println("Nhập vào sdt:");
        phone = scanner.nextInt();
        System.out.println("Nhập vào amout: ");
        Amount = scanner.nextFloat();
        System.out.println("Nhập vào Chiết khấu: ");
        Discout = scanner.nextFloat();
        System.out.println("Nhập vào thuế: ");
        Tax = scanner.nextFloat();
    }

    public void hienThiThongTinKhachHang() {
        System.out.println("Họ và tên khách hàng: " + FullName);
        System.out.println("Địa chỉ: " + Address);
        System.out.println("Số điện thoại: " + phone);
        System.out.println("Tổng tiền: " + Amount);
        System.out.println("Chiết khấu: " + Discout);
        System.out.println("Thuế: " + Tax);
    }

    
    public float CaculateTheAmount() {
        float sum = 0.0f;
        return 0;
        
    }
    
}
