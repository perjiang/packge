package com.jx.packge.Enum;

/**
 * @ClassName EnumTest
 * @Description TODO
 * @Author
 * @Date 2022/7/12 11:25
 */
public class EnumTest {
    public static void main(String[] args) {
        Result result = Result.valueOf(RegisterMethod.TEST.getEv());
        result.sout("mobile");
    }


}
