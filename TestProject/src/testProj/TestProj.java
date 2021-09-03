package testProj;

public class TestProj {

public static void main(String[] args) {
		
		//String input="Welcome";
		int num=1984222;
		sumofdigits(num);
		//char c=(char)num; 
		//System.out.println(c);  
		
	}
	public static void sumofdigits(int num)
	{
		String number=String.valueOf(num);
		String[] arr=number.split("");
		int temp=0;
		if(arr.length>1) { //[4]	

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			temp+=Integer.parseInt(arr[i]);			
		}
		System.out.println(temp);
		sumofdigits(temp);
		//System.out.println("Final Op: "+temp);
		}
	}
}
