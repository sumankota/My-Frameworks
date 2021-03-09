package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {	

		    public static void main(String[] args) {

	        List<String> list = Arrays.asList("A", "B", "C");

	        // anonymous class
	        list.forEach(new Consumer<String>() {
	            @Override
	            public void accept(String x) {
	                SimplePrinter.prints(x);
	            }
	        });

	        // lambda expression
	        list.forEach(x -> SimplePrinter.prints(x));

	        // method reference
	        list.forEach(SimplePrinter::prints);

	    }

	}

	class SimplePrinter {
	    public static void prints(String str) {
	        System.out.println(str);
	    }
	}


