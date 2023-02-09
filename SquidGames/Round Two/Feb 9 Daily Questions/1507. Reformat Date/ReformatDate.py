class Solution:
    def reformatDate(self, date: str) -> str:
        month = {
            "Jan" : '01', 
            "Feb" : '02', 
            "Mar" : '03',
            "Apr": '04', 
            "May" : '05', 
            "Jun" : '06',
            "Jul" : '07', 
            "Aug" : '08', 
            "Sep" : '09', 
            "Oct" : '10', 
            "Nov" : '11', 
            "Dec" : '12'
        }

        s = ''
        s += date[-4:] + '-' + month[date[-8:-5]]

        hold = date[0:-11]
        if len(hold) == 1:
            hold = '0' + hold
            
        s += '-' + hold
        return s

        