
// parse() to convert string to date
date = new Date().parse('yyyy/MM/dd', '1973/07/09')

// use [] or getAt to get a specific field
assert 1973 == date[Calendar.YEAR]
assert 6 == date[Calendar.MONTH] // pay attention! we are not checking for 7 but one less
assert 9 == date.getAt(Calendar.DATE)

nextDate = date.clone()
previousDate = date.clone()

// Lets add and subtract days
nextDay = date + 1 // Or date.plus(1)
previousDay = date - 1 // Or date.minus(1)

assert nextDay == ++nextDate
assert previousDay == --previousDate


def indianTimezone = TimeZone.getTimeZone("Asia/Kolkata")
def australianTimezone = TimeZone.getTimeZone('Australia/Canberra')

def cal = Calendar.instance
cal.set(year: 2021, month: Calendar.OCTOBER, date: 20, hourOfDay: 12, minute: 30 )

def date = cal.time
def dateFormat = 'yyyy/MM/dd HH:mm'

println "Indian Time: ${date.format(dateFormat, indianTimezone)}"
println "Australian Time: ${date.format(dateFormat, australianTimezone)}"

assert date.format(dateFormat, indianTimezone) == '2021/10/20 12:30'
assert date.format(dateFormat, australianTimezone) == '2021/10/20 18:00'

println "All Good!"