package com.phucpd.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    // test case #1: n = 5!, expected = 120
    @Test
    void testFactorialGivenValidN5ReturnWell120() {
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);
        // so sánh bằng cơm hay bằng thư viện
        // bằng cơm, in log file, đã chơi và nay ko chơi, xem bên main()

        // so sánh bằng tool xanh đỏ
        assertEquals(expected, actual);
    }

    // test case #2: n = 6!, expected = 720
    @Test
    void testFactorialGivenValidN6ReturnWell720() {
        int n = 6;
        long expected = 720;
        long actual = MathUtil.getFactorial(n);
        // so sánh bằng cơm hay bằng thư viện
        // bằng cơm, in log file, đã chơi và nay ko chơi, xem bên main()

        // so sánh bằng tool xanh đỏ
        assertEquals(expected, actual);
    }

    // test case #3: n = 0!, expected = 1
    @Test
    void testFactorialGivenValidN0ReturnWell1() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        // so sánh bằng cơm hay bằng thư viện
        // bằng cơm, in log file, đã chơi và nay ko chơi, xem bên main()

        // so sánh bằng tool xanh đỏ
        assertEquals(expected, actual);
    }

    // test case #4: n = -1!, expected = hàm phải ném ra ngoại lệ thì mới là hàm đúng, vì dự kiến -1 phải ném ra ngoại lệ!!!
    // ngoại lệ là thứ không thể assertEquals() ta phải dùng 1 assert khác
    @Test
    void testFactorialGivenInvalidMinus1ThrowsException() {
        int invalidN = -1;
        // assertThrows(ngoại lệ cần bắt xem có xuất hiện ko, hàm lambda có lệnh gọi hàm-code chính)
        // assertThrows(IllegalArgumentException.class, () -> {});
        assertThrows(IllegalArgumentException.class, () -> {MathUtil.getFactorial(invalidN);});
    }

}