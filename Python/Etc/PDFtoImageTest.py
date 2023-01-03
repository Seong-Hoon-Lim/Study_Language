import fitz
file_path = '/2/PDFtoImage'  # 절대 경로
file_path = '../PDFtoImage\\'  # 상대 경로 (프로그램을 배포할 때 사용)
file_name = 'TestPDF.pdf'

save_path = file_path # 파일이 있는 경로에 save 를 한다.

# index : 페이지 번호
# page : 페이지의 실제 정보
for index, page in enumerate(fitz.open(file_path + file_name)): ## 파일을 연다는 의미
    pix = page.get_pixmap()
    # save(전체경로)
    # \\PDFtoImage\\1.jpg
    pix.save(save_path + str(index) + '.jpg' )

