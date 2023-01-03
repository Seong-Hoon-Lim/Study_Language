# import tkinter
# import tkinter.font as tkFont
#
# count = 0 # GUI 는 전역변수를 만들어서 사용
# def count_up():
#     global count
#     count += 1
#     label.configure(text = count)
#
#
#
# window = tkinter.Tk()
#
# window.title('이것이 윈도우')
# #geometry: 창의 크기와 위치(가로x세로+x좌표+y좌표)
# window.geometry('600x600+300+300')
#
# #resizable: 창 조절 가능여부 (가로, 세로)
# window.resizable(False, False)
# #폰트 셋팅
# fontSet = tkFont.Font(family="돋움", size=20, weight='bold')
#
# label = tkinter.Label(window, text ='테스트', fg='blue',
#                       width=30, height=30, relief='solid', bd=3, font=(fontSet))
# #버튼 생성
# button = tkinter.Button(window, text='누르세요', width=10, height=3, font=fontSet,
#                         command=count_up,
#                         repeatdelay=10,
#                         repeatinterval=100) # command=함수명 만 전달 () 전달하지 않음.
#
# button.pack() ## .pack() 위치에 따라 순서가 변경됨.
# # label.configure(text='바뀐테스트') # text ='테스트' 를 text='바뀐테스트' 로 변경
# label.pack() ## .pack() 위치에 따라 순서가 변경됨.
#
# window.mainloop() #항상 맨 밑에 위치, 없으면 창이 바로 꺼짐


# import tkinter
# import tkinter.font as tkFont
#
#
# window = tkinter.Tk()
#
# window.title('이것이 윈도우')
# #geometry: 창의 크기와 위치(가로x세로+x좌표+y좌표)
# window.geometry('600x600+300+300')
#
# #resizable: 창 조절 가능여부 (가로, 세로)
# window.resizable(False, False)
# #폰트 셋팅
# fontSet = tkFont.Font(family="돋움", size=20, weight='bold')
#
# b1 = tkinter.Button(window, text='b1', bg='white', font=fontSet)
# b2 = tkinter.Button(window, text='b2', bg='green', font=fontSet)
# b3 = tkinter.Button(window, text='b3', bg='blue', font=fontSet)
# b4 = tkinter.Button(window, text='b4', bg='aqua', font=fontSet)
# b5 = tkinter.Button(window, text='b5', bg='gray', font=fontSet)
#
# b1.pack(side='left')
# b2.pack(side='top')
# b3.pack(side='right')
# b4.pack(side='bottom')
# b5.pack(expand=True, fill='both')
#
# window.mainloop() #항상 맨 밑에 위치, 없으면 창이 바로 꺼짐
#
#
# import tkinter
# import tkinter.font as tkFont
#
# def calculate():
#     f = inputEntry.get() #Entry의 값(문자열)을 가져옴
#     result = eval(f) #계산 결과를 result에 저장
#     resultEntry.delete(0, tkinter.END) #Entry의 처음부터 끝까지 전부 삭제
#     resultEntry.insert(tkinter.END, result) #Entry의 가장 첫위치에 result를 삽입한다
#                        # 맨 앞에 위치
#
# window = tkinter.Tk()
#
# window.title('이것이 윈도우')
# #geometry: 창의 크기와 위치(가로x세로+x좌표+y좌표)
# window.geometry('600x600+300+300')
#
# #resizable: 창 조절 가능여부 (가로, 세로)
# window.resizable(False, False)
# #폰트 셋팅
# fontSet = tkFont.Font(family="돋움", size=20, weight='bold')
#
# inputEntry = tkinter.Entry(window)
# resultEntry = tkinter.Entry(window)
#
# b1 = tkinter.Button(window, text='계산', bg='white', font=fontSet,
#                     command=calculate)
#
# inputEntry.pack()
# resultEntry.pack()
# b1.pack()
#
# window.mainloop() #항상 맨 밑에 위치, 없으면 창이 바로 꺼짐
#
#
#
#
# import tkinter
# import tkinter.ttk as ttk
# import tkinter.font as tkFont
#
# window = tkinter.Tk()
#
# window.title('이것이 윈도우')
# #geometry: 창의 크기와 위치(가로x세로+x좌표+y좌표)
# window.geometry('600x600+300+300')
#
# #resizable: 창 조절 가능여부 (가로, 세로)
# window.resizable(False, False)
# #폰트 셋팅
# fontSet = tkFont.Font(family="돋움", size=20, weight='bold')
#
# frame1 = tkinter.LabelFrame(window, text='라벨1', relief='solid', bd=3)
# frame2 = tkinter.LabelFrame(window, text='라벨2', relief='sunken', bd=3, bg='aqua')
# frame1.pack(side='left', fill='both', expand=True)
# frame2.pack(side='right', fill='both', expand=True)
#
# label = tkinter.Label(frame1, text='Label', relief='solid', font=fontSet)
# button = tkinter.Label(frame2, text='Button', width=5, height=5,
#                        bg='yellow', font=fontSet)
#
# #maximumL: 프로그래스바에서 올라가는 값의 최대값
# #length: 프로그래스바의 너비
# #value: 프로그래스바의 현재값 설정
# v = tkinter.DoubleVar() #프로그래스 바의 값을 실수형 값으로 설정
# progress1 = ttk.Progressbar(frame1, maximum=100, length=200, variable=v,
#                             mode='indeterminate')
# progress2 = ttk.Progressbar(frame2, maximum=100, length=200,
#                             mode='determinate')
#
# v.set(50) #프로그래스 바의 값을 지정을 하면
# progress1.update() #프로그래스 바를 업데이트 반영
#
# valueList = ['A', 'B', 'C', 'D']
# combo1 = ttk.Combobox(frame1, width=10, font=fontSet, values=valueList)
# combo1.set('Alpabet get') #현재 combox의 값을 설정
# Alpabet = combo1.get() #현재 combox의 값을 가져옴
# combo1.pack()
#
#
# progress1.start()
# progress2.start()
#
# progress1.pack()
# progress2.pack()
#
#
# label.pack()
# button.pack()
#
# window.mainloop() #항상 맨 밑에 위치, 없으면 창이 바로 꺼짐
#
#

