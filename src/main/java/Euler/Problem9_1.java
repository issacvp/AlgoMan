package Euler;

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

This is a more mathematical solution

a= u^2-v^2   , b = 2uv, c = u^2+v^2

a+b+c = 1000

u^2-v^2 +2uv +u^2+u^2 +v^2  = 1000
2u^2 +2uv = 1000
2u(u+v) = 1000
u(u+v) = 500  , find now the number which are m>n sufficient to get .

then apply the values to the first assumption 

 * */
public class Problem9_1 {

	public static void main(String[] args) {
	   int a = 0,b=0,c=0,u=0,v=0;
	   for(u=0;u<500;u++) {
		   for(v=1;v<u;v++) {
			   if(u*(u+v)==500) {
				   System.out.println("U ="+u +", V="+v);
				   a = u*u -v*v;
				   b = 2*u*v;
				   c = u*u + v*v;
				   System.out.println("A ="+a +", B="+b +"C ="+c);
				   break;
			   }
		   }
	   }
	}

}
