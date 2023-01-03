import pymysql

# DB와 연결을 담당하는 객체
class DBConnection:
    def __init__(self):
        self.loadData('DB.txt')

    # 파일을 읽어서 접속할 DB의 정보를 가져온다
    def loadData(self, fileName):
        try:
            with open(fileName) as file:
                # 모든 데이터를 읽어서 줄바꿈을 기준으로 나눈다
                data = file.read().split('\n')
                self.ip =       data[0]
                self.user =     data[1]
                self.password = data[2]
                self.charset =  data[3]
                self.port =     data[4]
                self.db =       data[5]
        except FileNotFoundError:
            print('Error: 파일이 존재하지 않습니다!')
        except Exception:
            print('Error: 데이터 read 중 오류가 발생하였습니다!')

    # 실제로 DB와 연결을 시도하는 부분
    def connection(self):
        print('MariaDB: {}에 연결합니다...'.format(self.db))
        try:
            connection = pymysql.connect(
                host=self.ip, password=self.password, user=self.user,
                db=self.db, charset=self.charset, port=int(self.port)
            )
            print('MariaDB: {}에 연결되었습니다.'.format(self.db))
            # 제대로 DB와 연결되었으면 연결객체인 connection을 반환
            return connection

        except pymysql.MySQLError:
            print('Error: DB접속 중 문제가 발생하였습니다.')
            print('\t\t\t - ip, password, user, db, charset, port번호를 확인하세요.')

        pass
# 만약 현재 파일을 실행했다면 DBConnection의 객체를 생성(테스트용)
if '__main__' == __name__:
    DBConnection().connection()
    