/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longnd.util;

/**
 *
 * @author IT
 */
public class MathUtility {
    
    //class nay chua cac ham tien ich dung chung cho moi noi 
    //do do no phai nen la static
    public static final double PI = 3.1415;
    
    //ham tinh n giai thua ,n >= 0 && n<= 20
    //neu qua 20 tran kieu long
    //0! = 1; 1!= 1;n! = 1,2,3...n
   
    public static long getFactorial(int n){
        if(n< 0 || n> 20){
            throw new IllegalArgumentException("n must be >= 0 & <= 20");
        // dua dau vao ca chon, mminh kong them tra ve 1 gia am chi sai roi
        // mình chửi luôn
        }
        if(n == 0 | n ==1)
            return 1;
        //song sot den day, thi n >1 va <= 20 roi
        long result =1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
