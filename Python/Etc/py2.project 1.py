## 예외처리

# try:
#     a = int(input('숫자 1 입력 >> '))
#     b = int(input('숫자 2 입력 >> '))
#     print(a, b)
#     print(f'나누기 결과 = {a / b}')
# except ValueError as e: # 먼저 에러를 검사 / ValueError == e
#     print('Error: 정수만 입력 가능') #except 에서 계속 진행됨.
#     print(e)
# except ZeroDivisionError as e: # except ValueError 를 검사 한 후 해당 되는 것이 없을 때 이어서 검사
#                                # ZeroDivisionError == e
#     print('Error: 0으로는 나누기 불가능')
#     print(e)
# except Exception as e: # ValueError 와 ZeroDivisionError 가 아닌 다른 에러
#     print('다른 에러')
# else: # 에러가 발생 하지 않았을 때 실행
#     print('제대로 나눴습니다')
# finally: # 에러와 관계 없이 무조건 실행
#     print('프로그램 끝')

## 강제로 예외처리

# try:
#     raise Exception('강제 예외')
#
# except ValueError as e:
#     print(e)

## 사용자 예외 클래스 : Exception class 를 상속받으면 됨.

# #Exception 클래스를 상속받은 HourError 클래스
# class HourError(Exception):
#     def __init__(self, mesage):
#         super().__init__(mesage)
#
#
# try:
#     hour = 30 #시간 입력
#     if hour < 0 or hour > 23: #시간은 0~23만 입력 가능함
#         raise HourError('잘못된 시 입니다') #HourError 객체 발생
# except HourError as e: #HourError 클래스의 예외 처리
#     print(e) #예외 메시지 출력

## 예제 1

# class Quiz:
#     #클래스 변수
#     answer = ['a', 'b', 'c', 'd', 'e'] # 리스트 안에 값이 1개라도 있으면 True / 0개면 False
#
#     @classmethod
#     def challenge(cls):
#         if not cls.answer: # 전부 맞춰서 요소가 없을 경우
#             print('성공입니다')
#         else: # list안에 요소가 남아 있을 경우
#             s = input('입력하세요 >> ')
#             if s in cls.answer: # 맞았을 경우
#                 print('정답입니다')
#                 cls.answer.remove(s)
#                 print(f'answer: {Quiz.answer} ')
#                 Quiz.challenge()
#             else: # 틀렸을 경우
#                 raise Exception('틀렸습니다') # 틀렸을 때는 예외를 발생시킨다
#
# challenge = Quiz()
#
# try:
#     print('5개의 모든 알파벳을 맞히는 퀴즈입니다. 하나씩 대답하세요.')
#     Quiz.challenge()
# except Exception as e:
#     print(e) # '틀렸습니다' 를 출력













