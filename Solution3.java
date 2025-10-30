class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];

        int left=0;
        int right=0;
        int size=s.length();
        int maxLength=0;

        while(right<size)
        {
            char ch = s.charAt(right);

            while(freq[ch]==1)
            {
                char ch2 = s.charAt(left);
                freq[ch2]--;
                left++;

            }

            if(freq[ch]==0)
            {
                freq[ch]++;
                maxLength=Math.max(maxLength,right-left+1);
            }

            right++;
        }

        return maxLength;

        
    }
}