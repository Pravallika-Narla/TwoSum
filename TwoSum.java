public class TwoSum{
public  int[] twosum(int[] nums ,int targetsum)
{
	for(int i=0;i<nums.length-1;i++)
	{
		for(int j=i+1;j<nums.length-1;j++)
		{
			if(nums[i]+nums[j]==targetsum)
			{
				return new int[]{i,j};
			}
		}
	}
	throw new IllegalArgumentException("Could not find pair");
}
public static void main(String[] args) {
	TwoSum twosum=new TwoSum();
	int[] n1={1,5,8,7,2};
	int target=9;
	int[] result=twosum.twosum(n1, target);
	System.out.println(result);
}
}