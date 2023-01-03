package org.java_mentorseries.day13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

//	- 리스너 인터페이스: MouseMotionListener
//	- 추상메서드
//		void mouseDragged(MouseEvent e): 마우스가 드래그 될 때
//		void mouseMoved(MouseEvent e): 마우스가 움직일 때
//
//	마우스 이벤트 발생 시 얻을 수 있는 정보 메서드
//	 int getX(): 현재 마우스 포인터의 X좌표
//	 int getY(): 현재 마우스 포인터의 Y좌표
//	 short getButton(): 현재 클릭한 버튼(왼쪽,오른쪽)
//	 int getClickCount(): 마우스를 클릭한 횟수
//
//	 ■ Menu 만들기
//	  1) JMenuBar 객체 생성
//	  2) JMenu 생성
//	  3) JMenuItem 생성
//	  4) JMenu에 JMenuItem 추가
//	  5) JMenuBar에 JMenu 추가
//	  6) 현재 프레임에 메뉴바를 생성한 JMenuBar 객체로 지정
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//






//	Mouse 이벤트처리 예문

//public class GUIProgramming3 extends JFrame {
//	JPanel Jp = new JPanel();
//	JLabel la;
//	GUIProgramming3() {
//		setTitle("mouse 이벤트 창");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setContentPane(Jp);
//		Jp.addMouseListener(new MouseListener1());
//		Jp.addMouseMotionListener(new MouseListener1());
//		la = new JLabel("마우스를 올려보세요!");
//		Jp.add(la);
//		setSize(300,300);
//		setVisible(true);
//		
//	}
//	class MouseListener1 implements MouseListener,MouseMotionListener {
//
//		@Override
//		public void mouseDragged(MouseEvent e) {
//			la.setText("Mouse Dragged ("+e.getX()+","+e.getY()+")");
//		}
//
//		@Override
//		public void mouseMoved(MouseEvent e) {
//			la.setText("Mouse Moved ("+e.getX()+","+e.getY()+")");
//		}
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//				la.setText("마우스 클릭횟수: "+e.getClickCount());
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			JPanel p = (JPanel)e.getSource();
//			p.setBackground(Color.RED); //판의 배경을 레드로 설정
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			JPanel p = (JPanel)e.getSource();
//			p.setBackground(Color.YELLOW); //판의 배경을 옐로우로 설정
//		}
//	}
//	
//	public static void main(String[] args) {
//			new GUIProgramming3();

//	Menu 만들기 예문

//class MenuActionListener implements ActionListener {
////	@Override
////	public void actionPerformed(ActionEvent e) {
////			JOptionPane.showMessageDialog(null, "팝업"); //간단한 알림창
////	}}
	
public class GUIProgramming3 extends JFrame {
	GUIProgramming3() {
		setTitle("Menu 만들기");
		creatMenu();
		setSize(250,200);
		setVisible(true);
	}
	public void creatMenu() {
		//메뉴바 생성
		JMenuBar mb = new JMenuBar();
		//메뉴 생성
		JMenu screenMenu = new JMenu("메뉴바1");
		
		//메뉴에 부착할 아이템 형성
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator(); //구분선
		screenMenu.add(new JMenuItem("Exit"));
		
		//메뉴아이템 객체 만들어서 메뉴 붙이기
		JMenuItem item = new JMenuItem("팝업");
		//※이벤트 처리는 1회성으로 구현 하는 경우가 많으므로 익명클래스를 만들어서 오버라이딩
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "팝업"); //간단한 알림창
	}});
		screenMenu.add(item);
		
		//메뉴바에 메뉴 부착
		mb.add(screenMenu);
		mb.add(new JMenu("편집"));
		mb.add(new JMenu("실행"));
		mb.add(new JMenu("도움말"));
	
		//메뉴바를 현재 프레임의 메뉴로 지정
		setJMenuBar(mb);
	}
	
	
	public static void main(String[] args) {
			new GUIProgramming3();
	
	}

}
