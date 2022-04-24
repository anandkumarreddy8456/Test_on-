package data_structures;



public class Array_problem {
	public int[] addElement(int []array,int posit,int value) {
		int arr2[]=new int[array.length+1];
		for(int i=0;i<posit;i++) {
			arr2[i]=array[i];
		}
		arr2[posit]=value;
		for(int i=posit+1;i<arr2.length;i++) {
			arr2[i]=array[i-1];
		}
		return arr2;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		System.out.println("Print Array Elements Before Addding Element");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Array_problem arr2=new Array_problem();
		arr=arr2.addElement(arr,4,98);
		System.out.println("Print Array Elements After Addding Element");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
