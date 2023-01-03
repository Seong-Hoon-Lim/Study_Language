# n = 1
# while True >= 10:
#     print(n)
#     n += 1 #n = n + 1
#
# print('프로그램 끝')
#
# s = input('문자를 입력하세요 >> ')
#
# while s != 'a':
#     print('입력한 문자는 a가 아닙니다')
#     s = input('문자를 재입력하세요 >> ')
#
# print('a를 입력하셨습니다')

# code = ''
# #code가 'A'*5가 아니면 실행하세요
# while code != 'AAAAA':
#     #code에 'A'를 더한다(이어붙인다)
#     code += 'A'
#     print(f'현재 code: {code}')

# #전역변수 (global variable)
# i = 0
# while i < 10:
#     j = 0 #지역변수 (local variable)
#     while j < 10:
#         print(f'i = {i}, j = {j}')
#         j += 1
#     #두번째 while 종료 후
#     j = 0
#     i += 1

# import time
#
# hour = 0 #시
# while hour < 24: #시가 60미만이면 돌리세요
#     min = 0 #초
#     while min < 60: #분이 60미만이면 돌리세요
#         sec = 0 #초
#         while sec < 60: #초가 60미만이면 돌리세요
#             print(f'{hour}시 {min}분 {sec}초')
#             time.sleep(1)
#             sec += 1 #1초 증가
#         min += 1 #1분 증가
#     hour += 1 #1시간 증가

# # 1번
# multiple = 1
# while multiple <= 9:
#     dan = 2 #단수
#     while dan <= 9: #단수가 9이하일 때 돌린다
#         print(f'{dan}x{multiple}={dan*multiple}', end='\t')
#         dan += 1
#     print() #줄바꿈
#     multiple += 1

# # 2번
# number = 1
# count = 0 #3의 배수가 나왔을 때 세는 카운트
# while number < 100:
#     if number % 3 == 0: #number가 3의 배수인가?
#         print(number, end='\t')
#         count += 1
#         if count == 5: #3의 배수를 5개 찾았다면?
#             print() #줄바꿈한다
#             count = 0 #count를 다시 0으로 돌린다
#     number += 1

# new_list = [1.2, 4, 56]
# for x in 'new_list':
#     print(x, end='')
# print()
# print('프로그램 끝')
# #

# 비밀번호 = input('비밀번호를 입력하세요 >> ')
# 문자체크 = False
# 숫자체크 = False
#
# for c in 비밀번호:
#     if c.isnumeric(): #문자인데 숫자형이냐?
#         숫자체크 = True
#     elif c.isalpha(): #문자형이냐?
#         문자체크 = True
# #모든 문자를 체크한 후
# if 숫자체크 and 문자체크:
#     print('가능한 비밀번호입니다')
# else:
#     print('불가능한 비밀번호입니다')
#
# a = []
# start = 1
# while start <= 100:
#     a.append(start)
#     start += 1
#
# print(a)

#
# result = [x+10 if x % 2 == 0 else x for x in range(10)]
# print(result)

# a = [['a', 'b', 'c'], [1, 2, 3]]
# row_index = 0
# while row_index < len(a):
#     col_index = 0
#     while col_index < len(a[row_index]):
#         print(a[row_index][col_index])
#         col_index += 1
#     row_index += 1

# a = [['a', 'b', 'c'], [1, 2, 3]]
# for x in a:
#     print(f'x: {x}')
#     for y in x:
#         print(f'y: {y}')

# diction = {'사과':1000, '배':2000, '수박':20000}
# #딕셔너리를 for문 돌리면 key값을 가져옴
# for key in diction:
#     print(f'key: {key}, value: {diction[key]}')
#
# keys = diction.keys() #key값만 가져옴
# values = diction.values() #value값만 가져옴
# items = diction.items() #둘 다 가져옴 (튜플의 형태로)
#
# for item in items:
#     for x in item:
#         print(x)

