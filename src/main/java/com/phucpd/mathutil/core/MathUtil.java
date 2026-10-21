package com.phucpd.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {
        //refactoring, refactor: tối ưu, tinh chỉnh src code
        //code mới khi dc đưa lên server phải dc chạy lại ngay ở nhansh dev hoặc khi đưa vào nhánh main
        // thì cũng phải dc check để đảm bảo rằng nó màu xanh, passed các test case
        //lý do: hàm thì phải chạy đúng!!!
        //nếu project cps sẵn tdd, unit test, thì quá trình kiểm thử lại code vừa sửa diễn ra rất nhanh, rất tiện
        // do unit test khi phối hợp với ci script(.YML).sẽ tự động dc run và tự báo màu xanh đỏ và gửi email chửi ếu đỏ
        // test lại thứ đã từng test để chawsc chắn rằng nó vẫn còn ổn sau khi dc sửa dc gọi là kiểm thử hồi quy - REGRESSION TESTING
        // ta chỉnh code dùng đệ quy - RECURSION
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid parameter. n must be between 0 and 20");
        }
        if(n == 0 || n == 1) return 1;
        long result = 1;
        // Đệ quy nè, recursion nè
        return n * getFactorial(n - 1);
        //n! = n * (n - 1)!
        
        //điểm dùng của đệ quy
        //khởi đầu gia thừa bằng 1, nhân dần
//                         //code cố tình tạo bug, giai thừa dc nhân thêm 10
//                        //sửa lại src để mlem trở lại, green 4 ever
//        for(int i = 1; i <= n; i++) {
//            result*=i;
//        }
//        return result;
    }
}
