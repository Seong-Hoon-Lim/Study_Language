# x : 조건식의 결과가 참일 때
# y : 조건식의 결과가 거짓일 때

"""result = '참' if 10 > 3 else ('t' if 10 < 3 else 'f')
print(result)"""

# number1 = int(input('숫자를 입력하세요 >> '))
# number2 = int(input('두번째 숫자를 입력하세요 >> '))
# result = number1 + number2
# print(f'계산 결과는 {result}입니다')

#캐스팅(Casting)
# """result = float(12345)
# result = int(1234.454674)
# result = str(1234) + "454"
# result = int('3454') +451
# print(result)"""

# # 1번
# garo = int(input('가로 길이를 입력하세요 >>>'))
# sero = int(input('세로 길이를 입력하세요 >>>'))
# 둘레 = (garo + sero) * 2
# 면적 = garo * sero
# print(f'직사각형의 둘레는 = {둘레}')
# print(f'직사각형의 넓이는 = {면적}')
#
# # 2번
# num1 = int(input('num1 입력 : '))
# num2 = int(input('num2 입력 : '))
# result = (num1 << 2) + num2
# print(f'결과: {result}')
#
# # 3번
# number = int(input('숫자를 입력하세요 >>> '))
# result = number % 2 == 0
# print('짝수' if result else '홀수')



# number = [10 , 20 , 30]
# # number.remove(20)
# # print(number)
#
# # number.append(40)
# # number.append(50)
# # print(number)
#
# number.pop
# print(number)

# test = [[1, 2, 3], [10, 20, 30]]
# new_list = test[1]
# print(new_list[2])

# test = [[1,[7, 8, 9], 3], [10, 20, 30]]
# list_dem = [1, 2, 3, ['a', 'b', 'c'], 4, 5]
# new_list = list_dem [3][1:]
# print(new_list)
#
# test = [10, 2, 6, 7, 4, 1]
# test.sort(reverse= True) # 내림차순 정렬
# # test.reverse()
# print(test)
# test = ['apple', 'test', 'pyuthomn', 'java']
# test.sort()
# print(test)

# # 1번
# list1 = [1, 3, 5, 4, 2]
# list1.sort() # 정렬
# list1.reverse()
# # list1.pop(0) # 0번째 index 제거
# list1.remove(5) # list 1에서 5를 하나 찾아서 삭제
# list1.append(10) # list1의 맨 마지막에 10을 추가
# print(list1)

# # 2번
# list = ['Life', 'is', 'too', 'short']
# result = list[0] + ' ' + list[1] + ' ' + list[2] + ' ' + list[3]
# print(result)

# # 3번
# # 처음만들 때 사용하는 방법
# list1 = [[1,2], [2,3]]
# list2 = [[3,4], [5,6]]
# result1 = list1[0][0] + list2[0][0]
# result2 = list1[0][1] + list2[0][1]
# result3 = list1[1][0] + list2[1][0]
# result4 = list1[1][1] + list2[1][1]
# # result = [[result1,result2], [result3,result4]]
# # print(result)

# # 이미 만들어진 빈 리스트 있을 때
# result = []
# new_list = [result1, result2] #1차원 list생성
# result.append(new_list) #1차원 list에 list추가
# new_list = [result3, result4] #1차원 list생성
# result.append(new_list)#1차원 list에 list추가
# print(result)

# # 처음부터 2차원 빈 리스트 생성
# result = [[], []]
# result[0].append(result1) #4
# result[0].append(result2) #6
# result[1].append(result3) #7
# result[1].append(result4) #9
# print(result)

#id(): 해당 데이터의 메모리 주소값을 알려줌

# test_list = [1, 2, 3]
# new_list = test_list.copy()
#
# test_list[1] = 10
#
# print(id(test_list))
# print(id(new_list))
#
# print('test = ', test_list)
# print('new = ', new_list)

# # 튜플에서 값을 추가할 때 (리스트로 형변환)
# t = (1, 2, 3)
# new_list = list(t)
# new_list.append(4)
# t = tuple(new_list)
# print(t)
#
# # 리스트에서 중복을 제거할 때 (세트로 형변환)
# l = [1,2,3, 1,2,3, 1,2,3]
# l = list(set(l)) #list에서 중복제거
# print(l)
#
# #set은 순서가 없어서 index 사용 불가능!
# s = {1, 4, 45, 451, 23}
# s.add(400)
# s.add(500)
# s.remove(45) #s.add(값) 은 print 사용불가 S값을 변형 시키는 기능
# print(s)

# string = "test"
# print(set(string))
# #집합
# s1 = {1, 2, 3} #set
# s2 = {3, 4, 5} #set
# r1 = s1 | s2 #합집합
# r2 = s1 & s2 #교집합
# r3 = s1 - s2 #차집합
# print('합집합: ', r1)
# print('교집합: ', r2)
# print('차집합: ', r3)

# # 1번
# practice = [1, 1, 1, 2, 2, 3, 3, 3, 4, 5]
# aSet = set(practice)
# b = list(aSet)
# print(b)
#
# #2번
# a = 'python coding is special'
# b = 'c labguage is difficult'
# new_set1 = set(a)
# new_set2 = set(b)
# result = new_set1 & new_set2
# result.add('!')
# print(result)

new_dict = {1:True, 'test':10, False:'python'}
new_dict[10] = 10 #딕셔너리에 새로운 데이터 쌍 생성
new_dict[1] = 3.5 #기존에 key가 존재할 시 value를 변경
value = new_dict[False] #value를 가져오는 법
print(value)
print(new_dict)