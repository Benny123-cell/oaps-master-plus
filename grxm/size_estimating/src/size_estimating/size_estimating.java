package size_estimating;
import java.util.Scanner;

public class size_estimating {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
	    System.out.println("请输入数字个数：");
	    int n=input.nextInt();
	    double[] data=new double[n];
	    double log_sum=0;
	    double log_avg=0;
	    double log=0;
	    double var=0;
	    double dev=0;
	    double VS;
	    double S;
	    double M;
	    double L;
	    double VL;
	    
	    System.out.println("请输入一组数据，并用逗号隔开：");
	    
		String inputString=input.next();
		String stringArray[]=inputString.split(",");
		for(int i=0;i<n;i++)
		{
		    data[i]=Double.parseDouble(stringArray[i]);
		    log_sum=log_sum+Math.log(data[i]);		    
		}
		log_avg=log_sum/n;
		
		for(int i=0;i<n;i++)
		{
			log=log+(Math.log(data[i])-log_avg)*(Math.log(data[i])-log_avg);
		}
		var=log/(n-1);
		dev=Math.sqrt(var);
		
		VS=Math.exp(log_avg-2*dev);
		S=Math.exp(log_avg-dev);
		M=Math.exp(log_avg);
		L=Math.exp(log_avg+dev);
		VL=Math.exp(log_avg+2*dev);
		
        System.out.println("VS = "+VS);
        System.out.println("S = "+S);
        System.out.println("M = "+M);
        System.out.println("L = "+L);
        System.out.println("VL = "+VL);
	}

}

