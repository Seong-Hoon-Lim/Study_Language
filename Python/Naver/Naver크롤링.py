## naver 크롤링
import time
import pywinmacro as pw
import pyperclip as pc

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

# Selenium 옵션 설정
option = webdriver.ChromeOptions()
option.add_argument('headless') # 실행할 때 크롬이 뜨지 않는다
# Selenium 드라이버 설정
#
# service = Service(executable_path='Database/chromedriver.exe')
# driver = webdriver.Chrome(service=service, options=option)


# 데이터를 가져올 때 사용할 뷰티풀숩 (클릭과 같은 동작 이외에는 다 얘로 처리)
from bs4 import BeautifulSoup
# import NaverQurey as NQ


service = Service(executable_path='Naver/chromedriver.exe')
driver = webdriver.Chrome(service=service)

# def naver_login():
#     driver.get('https://nid.naver.com/nidlogin.login')
#     time.sleep(3)
#     login_id = 'id'
#     login_pw = 'pw'
#
#     pc.copy(login_id)
#     pw.ctrl_v()
#     time.sleep(1)
#     pw.key_press_once('tap')
#     time.sleep(1)
#     pc.copy(login_pw)
#     time.sleep(1)
#     pw.ctrl_v()
#     pw.key_press_once('enter')


def book_colletor():

    url = 'https://book.naver.com/search/search.naver'
    serch_keyword = ['파이썬', 'C언어', 'C++', 'C#', '자바스크립트', 'HTML']

    # CSS_SELECTOR 사용법
    # 클래스: .클래스명
    # ID: #id명
    # TAG: 그냥 적음
    # 그 외 속성: [속성이름='속성값']
    # ex) 'div.no_result', 'div[type="style"]', 'a#name'


    for keyword in serch_keyword:
        driver.get(url) # 첫 페이지로 이동 (책 검색의 빈 페이지)
        # 검색어를 입력해서 검색
        driver.find_element(By.ID, 'nx_query').send_keys(keyword+Keys.ENTER)
        # 검색페이지가 나올 때까지 기다림
        WebDriverWait(driver, timeout=10).until(url_contains('query'))
        # '구입가능도서' 체크박스를 클릭
        driver.find_element(By.ID, 'buyAllow').click()

        # 현재 검색어의 3페이지 분량의 데이터를 수집한다
        for page_index in range(3):
            # 현재 페이지의 정보를 뷰티풀숩으로 변환한다
            soup = BeautifulSoup(driver.page_source, 'html.parser')

            # 모든 책 블럭을 가져온다
            book_contents = soup.find('ul', id = 'searchBiblioList').find_all('li')

            # 모든 책 컨텐츠를 순회한다 (현재 페이지에서)
            for content in book_contents:
                try:
                    book_info = content.find('dl')
                    book_name = book_info.find('a').text
                    book_price = book_info.find('dd', class_ = 'txt_desc').find('em').text
                    book_price = ''.join(book_price.split('원')[0].split(','))
                    # if len(book_name) <= 40: #책 이름이 40자 이내라면
                    #     NQ.Qurey.insert_book(book_name, book_price)
                    print(book_name)
                    print(book_price)
                # except 로 갔다는 것은 ebook인 책들임
                except:
                    pass
            # 다음 페이지 index를 가져온다 (div 태그이면서 class 이름이 paginate 인 친구)
            page_indexs = driver.find_element(By.CSS_SELECTOR, 'div.paginate')
            page_indexs.find_elements(By.TAG_NAME, 'a')[page_index].click()
            time.sleep(1) # 다음 페이지가 로딩될 때까지 1초 기다림


book_colletor() # 책 데이터 수집
# NQ.Qurey.close_connection() #MariaDB와 Connection을 끊음
driver.quit() # 크롬 드라이버 종료

# naver_login()







