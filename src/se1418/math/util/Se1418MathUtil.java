/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1418.math.util;

import longnd.util.MathUtility;

/**
 *
 * @author IT
 */
public class Se1418MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2. test hàm = mắt
        System.out.println("5!:"+MathUtility.getFactorial(5));
        // expected:120, actual:
        // tao hi vọng mày ói về 120 khi tao gọi mày hàm giai thừa
        
        // và tést bộ dâta khác, test case, tihf huống khác
        System.out.println("0:"+MathUtility.getFactorial(0));
        //e:1, a:1 -> okie
        
        //e:ném về ngoại lệ IllegalArgumentException nếu gia thừa -5
        System.out.println("-5!:"+MathUtility.getFactorial(-5));
        
    }   
}
      // TODO code application logic here
        //Code viet ra thi dev phai test truoc cai da
        //có vài hình thức test Devlopment
        //viết dàn khung của hàm getFactorial(int n)
        // chạy thửu coi xanh đỉ, đỏ nghĩa là lỗi, xanh  nghĩa là ôn
        // cứ liên tục, xanh đỏ như thế trong quá trình viết code
// à sửa code, người ta gọi là lập trình hướng theo thỏa mãn
// việc tét, TDD
//2. sout(hàm d=kèm data) đểcoi kết quả ra sao , có đúng như mình kì vọng hay không
// nó phải traer về như thế hay không -> xem kết quả test = mắt
// 3JOPtion Pane của bên avaDesktop để popoup kết quả lên màn hình,vẫ xem = mắt
//4. viết 1 trang web gọi hàm xử lí..., hao sức
// ta chơi 1 và 2 cách