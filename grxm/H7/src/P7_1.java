import java.util.Scanner;

public class P7_1 {

	private static Scanner a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int stuNum = a.nextInt();//����ѧ������
        int[] score = new int[100];
        System.out.print("Enter " + stuNum + " scores:");
        int maxs = -1;
        for(int i=0;i<stuNum;i++) {
        	score[i] = a.nextInt();//����ѧ������
        	maxs = Math.max(score[i], maxs);//������ֵ��Ȼ�󸳸�maxs
        }
        for(int i=0;i<stuNum;i++){
        	System.out.print("Student " + i + " score is " + score[i] + " and grade is ");
        	cmd(score[i],maxs);//����cmd����
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
    	System.out.print(bp);//ͨ��cmd�����ж�ѧ���ɼ��ȼ���
        }
 }
