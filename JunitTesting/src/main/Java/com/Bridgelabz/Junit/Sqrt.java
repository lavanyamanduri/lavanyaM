package com.Bridgelabz.Junit;


public class Sqrt {

	public static long sqrt(double c) {
	  double epsilon = 1.0e-15;  
      double t = c;            

      while (Math.abs(t - c/t) > epsilon*t) {
          t = (c/t + t) / 2.0;
      }
      long s=Math.round(t);
      return s;
     
    //  System.out.println(t);
	}
	
}