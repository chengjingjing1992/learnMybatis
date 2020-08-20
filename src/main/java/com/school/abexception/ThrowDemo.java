package com.school.abexception;

import java.util.Objects;

/**
 * @author chengjinging
 * @date 2020/8/18 下午10:51
 *
 *  throwable是所有异常和错误的超类
 *
 *
 *
 *
 *
 *
 *
 */
public class ThrowDemo {


    /**
     *
     *
     * Exception 编译期异常：在编写代码过程时，编译器会给提示（报红线）
     *
     *
     *          方式2：捕获该异常, 通过这种方式 发生异常时 之后的代码可以继续执行
     *
     *
     *
     *
     *          RuntimeException 运行期异常：程序运行过程中出现的异常 , 编写代码时编译器不会给提示
     *
     *
     * */

    public static void main(String[] args)  {
        /**
         * 像这样也是 交给JVM处理 ，发生异常后程序中断，后面代码不再执行
         */

        System.out.println("111");
        int [] arr=null;
        Objects.requireNonNull(arr);
        System.out.println("222");

    }

}






