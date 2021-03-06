package 蓝桥杯真题;

public class 最大降雨量 {
	public static void main(String[] args) {
		/*
	        * [][][][a][][][]
	        * [][][][b][][][]
	        * [][][][c][][][]
	        * [][][][max][][][]
	        * [][][][d][][][]
	        * [][][][e][][][]
	        * [][][][f][][][]
	        * 
	        * 此题意思为将49分为7组数字，
	        * 求取七组数字中每组数字的中位数所构成的数列的中位数的最大值
	        * 即如图所示，最大化[max]
	        * 49个数字中需要比[max]大的有【max】行的后三位，d、e、f行的后四位
	        * 即结果如下
	        * */
		System.out.println(49 - (3 * 4) - 3);
	}
}
