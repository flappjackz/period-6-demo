
/**
 * A place to review specific, useful Java skills.
 *
 * @author Jack Bell
 * @version 3-7-19
 */
public class SkillsReview
{
    public static void main (String [] args)
    {
        int [] nums1 = {17, 22,  43, -10, 41, -3};
        int [] nums2 = {3, 8, 19, 45, 73, 74};
        
        System.out.println(findMaxValue(nums1)); //Should print 43
        
        System.out.println(inOrder(nums1)); //false
        System.out.println(inOrder(nums2)); //true
    }
    
    public static int findMaxValue(int [] arr)
    {
        int max = 0;
        max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static boolean inOrder(int[] arr)
    {
        int value = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                value += 1;
            }
        }
        return value == 0;
    }
}
