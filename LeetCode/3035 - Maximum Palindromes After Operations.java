class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        int[] len = new int[words.length];
        int[] freq = new int[26];
        for(int i =0;i<words.length;i++){
            len[i] = words[i].length();
            for(int j = 0;j<words[i].length();j++){
                freq[words[i].charAt(j)-'a']++;
            }
        }
        int even = 0;  
        int odds =0;  
        int ans =0;
        Arrays.sort(len);
        for(int i =0;i<freq.length;i++){
            if(freq[i]%2!=0){
                odds++;
                freq[i]--;
            }
            even += freq[i]/2;
        }
         
        for(int i =0;i<len.length;i++){
            if(len[i]%2!=0 && odds >0){
                odds--;
                len[i]--;
            }
            else if(len[i]%2!=0 && even>0){
                even--;
                odds++;
                len[i]--;
            }
            if(len[i]%2==0 && even >= (len[i]/2)){
                even -=(len[i]/2);
                len[i] = 0;
                
            }
            if(even < (len[i]/2)){
                break;
            }
            ans++;
        }
        return ans;
    }
}