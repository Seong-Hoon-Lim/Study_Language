## 파일 입출력
# import sys
# from io import StringIO # io 모듈로 부터 StringIO 를 가져온다
#
# file = open('testFile.txt', 'w')
#
# 표준출력 = sys.stdout
# # file로 표준 출력 변경
#
# instance = sys.stdout = StringIO()
#
# print('헤헤')
# print('언제 마치나~')
# print('python 완전 재밌다')
#
# file.close()
# # 원랟대로 되돌림
# sys.stdout = 표준출력
#
# print(instance.getvalue())

## 파일 입출력 with 문
# import sys
# from io import StringIO # io 모듈로 부터 StringIO 를 가져온다
#
# try:
#     with open('testFile.txt', 'rt') as file:
#         print('파일 열었음')
#         int(input())
# except:
#     print('에러발생')
# finally:
#     file.close()


# with open(".\\파일입출력연습\\video1.mp4.", 'rb') as original:
#     with open('.\\파일입출력연습\\copy.mp4', 'wb') as copy:
#         while True:
#             byte = original.read(1024)
#             # byte 가 빈문자열이라면 False
#             # False 의 not => True
#             # 파일의 끝에 도달하면 빈 문자열을 반환함
#
#             if not byte: # 빈 문자열을 반환받았다면
#                 break # 그만한다
#
#             copy.write(byte)


## Pickling

# import pickle # 내장모듈
# class TEST:
#     name = '사자'
#     def test(self):
#         print(TEST.name + '안녕')
#
# # people = {'name':'kim', 'age':15, 'tel':'010-1234'}
#
# #peopleData.dat 이라는 이름의 파일을 write byte 모드로 연다
# with open('peopleData.dat', 'rb') as file:
#     ########### write 부분 ################
#     # pickle.dump(TEST(), file) #people 객체를 file에 dump 뜬다
#     # file 에서 2진 데이터를 읽어서 new_people 에 저장
#     ########### load 부분 #################
#     new_people = pickle.load(file)
#     print(new_people)

## CSV 파일 읽어오기

# with open('.\\파일입출력연습\\학생 성적.csv') as csv_file:
#     # 첫줄 (이것은 각 줄의 속성. 곧 제목 라인임)을 읽어온다
#     attribute = csv_file.readline().split(',')
#     attribute[5] = attribute[5].split('\n')[0]
#     student_score_sum = 0
#     # attribute[1] => 국어
#     # attribute[2] => 영어
#     # attribute[3] => 수학
#     # 학생 한명의 정보(한 줄)을 읽어서 ,로 구분하여 리스트로 생성
#     while True:
#         line = csv_file.readline() # 한 줄 읽는다
#         if not line: # 줄을 다 읽어서 읽을것이 없다
#             break
#         information = line.split(',')
#         for index, info in enumerate(information):
#             if index == 0:
#                 print('{}의 정보입니다 >> '.format(information[0]))
#             else:
#                 print('{}: {}'.format(attribute[index], information[index]))
#
#         student_score_sum += int(information[4]) # 합계 계산
#
#     print('전체 학생의 점수 합계: {}'.format(student_score_sum))

## CSV 모듈로 CSV파일 쓰기

# import csv # 내장모듈
#
# #파일을 저장할 기본 디렉터리 설정
# path = '.\\파일입출력연습\\'
#
# with open(path + 'CSV파일쓰기.csv', 'r', newline='') as file: # newline='' 자동 줄바꿈 금지
#     csv_reader = csv.reader(file) # reader 객체 생성
#     for index, line in enumerate(csv_reader):
#         print('{}: {}'.format(index,line))

# with open(path + 'CSV파일쓰기.csv', 'w', newline='') as file: # newline='' 자동 줄바꿈 금지
#     csv_maker = csv.writer(file) #file에 쓸 객체 생성
#     # list 나 튜플 형태로 데이터를 입력
#     csv_maker.writerow([1, 'test', 123, 'python'])
#     csv_maker.writerow([2, 'java', 1414])
# print('파일이 생성되었습니다')

## 예제 1)

nation = ['그리스', '아테네',
          '독일', ' 베를린',
          '러시아', '모스크바',
          '미국', '워싱턴',
          '한국', '서울',
          '일본', '도쿄']

# 우리 프로그램하고 file 하고 연결
with open('nation.txt', 'w') as file:
    file.write('생성된 nation.txt 파일의 내용은 다음과 같습니다.\n')
    for index in range(0, len(nation), 2):
        file.write('{}-{}\n'.format(nation[index], nation[index+1]))





















