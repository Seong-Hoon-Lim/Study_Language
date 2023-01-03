import ConnectionFactory

class Qurey:

    index = 0
    def __init__(self):
        self.connection = ConnectionFactory.DBConnection().connection()

    #책을 insert하는 담당메소드

    def insert_book(self, *args):
        if not self.connection: #DB와 연결이 되지 않았다면
            return #종료

            cursor = self.connection().cursor
            qurey = f"INSERT INTO 'book_info' VALUES ({self.index}, {args[1]}, {args[2]})"
            cursor.execute(qurey) #쿼리를 실행시킴
            cls.connection.commit() #서버에 반영시킴
            print(f'book_info table에 {args[0]}, {args[1]}를 삽입하였습니다')
            cls.index += 1 #bookID를 1증가시킴


    def close_connection(self):
        self.connection.close()