package com.dcb;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] syredball = new int[6];
    int syblueball;
    int[] usredball = new int[6];
    int usblueball;
    
    int blueball = 0;
    int countredball = 0;
    
    Random q = new Random();
    @SuppressWarnings("resource")
	Scanner a = new Scanner(System.in);
    syblueball = q.nextInt(16)+1;
    int[] redballNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
    for(int i=0;i<syredball.length;i++) {
		while(true) {
			int m = q.nextInt(33);
			if(redballNum[m] != 0) {
				syredball[i] = redballNum[m];
				redballNum[m] = 0;
				break;
			}
		}
	}
    System.out.println("双色球彩票选号购买即将开始，祝你好运!");
    System.out.println("请选择蓝色球，16选1!");
    usblueball = a.nextInt();
    System.out.println("请选择红色球，33选6!");
    for(int i=0;i<usredball.length;i++) {
    	usredball[i] = a.nextInt();
    }
    if(usblueball == syblueball) {
    	blueball = 1;
    }
    for(int i=0;i<usredball.length;i++) {
		for(int j=0;j<syredball.length;j++) {
			if(usredball[i] == syredball[j]) {
				countredball++;
				break;
			}
		}
	}
    if(blueball==1 && countredball==6) {
		System.out.println("恭喜你中了500W!");
	}else if(countredball == 6) {
		System.out.println("恭喜你中了二等奖,奖金100W");
	}else if(blueball==1 && countredball==5) {
		System.out.println("恭喜你中了三等奖,奖金3000元");
	}else if(countredball==5    || (blueball==1 && countredball==4)) {
		System.out.println("恭喜你中了四等奖,奖金200元");
	}else if(countredball==4    || (blueball==1 && countredball==3)) {
		System.out.println("恭喜你中了五等奖,奖金10元");
	}else if((blueball==1 && countredball==1) || blueball==1 || (blueball==1 && countredball==2)) {
		System.out.println("恭喜你中了六等奖,奖金5元");
	}else {
		System.out.println("很遗憾，你没中奖！");
	}
    for(int i=0;i<syredball.length-1;i++) {
		for(int j=0;j<syredball.length-1-i;j++) {
			if(syredball[j] > syredball[j+1]) {
				int tmp = syredball[j+1];
				syredball[j+1] = syredball[j];
				syredball[j] = tmp;
			}
		}
	}
	System.out.println("本期的中奖号码为：");
	System.out.print("红球号码:");
	for(int i=0;i<syredball.length;i++) {
		System.out.print(syredball[i]+"  ");
	}

	System.out.println("蓝球号码:"+syblueball);
	}

}
