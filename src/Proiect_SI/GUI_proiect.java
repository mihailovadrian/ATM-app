package Proiect_SI;

import jade.core.AID;
import jade.lang.acl.ACLMessage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.DropMode;



class GUI_proiect extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextField txtProiectsi;
	private JTextArea afisare;
	private JTextField optiune1;
	private static Supervisor agentie;
	private JTextField numeAg;
	private JTextField txtAgentaGr;
	private JTextField txtAgentbOrar;
	private JTextField txtAgentcOrar;


	GUI_proiect(Supervisor a) {
		
		super(a.getLocalName());
		getContentPane().setBackground(SystemColor.textHighlight);
		setTitle("Prj_SI");
		//BackgroundImageJFrame();
		agentie = a;

		//BackgroundImageJFrame();

		initialize();
	}
	

public void BackgroundImageJFrame() {

        setSize(200,400);
        setVisible(true);
        getContentPane().setLayout(null);

        JLabel background=new JLabel(new ImageIcon("images/38.jpg"));
        background.setBounds(0, 0, 0, 0);

        getContentPane().add(background);

        background.setLayout(new FlowLayout());
    }
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setResizable(false);
		getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 18));
		setBounds(100, 100, 186, 330);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		txtProiectsi = new JTextField();
		txtProiectsi.setBackground(new Color(0, 153, 255));
		txtProiectsi.setForeground(new Color(255, 255, 255));
		txtProiectsi.setEditable(false);
		txtProiectsi.setFont(new Font("Times New Roman", Font.BOLD, 21));
		txtProiectsi.setText("ORAR");
		txtProiectsi.setBounds(59, 0, 69, 25);
		txtProiectsi.setColumns(2);
		getContentPane().add(txtProiectsi);

		afisare = new JTextArea();
		afisare.setForeground(Color.BLACK);
		afisare.setBounds(10, 139, 161, 115);
		afisare.setColumns(10);
		getContentPane().add(afisare);

		final JButton buton = new JButton("Obtine ORAR");
		buton.setBackground(Color.LIGHT_GRAY);
		buton.addActionListener(new ActionListener() {
			
		
		public void actionPerformed(ActionEvent chose) {
				if (chose.getSource() == buton) {
					String lowerCase = optiune1.getText().toLowerCase();
					String caseLower =   numeAg.getText().toLowerCase();
			//*******************************************************************************
					
			//*******************************************************************************
				if(caseLower.equals("agent_a")){
					if (lowerCase.equals("")) {
						afisare.setText("\n Introdu o zi");
					} else if (lowerCase.equals("luni")) {
							
						afisare.setText("");
						ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
						msg.setContent(lowerCase);
						msg.addReceiver(new AID("Agent_A", AID.ISLOCALNAME));
						agentie.send(msg);

					} else if (lowerCase.equals("marti")) {
						
						afisare.setText("");
						ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
						msg.setContent(lowerCase);
						msg.addReceiver(new AID("Agent_A", AID.ISLOCALNAME));
						agentie.send(msg);

					}else if (lowerCase.equals("miercuri")) {
						
						afisare.setText("");
						ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
						msg.setContent(lowerCase);
						msg.addReceiver(new AID("Agent_A", AID.ISLOCALNAME));
						agentie.send(msg);

					}else if (lowerCase.equals("joi")) {
						
						afisare.setText("");
						ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
						msg.setContent(lowerCase);
						msg.addReceiver(new AID("Agent_A", AID.ISLOCALNAME));
						agentie.send(msg);

					}else if (lowerCase.equals("vineri")) {
						
						afisare.setText("");
						ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
						msg.setContent(lowerCase);
						msg.addReceiver(new AID("Agent_A", AID.ISLOCALNAME));
						agentie.send(msg);

					}else if (lowerCase.equals("sambata")) {
						
						afisare.setText("");
						ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
						msg.setContent(lowerCase);
						msg.addReceiver(new AID("Agent_A", AID.ISLOCALNAME));
						agentie.send(msg);

					}else if (lowerCase.equals("duminica")) {
						
						afisare.setText("");
						ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
						msg.setContent(lowerCase);
						msg.addReceiver(new AID("Agent_A", AID.ISLOCALNAME));
						agentie.send(msg);

					}else
						afisare.setText(" Zi incorecta");
				}
	//****************************************************************************************************
				else 
				if(caseLower.equals("agent_b")){
					if (lowerCase.equals("")) {
						afisare.setText("\n Introdu o zi");
					} else if (lowerCase.equals("luni")) {
							
						afisare.setText("");
						ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
						msgg.setContent(lowerCase);
						msgg.addReceiver(new AID("Agent_B", AID.ISLOCALNAME));
						agentie.send(msgg);

					} else if (lowerCase.equals("marti")) {
						
						afisare.setText("");
						ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
						msgg.setContent(lowerCase);
						msgg.addReceiver(new AID("Agent_B", AID.ISLOCALNAME));
						agentie.send(msgg);

					}else if (lowerCase.equals("miercuri")) {
						
						afisare.setText("");
						ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
						msgg.setContent(lowerCase);
						msgg.addReceiver(new AID("Agent_B", AID.ISLOCALNAME));
						agentie.send(msgg);

					}else if (lowerCase.equals("joi")) {
						
						afisare.setText("");
						ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
						msgg.setContent(lowerCase);
						msgg.addReceiver(new AID("Agent_B", AID.ISLOCALNAME));
						agentie.send(msgg);

					}else if (lowerCase.equals("vineri")) {
						
						afisare.setText("");
						ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
						msgg.setContent(lowerCase);
						msgg.addReceiver(new AID("Agent_B", AID.ISLOCALNAME));
						agentie.send(msgg);

					}else if (lowerCase.equals("sambata")) {
						
						afisare.setText("");
						ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
						msgg.setContent(lowerCase);
						msgg.addReceiver(new AID("Agent_B", AID.ISLOCALNAME));
						agentie.send(msgg);

					}else if (lowerCase.equals("duminica")) {
						
						afisare.setText("");
						ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
						msgg.setContent(lowerCase);
						msgg.addReceiver(new AID("Agent_B", AID.ISLOCALNAME));
						agentie.send(msgg);

					}else
						afisare.setText(" Zi incorecta");
				}
			//*********************************************************************************************
				else 
					if(caseLower.equals("agent_c")){
						if (lowerCase.equals("")) {
							afisare.setText("\n Introdu o zi");
						} else if (lowerCase.equals("luni")) {
								
							afisare.setText("");
							ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
							msgg.setContent(lowerCase);
							msgg.addReceiver(new AID("Agent_C", AID.ISLOCALNAME));
							agentie.send(msgg);

						} else if (lowerCase.equals("marti")) {
							
							afisare.setText("");
							ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
							msgg.setContent(lowerCase);
							msgg.addReceiver(new AID("Agent_C", AID.ISLOCALNAME));
							agentie.send(msgg);

						}else if (lowerCase.equals("miercuri")) {
							
							afisare.setText("");
							ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
							msgg.setContent(lowerCase);
							msgg.addReceiver(new AID("Agent_C", AID.ISLOCALNAME));
							agentie.send(msgg);

						}else if (lowerCase.equals("joi")) {
							
							afisare.setText("");
							ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
							msgg.setContent(lowerCase);
							msgg.addReceiver(new AID("Agent_C", AID.ISLOCALNAME));
							agentie.send(msgg);

						}else if (lowerCase.equals("vineri")) {
							
							afisare.setText("");
							ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
							msgg.setContent(lowerCase);
							msgg.addReceiver(new AID("Agent_C", AID.ISLOCALNAME));
							agentie.send(msgg);

						}else if (lowerCase.equals("sambata")) {
							
							afisare.setText("");
							ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
							msgg.setContent(lowerCase);
							msgg.addReceiver(new AID("Agent_C", AID.ISLOCALNAME));
							agentie.send(msgg);

						}else if (lowerCase.equals("duminica")) {
							
							afisare.setText("");
							ACLMessage msgg = new ACLMessage(ACLMessage.REQUEST);
							msgg.setContent(lowerCase);
							msgg.addReceiver(new AID("Agent_C", AID.ISLOCALNAME));
							agentie.send(msgg);

						}else
							afisare.setText(" Zi incorecta");
					}
			//*********************************************************************************************

				else
					afisare.setText(" Introdu numele agentului \n\t  agent_a,  \n\t  agent_b,  \n\t  agent_c");
			}
			}
		});
		buton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buton.setBounds(10, 265, 161, 25);
		getContentPane().add(buton);

		optiune1 = new JTextField();
		optiune1.setText("ziua");
		optiune1.setToolTipText("");
		optiune1.setBounds(10, 35, 79, 25);
		optiune1.setColumns(10);
		getContentPane().add(optiune1);
		
		numeAg = new JTextField();
		numeAg.setText("nume agent");
		numeAg.setColumns(10);
		numeAg.setBounds(92, 35, 79, 25);
		getContentPane().add(numeAg);
		
		txtAgentaGr = new JTextField();
		txtAgentaGr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAgentaGr.setEditable(false);
		txtAgentaGr.setText("Agent_A - orar grupa 3241");
		txtAgentaGr.setColumns(10);
		txtAgentaGr.setBounds(10, 70, 161, 20);
		getContentPane().add(txtAgentaGr);
		
		txtAgentbOrar = new JTextField();
		txtAgentbOrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAgentbOrar.setEditable(false);
		txtAgentbOrar.setText("Agent_B - orar grupa 3141a");
		txtAgentbOrar.setColumns(10);
		txtAgentbOrar.setBounds(10, 89, 161, 20);
		getContentPane().add(txtAgentbOrar);
		
		txtAgentcOrar = new JTextField();
		txtAgentcOrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAgentcOrar.setEditable(false);
		txtAgentcOrar.setText("Agent_C - orar grupa 3341a");
		txtAgentcOrar.setColumns(10);
		txtAgentcOrar.setBounds(10, 108, 161, 20);
		getContentPane().add(txtAgentcOrar);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				agentie.doDelete();
			}
		});

		setResizable(false);
	}

	public void showGui() {
		super.setVisible(true);
	}

	public void alertResponse(String s) {
		afisare.append("\n" + s);
	}
}
