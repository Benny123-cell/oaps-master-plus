package psp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class psp {

	private static Scanner a;
	private static Scanner b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j;
    double sum = 0;
    DecimalFormat df = new DecimalFormat("#.00");
    a = new Scanner(System.in);
    System.out.print("How many numbers:");
    int n = a.nextInt();
    double[] list = new double[n];
    for(i=1;i<=n;i++) {
    	b = new Scanner(System.in);
    	System.out.print("x("+ i +")" + "=");
    	list[i-1] = b.nextDouble();
    	sum = sum + list[i-1];
    }
    double aver;
    aver=sum/n;
    System.out.println("The averange is " + df.format(aver));
    
    double std,sd;
    double ed = 0;
    for(j=1;j<=n;j++) {
     ed=ed + Math.pow(list[j-1]-aver,2);
    }
    sd=ed/(n-1);
    std=Math.sqrt(sd);
    System.out.println("The std is " + df.format(std));
	}
}