# 구구단 출력
# gugu = int(input('출력할 구구단 입력 >>> '))

# for gugu in range(2, 10):
#     for number in range(1, 10):
#         print(f'{gugu} x {number} = {gugu * number} ')

## break 문
# for x in range(11321, 13121):
#     if x % 3 == 0:
#         break
#     print(x)
# print('종료')

## continue문
# n = 1
# while n < 10:
#     if n % 2 == 0:
#         n += 1
#         continue
#     print(n)
#     n += 1

# for x in range(10):
#     if x % 2 == 0:
#         continue
#     print(x)

# 1번
# n = int(input('가로 개수 입력 >> '))
# m = int(input('세로 개수 입력 >> '))

# for y in range(m): #세로만큼 반복
#     for x in range(n): #가로만큼 반복
#         print('*', end='')
#     print() #가로만큼 다 찍었으면 줄바꿈

# print(('*' * n) + '\n'* m)

# for x in range(m):
#     print('*' * n) # 파이썬에서만 가능

# total = 1 #합을 저장하는 변수  ## 반복문 내부 모든 수를 곱할 때
# for x in range(1,11):
#     total *= x #total = total + x
# print(total)

# # 2번

# n = int(input('n을 입력하세요 >> '))
# total = 0 #합을 저장하는 변수
# for nember in range(1, n + 1):
#     if n % nember == 0: #약수 구함
#         #지금까지의 합에 nember (약수)를 더한다
#         total += nember #total = total + nember
#
# print(n, '의 약수의 합계는: ', total)

# n = int(input('정수n 입력: '))
# result = sum([fi or i in range(1, n+1) if n%i == 0])
# print(result)
#


# # #3번
# arr = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
# total = 0
# for x in arr:
#     for y in x:
#         total += y
# print(total)

# arr1 = sum(arr, [])
# arr = sum(arr1)
# print(f'모든 요소의 합 = {arr}')
#

# #4번
# import random #랜덤기능을 추가
# randomCount = 3 #랜덤 숫자 개수
# lifeCount = 3 #맞출 수 있는 횟수
# aliveFlag = True #살았냐 죽었냐 판단하는 변수 (살아있다 = Flase)
#
# randomList = [] #생성된 랜덤 숫자들을 저장하는 리스트
# while len(randomList) != randomCount: #번 반복하면서 랜덤 숫자 생성 및 리스트 추가
#     randomNumber = random.randint(1, 5) #1~5까지의 랜덤 숫자 생성
#     if randomNumber not in randomList: #리스트 안에 그 숫자가 들어있지 않으면
#         randomList.append(randomNumber) #리스트에 추가
# print(randomList)
#
# for index in range(len(randomList)): #리스트의 랜덤 숫자 개수만큼 진행
#     for count in range(lifeCount): #맞출 수 있는 횟수만큼 진행
#         userNumber = int(input('맞출 숫자를 입력하세요 >> '))
#         if userNumber == randomList[index]: #입력한 숫자와 리스트의 숫자를 비교
#             print('맞았습니다')
#             break
#         elif count == lifeCount - 1: #마지막 시도인가?
#             aliveFlag = False #죽었다고 판단
#         else:
#             print(f'틀렸습니다. 다시 입력하세요.. 남은 기회 = {lifeCount- count -1}번')
#     if aliveFlag:
#         if index == len(randomList) - 1: #마지막 숫자였냐?
#             print('성공!')
#         else:
#             print('다음 숫자로 갑니다.. ')
#     else: #aliveFlag가 False == 죽었다
#         print('실패!')
#         break

# randomList = [] #생성된 랜덤 숫자들을 저장하는 리스트
# for x in range(3): #번 반복하면서 랜덤 숫자 생성 및 리스트 추가
#     randomNumber = random.randint(1, 5) #1~5까지의 랜덤 숫자 생성
#     randomList.append(randomNumber) #리스트에 추가

# print(randomList)



