class Solution:
    def numberToWords(self, num: int) -> str:
        if num == 0:
            return 'Zero'
        twos = {
            10 : 'Ten', 11 : 'Eleven',
            2 : 'Twenty', 12 : 'Twelve',
            3 : 'Thirty', 13 : 'Thirteen',
            4 : 'Forty', 14 : 'Fourteen',
            5 : 'Fifty', 15 : 'Fifteen',
            6 : 'Sixty', 16 : 'Sixteen',
            7 : 'Seventy', 17 : 'Seventeen',
            8 : 'Eighty', 18 : 'Eighteen',
            9 : 'Ninety', 19 : 'Nineteen'

        }
        ones = {
            1 : "One",
            2 : 'Two',
            3 : 'Three',
            4: 'Four',
            5 : 'Five',
            6 : 'Six',
            7 : 'Seven',
            8 : 'Eight',
            9 : 'Nine'
        }

        def recursion(curr):
            if curr == 0:
                return '' 
            if len(str(curr)) == 3:
                hold = curr // 100
                return ones[hold] + ' Hundred ' + recursion(curr % 100)
            elif len(str(curr)) == 2:
                hold = curr // 10
                if hold == 1:
                    return twos[curr]
                return twos[hold] + ' ' + recursion(curr % 10)
            else:
                return ones[curr]

        divisor = 9
        arr = ['', 'Thousand ', 'Million ', 'Billion ']
        ans = ''
        while num > 0:
            hold = num // (10 ** divisor)
            if hold:
                ans += recursion(hold).strip() + ' ' + arr[divisor // 3]
            num %= 10 ** divisor
            divisor -= 3
            
        return ans.strip()
        