package ch12.sec12;
//어노테이션 정의

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//메소드에서만 해당 어노테이션 사용가능 하도록 지정
@Target({ElementType.METHOD})
//실행중 계속 어노테이션 정보(어떻게 처리해야 할지)를 유지한다.
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
    String value() default  "-";
    int number() default 15;

}
