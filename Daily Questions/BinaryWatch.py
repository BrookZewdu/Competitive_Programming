class Solution:
    def readBinaryWatch(self, turnedOn: int) -> List[str]:
        if turnedOn > 8:
            return []
        if turnedOn == 0:
            return ['0:00']
        
        hrs = 0
        minutes = 0
        ans = set()
        self.hrsBackTrack(ans, turnedOn, hrs, minutes)
        self.minBackTrack(ans, turnedOn, hrs, minutes)
        return ans
    def minBackTrack(self, ans, k, hrs, minutes):
        if k == -1 or minutes > 59 or hrs > 11:
            return
        if k == 0:
            sHrs = str(hrs)
            sMins = str(minutes)
            if minutes < 10:
                sMins = '0' + sMins
            ans.add(sHrs + ':' + sMins)
            return

        for shift in range(6):
            if not minutes & 1 << shift:
                minutes |= 1 << shift
                self.minBackTrack(ans, k - 1, hrs, minutes)
                self.hrsBackTrack(ans, k - 1, hrs, minutes)
                minutes &= ~(1 << shift)
                # self.minBacktrack(ans, k - 1, hrs, minutes)
    def hrsBackTrack(self, ans, k, hrs, minutes):
        if k == -1 or hrs > 11 or minutes > 59:
            return
        # print(hrs)
        # print('k')
        if k == 0:
            sHrs = str(hrs)
            sMins = str(minutes)
            if minutes < 10:
                sMins = '0' + sMins
            ans.add(sHrs + ':' + sMins)
            return 

        for shift in range(4):
            if not hrs & 1 << shift:
                hrs |= 1 << shift
                self.hrsBackTrack(ans, k - 1, hrs, minutes)
                self.minBackTrack(ans, k - 1, hrs, minutes)
                hrs &= ~(1 << shift)
        