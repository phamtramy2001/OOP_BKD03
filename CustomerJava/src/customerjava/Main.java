/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author T470S
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner = new Scanner(System.in);
         int n;  
         Customer khachHang = null;
        ArrayList<Customer> arrKhachHang = new ArrayList<>();
        System.out.println("Nhập số lượng khách hàng: ");
        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            khachHang  = new Customer();
            System.out.println("Nhập thông tin khách hàng thứ " + (i+1) + ":");
            khachHang.nhapThongTinKhachHang();
            arrKhachHang.add(khachHang);
        }   
            for (int i = 0; i < arrKhachHang.size(); i++) {
            System.out.println("\nThông tin khách hàng thứ " + (i+1) + ": ");
            arrKhachHang.get(i).hienThiThongTinKhachHang();
           
        }
                        

        }
   
    

    }


