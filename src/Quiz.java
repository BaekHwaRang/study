
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.*;
import javax.swing.*;
public class Quiz {

	public static void main(String[] args)
	{
		MyPuzzle pz = new MyPuzzle();
		pz.display();
	}

}


class MyPuzzle extends JFrame implements ActionListener
{
	
	JButton btn[] = new JButton[9]; // 버튼
	JButton reset = new JButton("Reset");
	JPanel jp; // 패널
	Font f = new Font("굴림체",Font.BOLD,30); // 폰트
	Color color =new Color(255,255,0); // 컬러
	Image image[] = new Image[9];
	
	 MyPuzzle()
	{
		
		jp = new JPanel(new GridLayout(3,3,5,5));
		for(int i=0;i<9;i++)
		{
			btn[i]=new JButton(""+(i+1));
			
			
			btn[i].setFont(f);
			btn[i].setForeground(Color.blue);
			btn[i].setBackground(color);
			btn[i].addActionListener(this);
			jp.add(btn[i]);
			
		}
		btn[8].setText("");
	
		reset.setFont(f);
		reset.setForeground(color);
		reset.setBackground(Color.blue);
		reset.addActionListener(this);
		int u[]=MyPuzzle.makeRnum();
		for(int i=0;i<8;i++) {
			btn[i].setText(""+u[i]);
		}
		btn[8].setText("");
	}
	
	void display()
	{
		add(jp,BorderLayout.CENTER);
		add(reset,BorderLayout.SOUTH);
		setTitle("쉬어가기");
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	int count=0;
	@Override
	public void actionPerformed(ActionEvent e) {
	try {
	int arrCount=0;
		for(int i=0;i<9;i++) {
	         if(e.getSource()==btn[i]) {
	            if((i-1)>=0 && (i-1)!=2 && (i-1)!=5 && btn[i-1].getText().equals("")) {
	               btn[i-1].setText(btn[i].getText());
	               btn[i].setText("");
	               count++;
	            }
	            else if((i+1)%3!=0 && btn[i+1].getText().equals("")){
	               btn[i+1].setText(btn[i].getText());
	               btn[i].setText("");
	               count++;
	            }
	            else if(i-3>=0 && btn[i-3].getText().equals("")) {
	               btn[i-3].setText(btn[i].getText());
	               btn[i].setText("");
	               count++;
	            }
	            else if(i+3<9 && btn[i+3].getText().equals("")) {
	               btn[i+3].setText(btn[i].getText());
	               btn[i].setText("");
	               count++;
	            }
	            for(int j=0;j<9;j++)
	            {
	            	if(j+1==Integer.parseInt(btn[j].getText()))
	            	{
	            		arrCount++;
	            	}
	            	if(arrCount==8)
	            	{
	            		Input in = new Input(count);
	            	}
	            }
	            arrCount=0;
	         }
	      }}catch(Exception ex) {};
	
		if(e.getSource()==reset)
		{
			/*for(int i=0;i<8;i++)
			{
				btn[i].setText(""+(i+1));
			}
			btn[8].setText("");*/
			int u[]=MyPuzzle.makeRnum();
			for(int i=0;i<8;i++) {
				btn[i].setText(""+u[i]);
			}
			btn[8].setText("");
		}
	}
	static int [] makeRnum()
	{
		Random r = new Random();
		int result[] = new int[9];
		int x=0;
		for(int i=0;i<8;i++)
		{
			result[i]=r.nextInt(8)+1;
			for(int k=0;k<i;k++)
			{
				if(result[i]==result[k])
				{	
					x=r.nextInt(8)+1;
					result[i]=x;
					i--;
					break;
				}
				
			}
		}
		return result;
	}
}