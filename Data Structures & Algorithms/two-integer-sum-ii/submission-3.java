class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int left = 0,target1=0;
    int right = numbers.length - 1;

    while(left<right)
    {
       target1=numbers[left]+numbers[right];

       if(target1==target)
       {
        return new int[]{left+1,right+1};
       }
       if(target1<target)
       {
        left++;
       }
       else
       {
        right--;
       }
    }

    return new int[0];
    }
    }