## GUI 실습

import tkinter
import tkinter.ttk
import tkinter.messagebox as msg
from tkinter import filedialog
import fitz

file_path = '' # PDF 파일을 불러올 경로
save_path = '..\\'  # 변환된 이미지를 저장할 경로 (기본값 : 현재 폴더)
file_name = 'page-' # 변환된 이미지의 파일 이름 설정 (page -1, page-2 . . . )

# 변환 시작 버튼 눌렀을 시 동작
def Convert():
    # 파일을 지정안할 시 실행하지 않음
    if file_path == '':
        msg.showwarning('경고', 'Warning: 파일을 지정해야 합니다!!')
        return

    page_count = len(list(fitz.open(file_path)))

    combo_PTI_format.get()
    for index, page in enumerate(fitz.open(file_path)):  ## 파일을 연다는 의미
        pix = page.get_pixmap()
        # save(전체경로)
        # \\PDFtoImage\\1.jpg
        # 저장폴더경로(.\\) + '\\' + 파일이름형식(page-) + 페이지번호(1) + 확장자명(.) + 콤보박스값(jpg)
        pix.save(save_path + '\\' + file_name + str(index) + '.'
                 + combo_PTI_format.get().lower())
        # 프로그래스바에 설정할 값을 계산
        # 현재 진행된 페이지를 %로 계산 -> 현재페이지 / 전체페이지 수 * 100
        progress_Bar.set((index + 1) / page_count * 100)
        # 프로그래스바에 위 설정값을 실시간적용 update() 시킴
        progress_PTI.update()

    msg.showinfo('완료', '이미지 변환 완료!')

# 파일 찾아보기 버튼 눌렀을 시 동작
def Open_File():
    # title : 창의 제목
    # filetypes : 선택 가능한 파일의 종류(형식)을 지정 // *.* >> 모든 이름 가능, 모든 형식 가능
    # initialdir : 처음 창이 뜨는 폴더 위치
    open_file_path = filedialog.askopenfilename(title='PDF파일을 선택하세요',
                                                filetypes=(('PDF파일','*.pdf'),('모든파일', '*.*')),
                                                initialdir='.\\'
                                                )
    # 찾아보기 버튼 옆에 있는 Entry
    Etr_PTI_file_path.delete(0, tkinter.END) # 경로를 넣기 전에 Entrty 값을 전부 지움
    Etr_PTI_file_path.insert(0, open_file_path) # 경로를 넣음
    global file_path # 전역변수 file_path 를 가져와서 경로를 저장해줌
    file_path = open_file_path

# 저장경로 찾아보기 버튼 눌렀을 시 동작
def Save_File():
    save_file_path = filedialog.askdirectory()
    # 찾아보기 버튼 옆에 있는 Entry
    Etr_PTI_save_path.delete(0, tkinter.END)  # 경로를 넣기 전에 Entrty 값을 전부 지움
    Etr_PTI_save_path.insert(0, save_file_path)  # 경로를 넣음
    global save_path  # 전역변수 file_path 를 가져와서 경로를 저장해줌
    save_path = save_file_path


