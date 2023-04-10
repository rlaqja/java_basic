package 배열;

import java.util.Arrays;

public class 배열확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		int[] age = {60,50,30,20,10};
		
		//2
		double[] weight = new double[5];
		weight[0] = 77.8;
		weight[1] = 45.5;
		weight[2] = 88.5;
		weight[3] = 99.5;
		weight[4] = 35.5;
		
		for (int i = 0; i < weight.length; i++) {
			System.out.println(age[i]+" "+weight[i]);
		}
		
		for (double d : weight) {
			System.out.println(d);
		}
		
		
		
		
		
		
	}

}
