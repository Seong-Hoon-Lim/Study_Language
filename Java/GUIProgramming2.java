package org.java_mentorseries.day13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//	 ■ 이밴트(Event)
//	  : 프로그램을 실행하는 도중 사용자에 의해 발생하는 키보드 입력,마우스클릭 등의 동작
//	  이벤트 처리: 이벤트가 발생했을 때,어떤 작업을 할것인지 결정하는 것
//
//	 ■ 이벤트 객체 
//	  : 이벤트 발생 시 이벤트에 대한 정보를 가진 객체
//	  ex) 이벤트의 종류,이벤트가 발생한 위치(ex.마우스 좌표),체크박스의 체크 상태 등
//
//	 ■ 이벤트 리스너
//	  : 이벤트 객체에 의해서 호출되어 해당 이벤트를 처리하는 객체
//	  - 이벤트 리스너 사용시 해당 인터페이스의 추상 메서드 구현해야함
//
//	  이벤트 리스너 종류
//	  1) Action
//	  - 리스너 인터페이스: ActionListener
//	  - 추상메서드: void actionPerformed(ActionEvent)
//		: Action이 발생시
//	  2) Key
//	  - 리스너 인터페이스: KeyListener
//	  - 추상메서드
//	    void KeyPressed(KeyEvent): 키가 눌려질 때
//		void KeyReleased(KeyEvent): 눌러진 키를 땔 때
//		void KeyTyped(KeyEvent): 유니코드 키 입력 시
//	  3) Mouse
//	  - 리스너 인터페이스: MouseListener
//	  - 추상메서드
//		void MousePressed(MouseEvent): 마우스버튼이 눌릴 때
//		void MouseReleased(MouseEvent): 눌린 마우스 뗄 때
//		void MouseClicked(MouseEvent): 마우스 클릭 할 때
//		void MouseEntereded(MouseEvent): 마우스 포인터가 컴포넌트 위에 있을때
//		void MouseExisted(MouseEvent): 마우스 포인터가 컴포넌트 위에 없을때
//
//	  - 리스너 인터페이스: MouseMotionListener
//	  - 추상메서드
//		void mouseDragged(MouseEvent e): 마우스가 드래그 될 때
//		void mouseMoved(MouseEvent e): 마우스가 움직일 때
//
//	  마우스 이벤트 발생 시 얻을 수 있는 정보 메서드
//	  int getX(): 현재 마우스 포인터의 X좌표
//	  int getY(): 현재 마우스 포인터의 Y좌표
//	  short getButton(): 현재 클릭한 버튼(왼쪽,오른쪽)
//	  int getClickCount(): 마우스를 클릭한 횟수
//

//	Event Listener 예문

public class GUIProgramming2 extends JFrame {
	GUIProgramming2() {
		setTitle("JFrame");
		setSize(300,300);
		
		//컴포넌트 만들기
		JButton button = new JButton("button");
		JCheckBox box = new JCheckBox("checkbox");
		JSlider slide = new JSlider();
		JTextField tf = new JTextField("text 입력",20);
		//위치를 담당하는 레이아웃을 지정
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		//내 프로그램 닫는 기능을 닫기 버튼으로 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//버튼 컴포넌트에 액션이벤트 리스너 달기
		button.addActionListener(new Listener1());
	}
	public static void main(String[] args) {
		new GUIProgramming2();
		
	}
}
class Listener1 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource(); //이벤트 발생한 컴포넌트
		button.setText("버튼클릭"); //버튼 문자열 재지정
	}
}

