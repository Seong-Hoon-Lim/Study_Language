# a = [12, 2, 4, 5]
# a.sort()
#함수 == 메소드 (method) == 기능 (function == 함수 == 기능)
#함수 = '.' 없이 그냥 사용 가능 - 뒤에 ()가 무조건 필요함
#메소드 = '.' 이 붙어있음 - 뒤에 ()가 무조건 필요함

# #.join()
# new_list = ['test','python','java']
# new_s = ''.join(new_list) #훨씬 더 기억공간 절약 유리하고 속도가 빠르다.
# print(new_s)

# #.split()
# test = 'this is python'
# result = test.split('is') #() 안에 공백 까지 정확한 문자열을 기재 ,
#                              # 숫자를 입력 시 나누는 횟수가 됨
# print(result)

# #기본
# s = 'one47eight'
# result1 = s.replace('one','1')
# result = result1.replace('eight','8')
# finalResult = int(result) + 10
# print(finalResult)

#
# # 난이도 up version
# string = ['onefour78','ninetwo123four','41561','threezeroone']
# for s in string:
#     result = s.replace('zero', '0')
#     result = s.replace('one', '1')
#     result = s.replace('two', '2')
#     result = s.replace('three', '3')
#     result = s.replace('four', '4')
#     result = s.replace('five', '5')
#     result = s.replace('six', '6')
#     result = s.replace('seven', '7')
#     result = s.replace('eight', '8')
#     result = s.replace('nine', '9')
#     print(int(result) + 10)

################################
# #사용자 함수
#
# # 1) 인수X , 반환값X
# def welcome():
#     print('환영합니다')
#     print('반갑습니다')
#
# welcome() #welcom함수 호출 // ()값이 없는 건 인수가 없다는 것과 같음
#           # 함수는 여러번 호출이 가능 (한번만 만들어두면, 계속 사용할 수 있음)
#
# # 2) 인수O, 반환값X
# # 인수: 호출할 때 ()안에 적는 data
# # 매개변수: 함수를 정의할 때 ()안에 적는 변수
# def welcome(name, age):
#     print(f'{name}님의 나이는 {age}입니다')
# welcome('임성훈', 15) #welcom함수 호출
# welcome('홍길동', 25) #welcom함수 호출 후 다시 돌아와서 welcom함수 호출
#
# # 3) 인수X, 반환값O
# def welcome():
#     print('실행')
#     return 1 #1을 반환한다 // return 실행하면 함수는 종료됨 == break
#     print('END')
#
# result = welcome() #welcom함수 호출 후 1 로 값이 변경된다.
# print(result)
#
# # 4) 인수O, 반환값O
# def welcome(num1, num2):
#     result = num1 + num2
#     return result
#
# result = welcome(1, 10)
# print(result)
#
# result = welcome(3, 15)
# print(result)

## 가변 매개변수

# def welcome(*num1): #num1은 가변 매개변수
#     #모든 인수를 하나의 튜플로 묶어 줌
#     print(num1)
#
# welcome(1,10,15,4,['a'],5,'test')

### 예제

# def sum_func(*num1):
#     return sum(num1)
#
# result = sum_func(1,3,4,6,2,4,4,6,4,34,43)
# print(f'합계는: {result}')

## 디폴트 매개변수

# def function(number1, number=2): #디폴트 매개변수는 반드시 매개변수 뒤에 위치
#     print(number2)
#     print(number)


#global은 immutable
#immutable = str, int, float, bool

# l = [1,2,3]
# b = 2 #전역변수. 가장 외부에 존재하며, 현재 소스파일 어디서든 사용가능
# def 함수():
#     global l
#     l = [4,5,6]
#
#     print(l)
#
# def greet(name, message = '안녕하세요'):
#     print(f'{name}님.')
#
# greet('김철수')


# #잔돈 계산기 함수 생성
# def change_calc(coffee, money):
#     # pass 일단 아무것도 안하겠다. (실행 했을 때 넘어가겠다.)
#     menu = {'아메리카노' : 1000,
#             '카페라떼' : 1500,
#             '카푸치노' : 2000}
#     #내가 입력한 coffee가 menu의 key값으로 존재하지 않는다면
#     if coffee not in menu:
#         print('Error: 선택한 메뉴는 없는 메뉴입니다')
#         return money #돈을 다시 돌려받음
#     #만약 내가 낸 돈이 메뉴의 가격보다 작다면 (돈부족)
#     if money < menu[coffee]:
#         print('Error: 돈이 부족합니다')
#         return money #낸 돈 그대로 다시 돌려받음
#     #여기까지 왔다는 것은 정상주문! - 잔돈을 계산해서 돌려준다
#     return money - menu[coffee] #낸돈 - 메뉴가격
#
#
# coffee = input('주문할 커피 종류를 입력하세요 >> ')
# money = int(input('낼 돈을 입력하세요 >> '))
# #받은잔돈 = 잔돈 계산기의 실행결과 (커피종류, 낸 돈)
# change = change_calc(coffee, money) #입력한 커피, 돈 전달
# print(f'받은 잔돈은 {change}입니다.')

# *키워드가 붙은 키워드 인수
# def test(name, age):
#     print(f'name = {name}')
#     print(f'age = {age}')
#
# data = {'name':'kim', 'age':15} # 딕셔너리 변수 갯수와 매개변수 갯수가 똑같아야 함
# test(**data)

# # ** 사용하는 가변 매개변수 생성
# def test(data1, data2, **datas):
#                         #값을 받을 때 data3 = 200 과 data4 = 300 을 딕셔너리 형태로 받음
#     print(data1)
#     print(data2)
#     print(datas)
#
# data = {'name':'kim', 'age':15, 'test':1}
# test ('test1', data2 = 100, data3 = 200, data4 = 300)

# 문제 1
# 코드 구성
# def vending_machine(money):
#
#     drink = 700
#     count = 0
#
#     while count < 5:
#         print(f'음료수 = {count}개, 잔돈 = {money}원')
#         money -= drink
#         count += 1
#
#
# vending_machine(3000)


# money = 3000
# drink = 700
# count = 0

# while count <= 4:
#     while money >= drink:
#         print(f'음료수 = {count}개, 잔돈 = {money}원')
#         money -= drink
#         count += 1
#     print(f'음료수 = {count}개, 잔돈 = {money}원')
#     break


# 문제 2
# 코드 구성
# def get_average(marks):
#     average = (marks['국어'] + marks['영어'] + marks['수학']) / 3
#     # 방법1
#     l = list(marks.values())
#     return sum(l) / len(l)
#
# marks = {'국어':90, '영어':80, '수학':85}
#
# # 방법2
# # l = list(marks.values())
# # sum_list = 0
# # for x in l:
# #     sum_list += x
# # average = sum_list / len(l)
#
# average = get_average(marks)
# print(f'평균은 {average}점입니다.')

# 문제 3

total = 0 #축의금 합계
#dict => wedding, who => 이름, money => 축의금
def gift(dict, who, money):
    #wedding 딕셔너리에 값 추가
    dict[who] = money
    #전역변수 total선언
    global total #total 이 전역변수이므로 global 를 사용
    total += money
    #total에 돈 더하기

wedding = {} #{이름:축의금} 요소를 저장해야함
gift(wedding, '영희', 5)
gift(wedding, '철수', 3)
gift(wedding, '이모', 10)

print(wedding)
print(total)