window = tkinter.Tk()
window.title('PDF/Image Converter')#윈도우에 제목 설정
window.resizable(False, False) #창 크기 변경 불가

frame_Main = tkinter.Frame(window, padx = 10, pady = 10) #window안에 Frame 생성
frame_Main.pack(fill = 'both')

#PDF to Image 라벨프레임
frame_PTI = tkinter.LabelFrame(frame_Main, text = 'PDF to Image', relief = 'solid'
                               ,background = 'aqua', bd = 3, padx = 10, pady = 10)
frame_PTI.pack(fill = 'both')

#PDF파일 라벨프레임
frame_PTI_file = tkinter.LabelFrame(frame_PTI, text = 'PDF 파일', relief = 'solid'
                                    , background = 'white', bd = 2, padx = 10, pady = 10)
frame_PTI_file.pack(fill = 'both')

#PDF파일 경로를 지정하는 Label 생성
lb_PTI_file_path = tkinter.Label(frame_PTI_file, text = 'PDF 파일 경로')
lb_PTI_file_path.pack(side = 'left', padx = 5)
#PDF파일 경로를 지정하는 Entry 생성
Etr_PTI_file_path = tkinter.Entry(frame_PTI_file, width = 50)
Etr_PTI_file_path.pack(side = 'left', padx = 5, ipadx = 2, ipady = 2)
#PDF파일 경로를 지정하는 Button 생성 - 버튼이 눌려질 때 open_file 함수 호출
button_PTI_file_path = tkinter.Button(frame_PTI_file, text = '찾아보기', command=Open_File)
button_PTI_file_path.pack(side = 'right', padx = 5)

#변환된 이미지를 저장하는 경로 frame
frame_PTI_save = tkinter.LabelFrame(frame_PTI, text = 'Image 저장', relief = 'solid', background = 'white'
                                    , bd = 2, padx = 10, pady = 10)
frame_PTI_save.pack(fill = 'both')

#변환된 이미지를 저장하는 경로 설정하는 Label, Entry, Button 생성
lb_PTI_save_path = tkinter.Label(frame_PTI_save, text = '저장 폴더 경로')
Etr_PTI_save_path = tkinter.Entry(frame_PTI_save, width = 50)
button_PTI_save_path = tkinter.Button(frame_PTI_save, text = '찾아보기', command=Save_File)
#변환된 이미지를 저장하는 경로 설정하는 Label, Entry, Button 위치 설정
lb_PTI_save_path.pack(side = 'left', padx = 5)
Etr_PTI_save_path.pack(side = 'left', padx = 5)
button_PTI_save_path.pack(side = 'right', padx = 5)

#image 파일 포맷 결정 frame생성
frame_PTI_option = tkinter.Frame(frame_PTI, relief = 'solid'
                                    , background = 'white', bd = 2, padx = 10, pady = 10)
frame_PTI_option.pack(fill = 'x', pady = 10)

#image 파일 포맷 결정 frame안의 label 생성
lb_PTI_format = tkinter.Label(frame_PTI_option, text = '이미지 파일 포맷')
lb_PTI_format.pack(side = 'left')

###image 파일 포맷 결정 frame안의 Combobox 생성 (읽기 전용으로 생성)
combo_PTI_formatList = ['PNG', 'JPG'] #Combo박스에 들어갈 값들의 리스트 생성
#리스트를 value값으로 사용하여 Combobox 생성
combo_PTI_format = tkinter.ttk.Combobox(frame_PTI_option, state = 'readonly', width = 10, values = combo_PTI_formatList)
combo_PTI_format.current(0) #ComboBox의 현재값을 values 옵션에 들어있는 list의 0번째 index 값으로 지정
combo_PTI_format.pack(side = 'left')

#변환 시작버튼 생성
button_PTI_start = tkinter.Button(frame_PTI, text = '변환시작', command=Convert)
button_PTI_start.pack(fill = 'x', pady = 10)

#변환 Progressbar 생성
#프로그레스바 값을 저장할 변수
progress_Bar = tkinter.DoubleVar()
#최대 값을 100으로 하고, progress_Bar변수를 값으로 하여 프로그레스바를 생성
progress_PTI = tkinter.ttk.Progressbar(frame_PTI, maximum = 100, variable = progress_Bar)
progress_PTI.pack(fill = 'x')


window.mainloop() #윈도우에 창 띄우기









