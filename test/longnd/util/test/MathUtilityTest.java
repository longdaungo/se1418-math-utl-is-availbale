/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longnd.util.test;

import longnd.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IT
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
        // mình sẽ test các tình huống xài hàm getFactorial() ở đây
        
        //tình huống if tham số đưa vào: dương, âm, dương trong khoang 0...20, ngoài 
        // tình huống xài hàm, test hàm gọi là test cases
        //thường ta có tình uống thành cong và thất bại
        //thành công: đưa vòa value hợp lê 0..20
        //thất bại: đưa vào âm,>20, bị ăn đòn
        //hàm phải bất các tình huongs này, và giờ ta test thử coi àm xử lí đúng không
        
        //quy tăc đặt tên hàm cho việc test phần mềm: rất nhiều quy tắc
        //nhưng nói chung tên hàm sẽ bao gồm ngữ nghĩa kết quả trả về, tình trạng
        //mình đang viết code để test app
        
    }
    @Test //biến hàm này thành pubic static void main()
    public void getFactorial_RunWell_IfValidArgument() {
        assertEquals(120, MathUtility.getFactorial(5));
        //tôi muốn check coi có đúng là gọi hàm 5! ói về 120 hay không?
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(0));
        
      
        //có xanh heng,ko, đỏ heng
        
    }
    //Mặc định code test đọc lập với code chính
    // đọc lập với quá trình CLEAN&BUILD, TỨC LÀ DÙ CODE BẠN XANH HAY ĐỎ
    //MIỄN LÀ KHÔNG BỊ EROR CÚ PHÁP
    //BẠN LUÔN ĐÓNG GÓI BUILD RA ĐƯỢC FILE.JAR .WAR(XHAAPS XANH ĐỎ)
    //HỢP LOGIC THÌ MÀU XANH, TỨC LÀM HÀM CHUẨN THÌ MỚI NÊ RA ĐC, JAR, WAR
    //VẬY TA CẦN CÓ 1 CÁCH GÀI XANH ĐỎ VÀO QUY TRÌNH BUILD .JAR, WAR
    //CÁCH KHÁC: NÊN CODE TEST ĐANG MÀU ĐỎ THÌ DISABLE CÁI NÚT BẤM CLEAN&BUILD
    
}
