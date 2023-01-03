#eval() - 수식 계산 (문자열수식). 문자열로 변수/함수도 사용가능
#enumerate() - (index, value)의 튜플 한 쌍으로 만들어줌
#len() - 요소의 개수 (길이)를 구해줌
#range() - 범위를 생성해줌
#sum(), max(), min(), round() - 합/최대/최소/반올림 구해줌
#sorted() - 정렬

# #예제
# arr = []
# for x in range(15, 86):
#     arr.append(x)
# print(f'가장 큰 값:{min(arr)}, 가장 작은 값:{max(arr)}')
# print(f'합계: {sum(arr)}')
# print(pow(arr[14], 3))

# sorted()함수 // 아스키 코드값으로 비교해서 내림차순 정렬
# arr = [1,5,4,1,6,7,5,4,1,3]
# diction = {2:"test", 1:'python'}
# new_list = sorted(diction)
# print(new_list)
#
# # enumerate()함수 // 인덱스를 튜플 형태로 추출
# Arr = ['test', '123s', 'apple','98451']
# for t in enumerate(arr):
#     print(f't: {t}')
#     print(f'index: {t[0]}')
#     print(f'value: {t[1]}')
#     print()
#
# for index, value in enumerate(Arr):
#     print(index)
#     print(value)
#     print()
#
# Arr2 = [10, 100, 1000, 10000]
#
# #zip()함수 // 튜플로 묶어서 반환
# for x in zip(Arr, Arr2):
#     print(x)

#1번
# month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
# # m = index (달)
# # n = value (일수)
# for m, d in enumerate(month):
#     print(f'{m + 1}월은 {d}일 입니다')

# #1-1번
# rainbow = ['red', 'orange', 'yellow', 'green', 'blue', 'navy', 'purple']
#unpacking
# for index, value in enumerate(rainbow):
#     print(f'무지개의 {index+1}번째 색은 {value}입니다.')


#2번

# print('점수를 입력하세요. 더 이상 입력할 점수가 없으면 음수를 아무거나 입력하세요 >> ')
# score_list = [] #입력받은 점수들을 저장해놓는 리스트
# score = int(input('점수를 입력 >> ')) #처음 점수를 입력받음
#
# while score >= 0: #0이상 값을 입력했을 경우 while진행
#     score_list.append(score) #입력받은 값을 리스트에 저장
#     score = int(input('점수를 입력 >> '))
# avg = sum(score_list) / len(score_list) #평균값 계산
# maxV = max(score_list) #최대값
# minV = min(score_list) #최소값
# print(f'평균={avg} / 최대={maxV} / 최소={minV}')

print('점수를 입력하세요. 더 이상 입력할 점수가 없으면 음수를 아무거나 입력하세요 >> ')
score = int(input('점수를 입력 >> ')) #처음 점수를 입력받음
sumValue = 0 #합계
maxValue = score #최대
minValue = score #최소
count = 0 #횟수

while score >= 0: #0이상 값을 입력했을 경우 while진행
    count += 1 #점수 개수 1 증가
    sumValue += score #합계
    if minValue > score: #최소
        minValue = score
    if maxValue < score: #최대
        maxValue = score
    score = int(input('점수를 입력 >> '))
if minValue < 0 or maxValue < 0:
    print('첫번째에 음수를 입력함')
else:
    print(f'avg={sumValue/count}, min={minValue}, max={maxValue}')

# avg = sum(score_list) / len(score_list) #평균값 계산
# maxV = max(score_list) #최대값
# minV = min(score_list) #최소값
# print(f'평균={avg} / 최대={maxV} / 최소={minV}')

# # 최대값 또는 최소값 구하는 공식
# for x in numbers:
#     if minValue > x:
#         print(minValue)