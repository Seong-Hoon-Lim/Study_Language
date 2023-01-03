## 웹 크롤링 // 웹 페이지 정보 가져오기

# import requests
# from bs4 import BeautifulSoup

# url = 'https://www.naver.com'
# response = requests.get(url)
# print('응답코드: {}'.format(response.status_code))
# print(response.text)

## 웹 크롤링 // 검색 결과 웹 페이지 정보 가져오기

# url = 'https://movie.naver.com/movie/bi/mi/basic.naver'
# param = {'code':'161967'}
# response = requests.get(url, params=param)
# print('응답코드: {}'.format(response.status_code))
# information = response.text
# soup = BeautifulSoup(information, 'html.parser')
# find_list = soup.find_all('div', class_ = 'score_reple')
# for tags in find_list:
#     print(tags.find('p').text.strip())

## 웹 크롤링 응용 예제1)
import time

import requests
from bs4 import BeautifulSoup
import csv
import urllib.request # 이미지를 다운로드 하기 위한 모듈

# url = 'https://search.naver.com/search.naver'
# param = {'query':'대구+중구+카페'}
# response = requests.get(url, params=param)
# print('응답코드: {}'.format(response.status_code))
# information = response.text
# soup = BeautifulSoup(information, 'html.parser')
# # 블로그의 전체 리스트를 list 자료형으로 가져온다
# blog_list = soup.find_all('li', class_ = 'bx _svp_item')
# blog_csv_list = [] # 찾은 정보를 리스트로 저장하는 리스트
# # 2차원 list 가 될 예정.. [title, url, image_url]
# # urlretrieve(image의 url, 다운로드받을경로)
#
# for index, blog in enumerate(blog_list):
#     try:
#         blog_info = blog.find('div', class_ = 'total_area')
#         aTag = blog_info.find('a', class_ = 'api_txt_lines')
#         blog_url = aTag.get('href') # href 속성의 값을 가져옴
#         blog_title = aTag.text # 해당 태그의 text 부분
#         blog_image_url = blog.find('a', class_ = 'thumb_single').find('img').get('src')
#         blog_csv_list.append([blog_title, blog_url, blog_image_url])
#         # print('블로그 URL: {}'.format(blog_url))
#         # print('블로그 제목: {}'.format(blog_title))
#         # print('블로그 사진: {}'.format(blog_image_url))
#         urllib.request.urlretrieve(blog_image_url, f'.\\{index+1}.jpg')
#     except:
#         pass
#
# with open('블로그 정보.csv', 'w', newline='') as file:
#     csv_writer = csv.writer(file)
#     csv_writer.writerow(['블로그 제목', '블로그 URL', '블로그 이미지 URL'])
#     for info_list in blog_csv_list: # 블로그 리스트를 순회한다
#         csv_writer.writerow(info_list) # csv파일에 한 줄 쓴다 (리스트를 바로 쓴다)
#
# print('블로그 정보.csv 파일이 생성되었습니다.')


## selenium  (web 과 상호작용 하는 경우만 사용, 속도가 느림 // 데이터를 수집하는 것은 bs4)

from selenium.webdriver.common.by import By
# Selenium 에서 사용할 수 있는 Key값들
from selenium.webdriver.common.keys import Keys
# Selenium 에서 사용할 수 있는 검색 조건 (tag명, class명, css요소 .. 등)
from selenium.webdriver.common.by import By
# Selenium 에서 웹 페이지가 로딩될 때까지 기다리게하는 환경을 조성하는 모듈들
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support.expected_conditions import *
from selenium.webdriver.chrome.service import Service
from selenium import webdriver

service = Service(executable_path='chromedriver.exe')
driver = webdriver.Chrome(service=service)

insta_url = 'https://www.instagram.com/'
driver.get(insta_url) ## 이 드라이버로 해당 url 을 가져오겠다는 의미
# WebDriverWait: 웹 페이지가 로딩 될 때까지 기다림
# driver: 로딩되는 해당 페이지, timeout: 최대 기다릴 초
# until(기다릴 기준(값))
# WebDriverWait(driver, timeout=5).until(url_changes(insta_url))
time.sleep(10)

# find_element(By.???, '값')
# 현재 페이지에서 input 이라는 태그이름을 가진 요소를 전부 가져옴
login_inputs = driver.find_elements(By.TAG_NAME, 'input')
insta_id = login_inputs[0]
insta_pw = login_inputs[1]
# # id / pw 입력 후 로그인
insta_id.send_keys('01087021923')
insta_pw.send_keys('dlatjdgns22@')
insta_pw.send_keys(Keys.ENTER)

time.sleep(4) # 로딩될때까지 4초 기다림
account_name = 'fnvit_code'
driver.get(insta_url + account_name)
time.sleep(4)
driver.find_element(By.CSS_SELECTOR, 'div._aabd').click()

# web드라이버 종료
driver.quit()






