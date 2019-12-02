import java.util.Scanner;

public class P7_1 {

	private static Scanner a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int stuNum = a.nextInt();//输入学生人数
        int[] score = new int[100];
        System.out.print("Enter " + stuNum + " scores:");
        int maxs = -1;
        for(int i=0;i<stuNum;i++) {
        	score[i] = a.nextInt();//输入学生分数
        	maxs = Math.max(score[i], maxs);//求出最大值，然后赋给maxs
        }
        for(int i=0;i<stuNum;i++){
        	System.out.print("Student " + i + " score is " + score[i] + " and grade is ");
        	cmd(score[i],maxs);//调用cmd方法
        	System.out.println();
        }
        }      
        public static void cmd(int n,int maxs){
        char bp = 'y';          
    	if(n>=maxs-10)
        	bp = 'A';
        else if(n>=maxs-20&&n<maxs-10)
        	bp = 'B';
        else if(n>=maxs-30&&n<maxs-20) 
        	bp = 'C';
        else if(n>=maxs-40&&n<maxs-30)
        	bp = 'D';
        else
        	bp = 'F';
    	System.out.print(bp);//通过cmd方法判断学生成绩等级；
        }
 }

