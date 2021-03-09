package test;

interface Drawable{  
    public void draw(String name,String name1);  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
    	int width=10;
    	
    	/*
		 * int width=10;
		 * 
		 * //without lambda, Drawable implementation using anonymous class Drawable
		 * d=new Drawable(){ public void draw(){System.out.println("Drawing "+width);}
		 * }; d.draw();
		 */
    	
    	Drawable d2 = (name,name1) -> { 
    		System.out.println(name +" & "+ name1);
    	};        	  	
    	d2.draw("Suman","Sravani");    	
    }  
}  