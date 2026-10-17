package com.phucpd.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid parameter. n must be between 0 and 20");
        }
        if(n == 0) return 1;
        long result = 1;//khởi đầu gia thừa bằng 1, nhân dần
                         //code cố tình tạo bug, giai thừa dc nhân thêm 10
                        //sửa lại src để mlem trở lại, green 4 ever
        for(int i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
    }
}
