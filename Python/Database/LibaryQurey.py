import ConnectionFactory

class LibQuery:
    def __init__(self):
        self.connection = ConnectionFactory.DBConnection().connection()
        self.cursor = self.connection.cursor()

    #사용자 로그인
    def login(self, id, pw):
        loginQuery = f"INSERT INTO userinfo " \


    def singUp(self, id, pw, name, age, phone):
        singUpQurey = f"INSERT INTO userinfo " \
                     f"VALUES ('{id}','{pw}','{name}','{age}','{phone}')"
        success = self.cursor.execute(singUpQurey) #쿼리를 실행
        if success > 0: #INSERT 성공
            self.connection.commit() #서버에 반영
            return True
        else: #INSERT 실패
            return False #서버에 반영하지 않고 False 반환