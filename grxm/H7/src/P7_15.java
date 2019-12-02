import java.util.Scanner;

public class P7_15 {
    private static final int[] Null = null;
	private static Scanner a;
	public static void main(String[] args) {
		int[] ppt = new int[10];
		a = new Scanner(System.in);
	System.out.print("Enter ten numbers:");
    for(int i=0;i<10;i++) {
    	ppt[i] = a.nextInt();
    }
    System.out.print("The distinct numbers are:");
    eliminateDuplicates(ppt);
	}
	public static int[] eliminateDuplicates(int[] list){
		int[] list1 =new int[list.length];
		list1[0] = list[0];
		int index = 1;
		for(int i=1,len= list.length;i<len;i++) {
			int j = 0;
			for(;j<index;j++) {
				if(list1[j]==list[i]) {
					break;
				}
			}
			if(j==index) {
				list1[index++] = list[i];
			}
		}
		list = list1;
		for(int i=0;i<index;i++)
           System.out.print(list[i]+" ");
		return Null;
//		int w = list.length;
//		for(int i=0;i<w-1;i++) {
//			for(int j=i+1;j<w;) {
//				if(list[i]==list[j]) {
//					for(int m=j;m<w-1;m++) {
//						list[m]=list[m+1];
//					}
//					w--;
//				}
//				else {
//					j++;
//				}
//			}
//		}
//		for(int i=0;i<list.length;i++)
//			System.out.print(list[i]+" ");
//		return list;
//		ArrayList<int[]> list1 = new ArrayList<int[]>();
//		for(int i=0;i<list.length;i++) {
//			if(!list1.contains(list[i])) {
//				list1.add(list[i]);
//			}
//		}
//		int[] newlist = list1.);
//		for(int i=1;i<10;i++) {
//			System.out.print(newlist[i]+" ");
//		}
	}
}
	
