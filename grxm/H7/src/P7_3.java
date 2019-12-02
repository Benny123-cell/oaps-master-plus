import java.util.Scanner;//统排思想

public class P7_3 {

	private static Scanner a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    a = new Scanner(System.in);
    System.out.print("Enter the integers between 1 and 100:");
    int[] goal = new int[1005];
    int[] doal = new int[1005];
	for(int i=0;;i++) {
		goal[i] = a.nextInt();
		if(goal[i]==0)//输入零就停止输入
			break;
		doal[goal[i]]++;
	}
	for(int i=0;i<1005;i++) {
		if(doal[i]==1)
			System.out.println(i + " occurs " + doal[i] + " times");
		else if(doal[i]>1)
			System.out.println(i + " occurs " + doal[i] + " times");
	}
}
}
