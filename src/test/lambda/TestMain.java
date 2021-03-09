package test.lambda;

public class TestMain {
	public static void main(String k[]) {
		
		/*
		 * GreetingService helloService = name -> System.out.println("Hello..."+name);
		 * helloService.greet("Suman");
		 */
		
		GreetingService helloServiceMulti = name -> name.length();		
		System.out.println(helloServiceMulti.greet("Suman"));
	}

}
