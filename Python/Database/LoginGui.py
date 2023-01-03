import tkinter
import tkinter.font
import LibaryQurey as LQ
import tkinter.messagebox as msg


class LoginGUI:
    def __init__(self):
        # --------- 화면 설정 -----------#
        self.window = tkinter.Tk()
        self.window.title('LOGIN')
        self.window.resizable(False, False)
        self.font = tkinter.font.Font(family='돋음', size=20)
        # --------- DB와 연결 -----------#
        self.LQ = LQ.LibQuery()  # DB 쿼리 객체 생성
        if not LQ: #connection이 되지 않았다면
            msg.showerror('DB에러!', 'DB와의 연결이 되지 않아 종료합니다')
            return
        # --------- 화면 생성 -----------#
        self.make_signUP_GUI() #로그인 화면 만든다
        self.make_login_GUI() #회원가입 화면 만든다
        self.singnUPMainFrame.pack_forget() #회원가입 창 해제
        self.window.mainloop()

    #window전환을 위한 메소드
    def change_window(self):
        #현재 창이 회원가입 창이라면
        if self.singnUPMainFrame.winfo_ismapped():
            self.singnUPMainFrame.pack_forget() #pack해제
            self.loginMainFrame.pack() #repack
        #현재 창이 로그인 창이라면
        else:
            self.loginMainFrame.pack_forget() #pack해제
            self.singnUPMainFrame.pack() #repack

    #로그인 버튼 눌렀을 때 동작하는 메소드
    def login(self):
        pass

    # 회원가입 버튼 눌렀을 때 동작하는 메소드
    def signUp(self):
        id = self.idEntryS.get()
        pw = self.pwEntryS.get()
        name = self.nameEntryS.get()
        age = self.ageEntryS.get()
        phone = self.phoneEntryS.get()

        if self.LQ.singUp(id,pw,name,age,phone): #True 라는 것은 성공
            self.idEntryS.delete(0, tkinter.END)
            self.idEntryS.delete(0, tkinter.END)
            self.pwEntryS.delete(0, tkinter.END)
            self.nameEntryS.delete(0, tkinter.END)
            self.ageEntryS.delete(0, tkinter.END)
            self.phoneEntryS.delete(0, tkinter.END)

            msg.showinfo('회원가입성공', '회원가입에 성공하였습니다!')
        else:
            msg.showerror('회원가입실패', '이미 같은 ID가 존재합니다')


    def make_login_GUI(self):
        # ------------- MAIN FRAME -----------------#
        self.loginMainFrame = tkinter.Frame(self.window, relief='solid', bd=2)
        self.loginMainFrame.pack(fill='both')
        # -------------- ID ------------------------#
        idFrame = tkinter.Frame(self.loginMainFrame, relief='solid', bd=2)
        idLabel = tkinter.Label(idFrame, text='ID', font=self.font)
        self.idEntryL = tkinter.Entry(idFrame, font=self.font)
        idFrame.pack(fill='both')
        idLabel.pack(side='left')
        self.idEntryL.pack(side='right')
        #-------------- PASSWORD -------------------#
        pwFrame = tkinter.Frame(self.loginMainFrame, relief='solid', bd=2)
        pwLabel = tkinter.Label(pwFrame, text='PW', font=self.font)
        self.pwEntryL = tkinter.Entry(pwFrame, font=self.font)
        pwFrame.pack(fill='both')
        pwLabel.pack(side='left')
        self.pwEntryL.pack(side='right')
        # -------------- LOGIN BUTTONS --------------#
        buttonFrame = tkinter.Frame(self.loginMainFrame, relief='solid', bd=2)
        loginButton = tkinter.Button(buttonFrame, text='로그인', font=self.font,
                                     command=self.login )
        signUpbutton = tkinter.Button(buttonFrame, text='회원가입', font=self.font,
                                      command=self.change_window )
        buttonFrame.pack(fill='both')
        loginButton.pack(side='left', expand=True, fill='both')
        signUpbutton.pack(side='right', expand=True, fill='both')

    def make_signUP_GUI(self):
        # ------------- MAIN FRAME -----------------#
        self.singnUPMainFrame = tkinter.Frame(self.window, relief='solid', bd=2)
        self.singnUPMainFrame.pack(fill='both')
        # -------------- ID ------------------------#
        idFrame = tkinter.Frame(self.singnUPMainFrame, relief='solid', bd=2)
        idLabel = tkinter.Label(idFrame, text='ID', font=self.font)
        self.idEntryS = tkinter.Entry(idFrame, font=self.font)
        idFrame.pack(fill='both')
        idLabel.pack(side='left')
        self.idEntryS.pack(side='right')
        # -------------- PASSWORD -------------------#
        pwFrame = tkinter.Frame(self.singnUPMainFrame, relief='solid', bd=2)
        pwLabel = tkinter.Label(pwFrame, text='PW', font=self.font)
        self.pwEntryS = tkinter.Entry(pwFrame, font=self.font)
        pwFrame.pack(fill='both')
        pwLabel.pack(side='left')
        self.pwEntryS.pack(side='right')
        #-------------- NAME -------------------#
        nameFrame = tkinter.Frame(self.singnUPMainFrame, relief='solid', bd=2)
        nameLabel = tkinter.Label(nameFrame, text='이름', font=self.font)
        self.nameEntryS = tkinter.Entry(nameFrame, font=self.font)
        nameFrame.pack(fill='both')
        nameLabel.pack(side='left')
        self.nameEntryS.pack(side='right')
        # -------------- AGE -------------------#
        ageFrame = tkinter.Frame(self.singnUPMainFrame, relief='solid', bd=2)
        ageLabel = tkinter.Label(ageFrame, text='나이', font=self.font)
        self.ageEntryS = tkinter.Entry(ageFrame, font=self.font)
        ageFrame.pack(fill='both')
        ageLabel.pack(side='left')
        self.ageEntryS.pack(side='right')
        # -------------- PHONE -------------------#
        phoneFrame = tkinter.Frame(self.singnUPMainFrame, relief='solid', bd=2)
        phoneLabel = tkinter.Label(phoneFrame, text='연락처', font=self.font)
        self.phoneEntryS = tkinter.Entry(phoneFrame, font=self.font)
        phoneFrame.pack(fill='both')
        phoneLabel.pack(side='left')
        self.phoneEntryS.pack(side='right')
        # -------------- LOGIN BUTTONS -------------------#
        buttonFrame = tkinter.Frame(self.singnUPMainFrame, relief='solid', bd=2)
        signUPCancleButton = tkinter.Button(buttonFrame, text='취소', font=self.font,
                                            command=self.change_window )
        signUpbutton = tkinter.Button(buttonFrame, text='회원가입', font=self.font,
                                      command=self.signUp )
        buttonFrame.pack(fill='both')
        signUpbutton.pack(side='left', expand=True, fill='both')
        signUPCancleButton.pack(side='right', expand=True, fill='both')

if __name__ == "__main__":
    LoginGUI()