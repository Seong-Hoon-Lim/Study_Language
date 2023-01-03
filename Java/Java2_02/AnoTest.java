package Java2_02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//어노테이션의 생성
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation {
	String name() default "아무개";
	int age();
}


class TestClass {
	
	@TestAnnotation(age=10)
	private int test;
	
	@TestAnnotation(name="홍길동", age=15)
	public TestClass() {
		System.out.println("생성자 실행");
		
	}
	
	@TestAnnotation(age=20)
	void test_method() {
		System.out.println("메소드 실행");
		
	}
}


public class AnoTest {

	public static void main(String[] args) {
		Constructor con = TestClass.class.getDeclaredConstructors()[0];
		Method method = TestClass.class.getDeclaredMethods()[0];
		
		//해당 어노테이션이 적용되어 있는가? (판단하고 싶은 어노테이션의 정보)
		if (con.isAnnotationPresent(TestAnnotation.class)) {
			TestAnnotation anno = 
					(TestAnnotation)con.getAnnotation(TestAnnotation.class);
			System.out.println("생성자에 적용된 어노테이션 정보 >> " );
			System.out.println("이름: " + anno.name());
			System.out.println("나이: " + anno.age());
		}
		
		if (method.isAnnotationPresent(TestAnnotation.class)) {
			TestAnnotation anno = (TestAnnotation)method.getAnnotation(TestAnnotation.class);
			System.out.println("메소드에 적용된 어노테이션 정보 >> " );
			System.out.println("이름: " + anno.name());
			System.out.println("나이: " + anno.age());
		}

	}

}
