package week1.day1;

public class Calculator {
public void subtwoNumbers() {
int a=20;
int b=10;
System.out.println(a-b);
}
public double subtwoValues(double c, double d) {
return c-d;

}
public void multiplytwoNumbers() {
int c = 5;
double d=5000.55;
System.out.println(c*d);
}
public int multiplytwoNumbers(int a, int b) {
	return a*b;

}
public void addtwoNumbers() {
	int a=1;
	int b=2;
	System.out.println(a+b);
	}
public int addthreenumbers(int c, int d, int e) {
return c+d+e;

}
public void dividetwonumbers() {
	int a=1000;
	int b=10;
	System.out.println(a/b);

}
public double dividetwovalues(int c, double d) {
return c/d;

}
public static void main(String[] args) {
	Calculator num = new Calculator();
	num.subtwoNumbers();
	System.out.println(num.multiplytwoNumbers(10,2));
	num.subtwoValues(1000.11, 2000.22);
	System.out.println(num.subtwoValues(1000.11, 2000.22));
	num.addtwoNumbers();
	System.out.println(num.addthreenumbers(1, 2, 3));
num.multiplytwoNumbers();
num.dividetwonumbers();
System.out.println(num.dividetwovalues(100, 10));
num.dividetwovalues(100, 10);
}
}