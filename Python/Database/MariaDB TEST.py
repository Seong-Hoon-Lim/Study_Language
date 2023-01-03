import ConnectionFactory

connection = ConnectionFactory.DBConnection().connection()
if  connection: # 연결이 되었다

    # 커서 객체 생성
    cursor = connection.cursor()
    # query = "INSERT INTO books (title) VALUES ('test')"
    query = "SELECT * FROM books"
    result = cursor.execute(query)
    # cursor.fetchall(): 2차원 tuple의 형태로,
    # 1차원 tuple의 형태가 여러개 저장되어있음 (1행씩)
    for data in cursor.fetchall():
        print(data)

    # 쿼리를 실행한다
    # 변경 결과를 서버에 반영
    # connection.commit()


    print('MariaDB: 접속을 종료합니다.')

    connection.close()

