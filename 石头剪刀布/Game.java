import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import java.awt.CardLayout;

import javax.lang.model.type.NullType;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Game extends JFrame {

	private JPanel contentPane;
	private JTextField jieguo;
	private JLabel title3;
	private JButton choose;
	private JButton shitou;
	private JTextField compter;
	private JTextField you;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game() {
		setTitle("石头剪刀布");
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		contentPane.add(panel, BorderLayout.CENTER);
		
		shitou = new JButton("石头");
		shitou.addMouseListener(new MouseAdapter() {
				
			public void mouseClicked(MouseEvent e) {
			  	you.setText("");
			  	you.setText("石头");
			}
		});
		shitou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton jiandao = new JButton("剪刀");
		jiandao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jiandao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				you.setText("");
			  	you.setText("剪刀");
			}
		});
		
		JButton bu = new JButton("布");
		bu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				you.setText("");
			  	you.setText("布");
			}
		});
		bu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel title1 = new JLabel("请选择：");
		
		JLabel title2 = new JLabel("你的选择是：");
		
		title3 = new JLabel("电脑选择是：");
		
		jieguo = new JTextField();
		jieguo.setEditable(false);
		jieguo.setColumns(10);
		
		choose = new JButton("确定");
		choose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		choose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String cc;
				cc=you.getText();//获取值
				String[] dd={"石头","剪刀","布","石头","剪刀","布","石头","剪刀","布"};//电脑的
				Random rand = new Random();
				int num = rand.nextInt(3);
			   compter.setText(dd[num]);
			   String ee;
			   ee=compter.getText();//cc为随机值
		     if(cc.equals("石头")){
		    	 if(ee.equals("石头"))
		    		 jieguo.setText("平局");
		    	 if(ee.equals("剪刀"))
		    		 jieguo.setText("你赢了");
		    	 if(ee.equals("布"))
		    		 jieguo.setText("你输了");
		     }
		     if(cc.equals("剪刀")){
		    	 if(ee.equals("石头"))
		    		 jieguo.setText("你输了");
		    	 if(ee.equals("剪刀"))
		    		 jieguo.setText("平局");
		    	 if(ee.equals("布"))
		    		 jieguo.setText("你赢了");
		     }
		     if(cc.equals("布")){
		    	 if(ee.equals("石头"))
		    		 jieguo.setText("你赢了");
		    	 if(ee.equals("剪刀"))
		    		 jieguo.setText("你输了");
		    	 if(ee.equals("布"))
		    		 jieguo.setText("平局");
		     }
             

			}			
		});
		
		you = new JTextField();
		you.setEditable(false);
		you.setColumns(10);
		
		compter = new JTextField();
		compter.setEditable(false);
		compter.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(29, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(title1)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(title2)
								.addComponent(title3))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(jieguo, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(compter, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(you, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(shitou, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(27)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(jiandao)
									.addGap(28)
									.addComponent(bu))
								.addComponent(choose, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
					.addGap(26))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(title1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(shitou)
						.addComponent(jiandao)
						.addComponent(bu))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(title2)
								.addComponent(you, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(title3)
								.addComponent(compter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(31)
							.addComponent(jieguo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(53)
							.addComponent(choose, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addGap(21))
		);
		panel.setLayout(gl_panel);
	}
}
