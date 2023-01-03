# newDiction = {1:10, 'a':'test','check':True}
# #딕셔너리에서 key값들만 가져오기
# keys = list(newDiction.keys())
# #딕셔너리에서 value값들만 가져오기
# values = list(newDiction.values())
# #딕셔너리에서 key:value 한쌍씩 가져오기
# items = list(newDiction.items())
#
# print(keys)
# print(values)
# print(items)

# in 연산자는 dictionary 에선 key 값을 찾아서 결과 알려줌
# value = newDiction.pop('a')
# print(value)
# result = 10 in newDiction
# print(result)

# result = newDiction['a']
# print('result: ',result)
# # 'a' key값에 해당하는 value인 'test' 가 3으로 변경됨
# newDiction['a'] = 3
# print('result: ',newDiction['a'])
# newDiction[False] = 'new'
# print('result" ', newDiction['a'])
# print(newDiction[False])

# # 문제1
# china = {'금요일':"유산슬", '토요일':"유산슬", '일요일':"팔보채"}
#
# print(f'금요일:{china["금요일"]}')
# print(f'토요일:{china["토요일"]}')
# print(f'일요일:{china["일요일"]}')
#
# #문제2
# country = {"한국":"서울", "중국":"북경", "일본":"도쿄"}
# country_name = input('국가 이름을 입력하세요: ')
# print(f'수도 이름은 {country[country_name]}입니다')

# #참조(reference)
# s1 = 'test'
# s2 = 'test'
# print(id(s1))
# print(id(s2))

# if 1 > 1:
#     print('참입니다')
# else:
#     print('거짓입니다')
# if 12 > 3:
#     print('t')
# else:
#     print('za')

# id = 'python'
# pw = 't1234'
#
# in_id = input('아이디를 입력하세요 >> ')
# #기존에 설정해놓은 id(python)와 입력한 id(in_id)가 같은가?
# if id == in_id:
#     print('id가 일치합니다')
#     in_pw = input('패스워드를 입력하세요 >> ')
#     # 기존에 설정해놓은 pw(t1234)와 입력한 pw(in_pw)가 같은가?
#     if pw == in_pw:
#         print('pw가 일치합니다')
#         print('로그인 성공~ ')
#     else:
#         print('pw가 일치하지 않습니다!')
# else:
#     print('id가 일치하지 않습니다!')

# if False:
#     print('test')
# elif False:
#     print('test2')
# elif False:
#     print('test3')
# else:
#     print('test4')

# age = int(input('나이를 입력하세요 >> '))
# if age <= 7:
#     print('미취학')
# elif age <= 13:
#     print('초등학생')
# elif age <= 16:
#     print('중학생')
# elif age <= 19:
#     print('고등학생')
# else:
#     print('성인')

# #딕셔너리를 사용하는 경우엔 if문과 같이 사용
# diction = {1: 'test'}
# if 2 in diction:
#     print(diction[2])

# 문제1
int1 = int(input('정수1 입력: '))
int2 = int(input('정수2 입력: '))
int3 = int(input('정수3 입력: '))
if int1 > int2 and int1 > int3:
    print(f'가장 큰 수는 {int1} 입니다.')
elif int2 > int1 and int2 > int3:
    print(f'가장 큰 수는 {int2} 입니다.')

# # 문제2
# int1 = int(input('임의의 정수를 입력하세요 >>> '))
# if int1 % 3 ==0:
#     print(f'{int1}은 3의 배수가 아닙니다.')
# else:
#     print(f'{int1}은 3의 배수입니다.')

# # 문제3
# 국어 = int(input('국어 점수를 입력하세요 >>> '))
# 수학 = int(input('수학 점수를 입력하세요 >>> '))
# 영어 = int(input('영어 점수를 입력하세요 >>> '))
#
# 평균 = (국어 + 수학 + 영어) / 3
# 등급 = ""
#
# if 평균 >= 80:
#     등급 = 'A'
# elif 평균 >= 50:
#     등급 = 'B'
# elif 평균 >= 30:
#     등급 = 'C'
# else:
#     등급 = 'D'
# print(f'등급은 {등급}입니다')