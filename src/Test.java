
public class Test {
	public static void main(String[]args) {		
		Person taro = new Person();
		taro.name="山田太朗";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="taro@gmail.com";
		
		Person jiro = new Person();
		jiro.name="木村次朗";
		jiro.age=18;
		jiro.phoneNumber="000-0000-0000";
		jiro.address="jiro@gmail.com";
			
		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="000-0000-0000";
		hanako.address="hanako@gmail.com";
		
		Person yutaka = new Person();
		yutaka.name="松田ゆたか";
		yutaka.age=25;
		yutaka.phoneNumber="000-0000-0000";
		yutaka.address="yutaka@gmail.com";
		
		Robot aibo = new Robot();
		aibo.name="aibo";
		
		Robot asimo = new Robot();
		asimo.name="asimo";
		
		Robot pepper = new Robot();
		pepper.name="pepper";
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();
		
		System.out.println(yutaka.name);
		System.out.println(yutaka.age);
		System.out.println(yutaka.phoneNumber);
		System.out.println(yutaka.address);
		yutaka.talk();
		yutaka.walk();
		yutaka.run();
		
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
				
	}
}
