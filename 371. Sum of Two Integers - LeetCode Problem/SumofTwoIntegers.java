class Solution {
    public int getSum(int a, int b) {
        int carry = 0;
        
        int ans = 0;
        int i = 0;
        for(int j = 31; j >= 0; j--) {
            int firstBit = (a & (1 << i)) == 0 ? 0 : 1;
            int secondBit = (b & (1 << i)) == 0 ? 0 : 1;

            int setBit = firstBit ^ secondBit ^ carry;
            carry = (firstBit & secondBit) | (firstBit & carry) | (secondBit & carry);
            if (setBit != 0)
                ans |= (1 << i);
            
            if (carry != 0)
                carry = 1;
            i++;
        }
        return ans;
    }
}
/*
1
-3
500
1000
500
500
1000
1000
-1000
-1000
*/
/*
1
2
2
3
-1
1
1000
1000
-1000
-1000*/