## random 모듈
# import random
#
# l = [1, 10, 2, 5, 7]
#
# randNum = random.randint(1,10)
# randNum = random.choice(l)
#
# randlist = random.sample(range(1, 50000), 6)
# random.shuffle(l)
# print(l)

## calendar 달력 모듈

# import calendar #내장모듈
#
# index = calendar.weekday(2022, 6, 15) # 2는 수요일
# # 0:월 1:화 2:수 3:목 4:금 5:토 6:일
# print(calendar.weekheader(3))
# weekends = calendar.weekheader(3)
# print(weekends.split(' ')[index])

# ## time 시간
# import  time
#
# 경과시간 = time.time()
# 문자 = time.ctime(경과시간)
# print(문자)
#
# starTime = time.time()
#
# for x in range(10000):
#     print(x)
#     time.sleep(10)
#
# endTime = time.time()
# print(f'경과된 시간: {endTime - starTime}초')

## 실전문제

# import calendar ## 방법 1
#
# def solution(a, b): #코드 작성하는 곳
#     요일 = calendar.weekday(2016, a, b)
#     요일list = calendar.weekheader(3).split(' ')
#     return 요일list[calendar.weekday(2016, a, b)]
#
# #a에 5, b에 24 입력 시,
# #2016년 5월 24일: TUE
# #가 나와야 합니다.
#
# a = int(input('달 입력 >> '))
# b = int(input('일 입력 >>'))
# print(f'2016년 {a}월 {b}일: {solution(a, b)}')


# import datetime ## 방법2
#
# def solution(a, b): #코드 작성하는 곳
#     weekend = ['Mon','Tue', 'Wed', 'Thd', 'Fri', 'Sat', 'Sun']
#     요일 = datetime.date(2016, a, b).isoweekday()
#     return  weekend[요일 -1]
# #a에 5, b에 24 입력 시,
# #2016년 5월 24일: TUE
# #가 나와야 합니다.
#
# a = int(input('달 입력 >> '))
# b = int(input('일 입력 >>'))
# print(f'2016년 {a}월 {b}일: {solution(a, b)}')