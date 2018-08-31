package ljj.pr.str;

public class TestMaoPao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,98,69,30,20,10};
		//sortMaopao(arr);
		sortOption(arr);
		for(int m=0; m<arr.length; m++) {
			System.out.println(arr[m]);
		}
		
		int result = ErFen(arr,30);
		System.out.println("result index : "+result);
	}
	
	/*
	 * 二分法查找
	 */
	public static int ErFen(int[] arr, int target) {
		int max = arr.length;
		int min = 0;
		int mid = (max + min)/2;
		while(arr[mid]!=target) {
			if(arr[mid]>target) {
				//target在左边 最大值索引往中间值左边移动
				max = mid - 1;
			}else if (arr[mid]<target) {
				//target在中间值右边，最小值网中间值右边移动g
				min = mid + 1;
			}else {
				
			}
			if(min > max) {
				return -1;
			}
			mid = (max + min)/2;
		}
		return mid;
	}
	
	
	/*
	 * 选择排序
	 */
	public static void sortOption(int[] arr) {
		for(int i=0; i< arr.length-1; i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}
	
	
	public static void sortMaopao(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
