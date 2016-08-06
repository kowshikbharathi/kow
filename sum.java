# kow
package assign;

public class trail {
	public static void main(String[] args) {
		int a[]=new int[]{1,2,3};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length-i;j++)
		{
			sum=sum+a[i];
		}
		}
		System.out.println(sum);
				
		}
}
