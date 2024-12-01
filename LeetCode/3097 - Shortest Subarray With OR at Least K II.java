class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if(k==0) {
            return 1;
        }

        int minLen=Integer.MAX_VALUE;
        int n=nums.length;


        int[] bit32=new int[32];
        bitFunc(bit32, nums[0], '+');
        int num=nums[0]; 
        int cnt=0;
        int i=0, j=0;

        while(i<=j && i<n && j<n){            
            if( num >= k ){
                cnt=j-i+1;
                minLen=Math.min(minLen, cnt);
                bitFunc(bit32, nums[i], '-'); 
                num=bitToDec(bit32);
                i++;                
            }
            else{
                j++;
                if(j<n){
                    num |= nums[j];
                    bitFunc(bit32, nums[j], '+'); 
                }
            }            
        }

        return minLen==Integer.MAX_VALUE?-1:minLen;
    }


    void bitFunc(int[] bit32, int num, char op){
        int m=0;
        int val=0;
        if(op=='+'){
            while(num>0){        
                bit32[m++] += num%2;
                num /= 2;
            }
        }
        else if(op=='-'){
            while(num>0){                  
                bit32[m++] -= num%2;                 
                num /= 2;                                    
            }          
        }
    }


    int bitToDec(int[] bit32){
        int num=0;
        for(int i=0; i<32; i++){   
            if(bit32[i]>0){      
                num = num|(1<<i);         
            }               
        }
        return num;
    }    


}