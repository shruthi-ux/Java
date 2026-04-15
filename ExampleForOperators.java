package day2;

public class ExampleForOperators {
   public static void main(String[] args) {
	   
	   System.out.println("-----Arithmetic Operators-----");
	   
	   int num1=30;
	   int num2=40;
	   System.out.println("Addition"+(num1+num2));
	   System.out.println("Substraction"+(num1-12));
	   System.out.println("Multiplication"+(num2*3));
	   System.out.println("Division"+(num2/10));
	   System.out.println("Modulus"+(num2 % 3));

	   System.out.println("-----Assigment Operators-------");
       
       int x=10;
       x += 5;
       System.out.println("value of x :"+ x);
       x -=3;
       System.out.println("value of x :"+ x);
       x /= 2;
       System.out.println("value of x :"+ x);
       x *=3;
       System.out.println("value of x :"+ x);
       
       System.out.println("----Comparision operators");
       
       int a=19;
       int b=20;
       
       System.out.println(a<b);
       System.out.println(a<=5);
       System.out.println(b>a);
       System.out.println(b>=50);
       System.out.println(a==b);
       System.out.println(a!=b);
       
       System.out.println("------Logical Operators------");
       
       int p=1;
       int q=2;
       boolean result=p<q && p==1;
       System.out.println(result);
       System.out.println(p<=4 || q==10);
       System.out.println(!true);
       System.out.println(!false);
       
       System.out.println("-----Unary Operators----");
       
       int n=20;
       int m=n++ + n-- + ++n + n++ +  n-- + ++n - --n;
       System.out.println(n);
       System.out.println(m);
       
       System.out.println("-----Ternary Opertors---");
       
       int number1=200;
       int number2=300;
       
       int max = number1 > number2 ? number1 : number2;
       
       System.out.println("Maximum of " + number1 + " & " + number2 + " is " + max);
   }
}
