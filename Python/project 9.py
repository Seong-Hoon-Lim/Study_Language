###인스턴스 변수/인스턴스 메소드
# -> self 키워드가 붙음
# -> 객체를 생성해야 사용 가능
# -> (객체,변수), (객체.메소드)로 사용
# -> 해당 클래스의 객체마다 다른 값을 가질 수 있음
#
# 클래스 변수/클래스 메소드
# -> 클래스 메소드:cls 키워드가 붙는다
# -> 클래스 변수: 클래스 내에 존재 (메소드 안에 존재x)
# -> cls와 함께 사용 or 클래스 이름으로 사용
# ex) cls.변수, cls.메소드, 클래스명.변수, 클래스명.메소드
# -> 객체를 생성하지 않아도 사용가능. 기본적으로 객체이름으로 사용하지 않음
# -> 해당 클래스의 모든 객체가 동일한 값을 가짐
# -> 클래스 메소드 내부에서는 self키워드가 붙은 인스턴스 메소드, 인스턴스 변수 사용 불가능.
#      사용하고 싶으면 클래스 메소드 내부에서 객체를 생성하고 사용해야 함.



##class Fruit:
#     price = 1500
#
#     def __init__(self, name):
#         print('생성자 실행')
#         self.name = name
#
#     def __del__(self):
#         print('소멸자 실행')
#
#     @classmethod
#     def sell(cls):
#         print('팔기')
#
# apple = Fruit('사과')
# watermelon = Fruit('수박')
# Fruit.price = 2000
# print(watermelon.price)
# apple.sell()
# Fruit.sell()

# ## 예문
# class Fruit:
#     price = 1500
#
#     @staticmethod
#     def print():
#         print(Fruit.price)
#         print('출력합니다')
#
#     def __init__(self, name):
#         print('생성자 실행')
#         self.name = name
#
#     def __del__(self):
#         print('소멸자 실행')
#
#     @classmethod
#     def sell(cls):
#         print('팔기')
#
# # apple = Fruit('사과')
# # watermelon = Fruit('수박')
# # Fruit.price = 2000
# # print(watermelon.price)
# # apple.sell()
# # Fruit.sell()
# Fruit.print()

# ## 실습문제 1
#
# class Person:
#     count = 0 #Person 클래스로 생성된 사람의 숫자를 세는 변수
#
#     def __init__(self, name):
#         self.name = name
#         print(f'{name} is born')
#         Person.count += 1 #사람 1명 증가
#
#     def __del__(self):
#         Person.count -= 1 #사람 1명 감소
#         print(f'{self.name} is dead')
#
#     @classmethod
#     def get_population(cls):
#         return cls.count
#
#
# man = Person('james')
# woman = Person('emily')
# # console:
# # james is born
# # emily is born
# print(f'전체 인구 수: {Person.get_population()}명')
# # 전체 인구 수: 2명
# del man
# print(f'전체 인구 수: {Person.get_population()}명')
# # concole:
# # james is dead
# # 전체 인구 수: 1명

## 실습문제 2

class Shop:
    total = 0 # 전체 매출액
    menu_list = {'떡볶이':3000, '순대':3000, '튀김':500, '김밥':2000}

    @classmethod
    def sales(cls, menu, price):
        cls.total += cls.menu_list[menu] * price

Shop.sales('떡볶이', 1)
Shop.sales('김밥', 2)
Shop.sales('튀김', 5)

print(f'매출 {Shop.total}원')



## 클래스와 객체 심화 (상속)
#
# class Person:
#     def __init__(self, name):
#         self.name = name
#
#     def eat(self, food):
#         print(f'{self.name}이(가) {food}를 먹습니다')
#
#
# class Student(Person):
#     def __init__(self, name, school):
#         super().__init__(name)
#         self.school = school
#
#     def study(self):
#         print(f'{self.name}은(는) {self.school} 에서 공부합니다')
#
# potter = Student('해리포터', '호그와트')
# potter.eat('젤리')
# potter.study()

# class Animal:
#     def run(self):
#         print('달리기')
#
# class Lion(Animal):
#     def bite(self):
#         print('물기')
#
#     def run(self):
#         super().run()
#         print('빨리 달리기')
#
# lion1 = Lion()
# lion1.run()

## 실습문제 (홈워크)

## 파이썬의 규칙

# class A:
#     def __init__(self):
#         self.a = 10
#     def private_method(self):
#         print('PUBLIC')
#
# class B:
#     def __init__(self):
#         self.b = 10
#     def _private_method(self): # class B 안에서만 사용하고, 다른 class 에서는 사용하지 말라는 의미
#         print('PRIVATE')
#
# new_A = A()
# print(new_A.a)
# new_A.private_method()
#
# new_B = B()
# print(new_B.b)
# new_B._private_method()


# for _ in range(10): #_는 의미가 없다.
#     print('test')
#
# l = ['a' for _ in range(10)] # _는 의미가 없다.
# print(l)

# map() 내장함수
# l = [1, 10, 100, 1000]
#
# result = list(map(str, l))
# print(result)

# def test(number):
#     return number + 5
#
# result = list(map(test, l)) # test 함수를 l 이라는 각 요소를 실행해서 리턴 받는다.
# print(result)

# for index, value in enumerate(l):
#     l[index] = test(value)
#
# print(l)

## lamda 표현식 -> 일회용 함수를 만든다

# def plus(x):
#     return x + 10

# ## map()함수 와 lamda 함수 혼용 사용
# result = list(map(lambda x,y : x+y, [1, 2, 3], [4, 5, 6]))
# #lambda x : x + 10 라는 함수를 만들고 사용하면 종료
# print(result)

# result = plus(5)
# print(result)















































