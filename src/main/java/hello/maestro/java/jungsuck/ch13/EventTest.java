import java.awt.*;
import java.awt.event.*;

class EventTest {
	static int i = 0; // 이벤트가 발생했을 때 호출되는 메서드의 번호에 사용.

	static void print(String event, AWTEvent e) {
		System.out.println("["+ ++i + "] "+ event +" - " + e.getSource());	
	}

	public static void main(String[] args) 
	{	
		Frame f = new Frame("Event Test");
		f.setLayout(new FlowLayout());		
		f.setSize(500, 300);
		f.setLocation(200, 200);

		Button button = new Button("Button");
		Checkbox cb = new Checkbox("Option");
		Canvas can = new Canvas();
		can.setSize(50, 50);
		can.setBackground(Color.blue);
		Choice choice = new Choice();
		choice.add("SUN");
		choice.add("MON");
		choice.add("TUE");
		Panel panel = new Panel();
		Label label = new Label("Label");
		List list = new List();
		list.add("Student");
		list.add("Teacher");
		list.add("Engineer");
		list.add("Programmer");
		Scrollbar scroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
		TextArea ta = new TextArea(10, 40);
		TextField tf = new TextField(10);
		
		f.add(button);		f.add(cb);			f.add(can);
		f.add(choice);		f.add(panel);		f.add(label);
		f.add(list);	 	f.add(scroll);		f.add(ta);			f.add(tf);

		/*------------------------------------------------------------------------------*/
		/* Frame에 메뉴를 추가한다.                                                     */
		/* Menu와 MenuItem은 Event23클래스를 사용하지 않고, Anonymous클래스로 처리했다. */
		/*------------------------------------------------------------------------------*/
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");

		MenuItem miNew = new MenuItem("New");
		mFile.add(miNew);							// Menu에서는 어떤 이벤트도 발생하지 않는다.
		miNew.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) { 
					print("actionPerformed", e);
				}
		});

		mb.add(mFile);
		f.setMenuBar(mb);	
		/*------------------------------------------------------------------------------*/
		/* Frame에 포함된 Component들에 Listener를 등록한다.                            */
		/*------------------------------------------------------------------------------*/
		Component[]  c = f.getComponents();	//	Frame에 포함된 Component의 목록을 얻는다.
		for(int i =0; i < c.length; i++) {
			addAllListener(c[i]);			//	Frame에 포함된 Component에 Listener를 추가한다.
		}
		addAllListener(f);					//	Frame자신에 Listener를 추가한다.
		f.setVisible(true);
	}	// end of main method

	static void addAllListener(Component c) {
		// 모든 종류의 Event Listener Interface들을 모두 구현한 클래스.
		// Event가 발생하면, 호출된 메서드의 이름과 EventSource에 대한 정보를 출력하도록 했다.

		class EventHandler
		implements ActionListener, AdjustmentListener, ComponentListener, ContainerListener
				 , FocusListener, ItemListener, KeyListener, MouseListener
				 , MouseMotionListener, MouseWheelListener, TextListener
				 , WindowFocusListener, WindowListener, WindowStateListener
		{
			// ActionListener의 메서드
			public void actionPerformed(ActionEvent e)  { print("actionPerformed",e);}
			// AdjustmentListener의 메서드
			public void adjustmentValueChanged(AdjustmentEvent e)  { print("adjustmentValueChanged",e);}
			// ComponentListener의 메서드
			public void componentResized(ComponentEvent e)  { print("componentResized",e);}
			public void componentMoved(ComponentEvent e)  { print("componentMoved",e);}
			public void componentShown(ComponentEvent e) { print("componentShown",e);}
			public void componentHidden(ComponentEvent e) { print("componentHidden",e);}
			// ContainerListener의 메서드
			public void componentAdded(ContainerEvent e) { print("componentAdded",e);}
			public void componentRemoved(ContainerEvent e)  { print("componentRemoved",e);}
			// FocusListener의 메서드
			public void focusGained(FocusEvent e)  { print("focusGained",e);}
			public void focusLost(FocusEvent e)  { print("focusLost",e);}
			// ItemListener의 메서드
			public void itemStateChanged(ItemEvent e)  { print("itemStateChanged",e);}
			// KeyListener의 메서드
			public void keyTyped(KeyEvent e)  { print("keyTyped",e);}
			public void keyPressed(KeyEvent e)  { print("keyPressed",e);}
			public void keyReleased(KeyEvent e)  { print("keyReleased",e);}
			// MouseListener의 메서드
			public void mouseClicked(MouseEvent e)  { print("mouseClicked",e);}
			public void mousePressed(MouseEvent e)  { print("mousePressed",e);}
			public void mouseReleased(MouseEvent e)	 { print("mouseReleased",e);}
			public void mouseEntered(MouseEvent e)  { print("mouseEntered",e);}
			public void mouseExited(MouseEvent e) { print("mouseExited",e);}
			// MouseMotionListener의 메서드
			public void mouseDragged(MouseEvent e) { print("mouseDragged",e);}
			public void mouseMoved(MouseEvent e) { 
				//print("mouseMoved",e);
			}
			// MouseWheelListener의 메서드(JDK1.4부터추가)
			public void mouseWheelMoved(MouseWheelEvent e) { print("mouseWheelMoved",e);}
			// TextListener의 메서드
			public void textValueChanged(TextEvent e) { print("textValueChanged",e);}
			// WindowFocusListener의 메서드(JDK1.4부터추가)
			public void windowGainedFocus(WindowEvent e) { print("windowGainedFocus",e);}
			public void windowLostFocus(WindowEvent e) { print("windowLostFocus",e);}
			// WindowListener의 메서드
			public void windowOpened(WindowEvent e) { print("windowOpened",e);}
			public void windowClosing(WindowEvent e) {
				print("windowClosing",e);
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
			public void windowClosed(WindowEvent e)  { print("windowClosed",e);}
			public void windowIconified(WindowEvent e) { print("windowIconified",e);}
			public void windowDeiconified(WindowEvent e) { print("windowDeiconified",e);}
			public void windowActivated(WindowEvent e) { print("windowActivated",e);}
			public void windowDeactivated(WindowEvent e) { print("windowDeactivated",e);}
			// WindowStateListener의 메서드(JDK1.4부터추가)
			public void windowStateChanged(WindowEvent e) { print("windowStateChanged",e);}

		} // End of EventHandler class

		EventHandler handler = new EventHandler();

		// 모든 Component에 공통적으로 추가가능한 Listener들
		c.addComponentListener(handler);
		c.addFocusListener(handler);
		c.addKeyListener(handler);
		c.addMouseListener(handler);
		c.addMouseMotionListener(handler);
		c.addMouseWheelListener(handler);

		// Component의 종류에 따라 추가가능한 Listener가 다르기 때문에, Component의 종류를 확인한 후에
		// 추가가능한 Listener를 선택적으로 추가한다.
		if (c instanceof Container)		{
			((Container)c).addContainerListener(handler);
			if(c instanceof Frame) {
				Frame f = (Frame)c;
				f.addWindowListener(handler);
				f.addWindowFocusListener(handler);
				((Frame)c).addWindowStateListener(handler);			
			} else if (c instanceof Window) {
				Window w = (Window)c;
				w.addWindowFocusListener(handler);			
				w.addWindowListener(handler);			
				w.addWindowStateListener(handler);			
			}			
		} else if (c instanceof Button)	{		((Button)c).addActionListener(handler);
//		} else if (c instanceof Canvas)	{		// 따로 추가해줄 Listener가 없다.
		} else if (c instanceof Checkbox)	{	((Checkbox)c).addItemListener(handler);
		} else if (c instanceof Choice)	{		((Choice)c).addItemListener(handler);
//		} else if (c instanceof Label)		{	// 따로 추가해줄 Listener가 없다.
		} else if (c instanceof List)		{
			((List)c).addActionListener(handler);
			((List)c).addItemListener(handler);
		} else if (c instanceof Scrollbar)	{	((Scrollbar)c).addAdjustmentListener(handler);
		} else if (c instanceof TextArea)	{	((TextArea)c).addTextListener(handler);
		} else if (c instanceof TextField) {
			TextField tf = (TextField)c;
			tf.addActionListener(handler);
			tf.addTextListener(handler);
		}
	}	// End of addAllListener method
} // End of EventTest class