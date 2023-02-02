class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        letter_logs = []
        digit_logs = []

        for log in logs:
            hold = log.split(" ")
            if not hold[1].isdigit():
                letter_logs.append((' '.join(hold[1:]), hold[0]))
            else:
                digit_logs.append(' '.join(hold))

        letter_logs.sort()
        for i in range(len(letter_logs)):
            letter_logs[i] = letter_logs[i][1] + " " + letter_logs[i][0]
            
        ans = letter_logs + digit_logs

        return ans
        
        