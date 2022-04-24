package data_structures;



class Normal_Search {

	public static void main(String[] args) {
		Long start=System.currentTimeMillis();
		int value=999989;
		int limit=1000000;
		int count=0;
		boolean isEven=value%2==0;
		if(value>0) {
			if(isEven) {
				for(int i=2;i<limit;i=i+2) {
					if(i==value) {
						System.out.println("we found it "+count+" with these times");
						break;
					}
					count++;
				}
			}else {
				for(int i=1;i<limit;i=i+2) {
					if(i==value) {
						System.out.println("we found it "+count+" with these times");
						break;
					}
					count++;
				}
			}
		}
		Long result=System.currentTimeMillis();
		System.out.println("Total Time Taken is : "+(result-start)+" developed");

	}

}
class Binary_Search{
	public static void main(String []args) {
		long start=System.currentTimeMillis();
		int x=99_89_79_678;
		int n=1_00_00_00_000;
		
	}
}
