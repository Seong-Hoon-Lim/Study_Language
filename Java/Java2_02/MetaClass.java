package Java2_02;

import java.lang.reflect.Method;

interface Info {
	void prinf_info(String info);
}

class InfoClass implements Info {

	@Override
	public void prinf_info(String data) {
		System.out.println("PRINT");
		
	}
	
	public void set_info(String data) {
		System.out.println("SETTING");
	}

}

public class MetaClass {	
			
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("Java2_02.InfoClass");
		InfoClass info = (InfoClass)clazz.newInstance(); //다운캐스팅
		Object obj = clazz.newInstance();
		Method[] methods = clazz.getDeclaredMethods();
		info.set_info("test");
		
		System.out.println("정의된 메소드의 정보입니다.");
		for (Method method : methods) {
			System.out.println(method.getName());
			method.invoke(new InfoClass(), "test");
		}
		
	}
}
