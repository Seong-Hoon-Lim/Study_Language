package org.java_mentorseries.day13;

import java.awt.*;
import java.io.*;
import javax.swing.*;

//	 ■ GUI(Graphical User Interface)
//	  : 컴퓨터를 사용하는 사용자를 위해 만들어진 특정한 기능을 가진 그래픽 요소
//
//	  JAVA GUI 프로그래밍
//	  : 사용자가 프로그램을 쉽게 다룰 수 있도록 그래픽을 제공하도록 프로그래밍 하는 것
//
//	 ■ AWT: JAVA에서 GUI를 프로그래밍 하기 위해 처음으로 제공한 라이브러리
//	  - java.awt 패키지에 Frame,Window,Panel,Button,Label 등 클래스 존재
//	  - 운영체제의 자원 활용
//
//	 ■ Swing: AWT를 대체하기 위해 JAVA로 작성된 GUI 객체
//	  - javax.swing 패키지에 JFrame,JWindow,JPanel 등 클래스 존재
//	  - 운영체제에 의존적이지 않으며, 운영체제와 관계없이 동일한 모양을 사용
//
//	 ■ 컴포넌트: JAVA에서 GUI를 구성하는 요소
//	 ■ 컨테이너: 다른 컴포넌트를 포함할 수 있는 컴포넌트
//	  ※JFrame은 최상위 컴포넌트로 다른 컴포넌트에 포함될 수 없다.
//
//	  GUI 프로그래밍을 하기위해 사용되는 메서드
//	  - setLocation(int x,int y): 프레임의 위치를 지정
//	  - setSize(int width,int height): 프레임의 크기를 지정
//	  - setIconImage(Image IconImage): 프레임 타이틀바의 아이콘 설정
//	  - setTitle(String title): 타이틀바의 제목을 설정
//	  - setVisible(boolean b): 화면에 표시여부를 설정
//
//	 ■ GUI 프로그래밍 순서
//	  1) extends JFrame
//	   - JFrame 클래스를 상속받아,나만의 프레임 클래스 작성
//	   - 생성자에서 컴포넌트 및 프레임의 디자인 구현하기
//
//	  2) 기본설정 - 생성자에서 하기
//	    : title,size,visible 설정하기
//	   - title 설정: setTitle("타이틀명");
//	   - size 설정: setSize(가로길이,세로길이);
//	   - visible 설정: setVisible(true);
//
//	 ■ 배치 관리자(Layout Manager)
//	  : 컨테이너 내부에 컴포넌트 추가시 각각의 위치와 크기에 관해 결정
//	  배치 관리자의 종류
//	  - FlowLayout: 왼쪽->오른쪽 순서대로 배치
//	  - BorderLayout: 컨테이너 공간을 동서남북 중앙으로 나누고 지정한 영역에 배치
//	  - GridLayout: 컨테이너 공간을 동일 크기의 2차원 격자로 나누고 들어오는 순서
//	       			대로 왼쪽->오른쪽 배치
//	  - CardLayout: 카드를 쌓아놓은 듯 컴포넌트를 쪼개서 배치

//	GUI 프로그래밍 예문(Swing)

public class GUIProgreamming1 extends JFrame {
//	GUIProgreamming1() {
//		setTitle("JFrame");
//		setSize(300,300);
//		
//		//컴포넌트 만들기
//		JButton button = new JButton("button");
//		JCheckBox box = new JCheckBox("checkbox");
//		JSlider slide = new JSlider();
//		JTextField tf = new JTextField("text 입력",20);
//		//위치를 담당하는 레이아웃을 지정
//		this.setLayout(new FlowLayout());
//		
//		this.add(button);
//		this.add(box);
//		this.add(slide);
//		this.add(tf);
//		
//		setVisible(true);
//		//내 프로그램 닫는 기능을 닫기 버튼으로 설정
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//	public static void main(String[] args) {
//			new GUIProgreamming1();
//
//	}
//}

//	레이아웃 예문


	public static void main(String[] args) {
			new GridWingdow();
	}
}
class FlowWindow extends JFrame {
	FlowWindow() {
		setTitle("flow window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		setVisible(true);
	}
}
class BorderWindow extends JFrame {
	BorderWindow() {
		setTitle("bordre window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		JButton btn4 = new JButton("btn4");
		JButton btn5 = new JButton("btn5");
		
		this.setLayout(new BorderLayout());
		this.add(btn1,BorderLayout.EAST);
		this.add(btn2,BorderLayout.WEST);
		this.add(btn3,BorderLayout.SOUTH);
		this.add(btn4,BorderLayout.NORTH);
		this.add(btn5,BorderLayout.CENTER);
			
		setVisible(true);
	}
}
class GridWingdow extends JFrame {
	GridWingdow() {
		setTitle("grid window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		
		this.setLayout(new GridLayout(2,2));
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
			
		setVisible(true);
	}
}
