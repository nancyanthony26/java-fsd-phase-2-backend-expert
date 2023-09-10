package travelling_ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

public class Travelling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	

	/**
	 * Create the application.
	 */
	public Travelling() {
		initialize();
	}
	
	static class Calender {

		public static Calendar getInstance() {
			// TODO Auto-generated method stub
			return null;
		}

		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(94, 11, 862, 63);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticketing System");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JLabel lblTicketType = new JLabel("Ticket Type");
		lblTicketType.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTicketType.setBounds(179, 85, 186, 29);
		frame.getContentPane().add(lblTicketType);
		
		final JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 21));
		rdbtnStandard.setBounds(24, 140, 141, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		final JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 21));
		rdbtnEconomy.setBounds(24, 173, 176, 41);
		frame.getContentPane().add(rdbtnEconomy);
		
		final JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 21));
		rdbtnFirstClass.setBounds(24, 225, 156, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		final JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 21));
		rdbtnSingleTicket.setBounds(200, 140, 165, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		final JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 21));
		rdbtnReturnTicket.setBounds(200, 179, 173, 28);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		final JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 21));
		rdbtnAdult.setBounds(375, 140, 109, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		final JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 21));
		rdbtnChild.setBounds(375, 179, 109, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 125, 460, 2);
		frame.getContentPane().add(separator);
		
		final JComboBox cmbDestination = new JComboBox();
		cmbDestination.setFont(new Font("Tahoma", Font.BOLD, 21));
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Kilburn", "Preston", "Oxford", "Leed"}));
		cmbDestination.setBounds(210, 225, 233, 23);
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 261, 460, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTax.setBounds(24, 299, 75, 23);
		frame.getContentPane().add(lblTax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTotal.setBounds(24, 414, 75, 23);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSubtotal.setBounds(24, 354, 101, 31);
		frame.getContentPane().add(lblSubtotal);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtTax.setBounds(158, 285, 285, 41);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.addMouseListener(new MouseAdapter() {
			
		});
		txtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtSubTotal.setBounds(158, 344, 285, 41);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 21));
		txtTotal.setBounds(158, 408, 285, 40);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double tax =19.50;
				double MilesK8 = 25.78;
				double MilesK12 = 25.10;
				double MilesK20 = 45.23;
				double MilesK30 = 55.98;
				double totalCost, eco =3.85, fclass = 5.60;
				
				if ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected()) 
						&& cmbDestination.getSelectedItem().equals("Kilburn"))
						{
			               totalCost = (tax + MilesK8) / 100;
			               String sTax = String.format("£%.2f",totalCost);
			               txtTax.setText(sTax);
			               String subTotal = String.format("£%.2f", MilesK8);
			               txtSubTotal.setText(subTotal);
			               String Total = String.format("£%.2f", MilesK8 + totalCost);
			               txtTotal.setText(Total);
			               txtPrice.setText(Total);
			               txtClass.setText("STD");
			               txtTicket.setText("ONE WAY");
			               txtAdult.setText("ONE");
			               txtChild.setText("Nil");
			          
						}
				elseif ((rdbtnStandard.isSelected()) && (rdbtnSingleTicket.isSelected()) && (rdbtnAdult.isSelected())
						&& cmbDestination.getSelectedItem().equals("Kilburn"));
						{
					 totalCost = (tax + MilesK8 + 2) / 100;
		               String sTax = String.format("£%.2f",totalCost);
		               txtTax.setText(sTax);
		               String subTotal = String.format("£%.2f", MilesK8);
		               txtSubTotal.setText(subTotal);
		               String Total = String.format("£%.2f", MilesK8 + totalCost);
		               txtTotal.setText(Total);
		               txtPrice.setText(Total);
		               txtClass.setText("STD");
		               txtTicket.setText("Return");
		               txtAdult.setText("ONE");
		               txtChild.setText("Nil");
						}
			}
		});
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//=================Time=========================//
				
				Calendar timer = Calender.getInstance();
				timer.getTime();
				SimpleTimeFormat Ttime = new SimpleTimeFormat("HH:MM:SS");
				txtTime.setText(Ttime.format(timer.getTime()));
				//================ Date========================//
				SimpleDateFormat Tdate = new SimpleDateFormat("dd:MM:YYYY");
				txtDate.setText(Tdate.format(timer.getTime()));
				
				txtFrom.setText("London");
				txtTo.setText((String)  cmbDestination.getSelectedItem()+ "*");
				//==============Random Number Generator =============//
				int num1;
				String q1 ="";
				num1 = 1325 + (int) (Math.random()*4238);
				q1 += num1 + 1325;
				txtTicketNo.setText(q1);
				//====================================================//
				txtRoute.setText("ANY");
				
				
				
			}
		});
		
		btnTotal.setToolTipText("Total Cost of Ticket");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnTotal.setBounds(24, 472, 101, 31);
		frame.getContentPane().add(btnTotal);
		
		JButton jButton = new JButton();
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
			    cmbDestination.setSelectedItem("Destination");
			    rdbtnSingleTicket.setSelected(false);
			    rdbtnReturnTicket.setSelected(false);
			    txtTo.setText(null);
			    txtFrom.setText(null);
			    txtDate.setText(null);
			    txtTime.setText(null);
			    txtPrice.setText(null);
			    txtRoute.setText(null);
			    txtChild.setText(null);
			    txtClass.setText(null);
			    txtTicketNo.setText(null);
			    txtAdult.setText(null);
			    txtTicket.setText(null);
			    
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnReset.setBounds(187, 472, 129, 31);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Ticketing System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnExit.setBounds(371, 472, 94, 31);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 459, 460, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(490, 131, 2, 372);
		frame.getContentPane().add(separator_3);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblClass.setBounds(512, 148, 101, 31);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTicket.setBounds(633, 148, 101, 31);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblAdult.setBounds(767, 148, 101, 31);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblChild.setBounds(888, 148, 101, 31);
		frame.getContentPane().add(lblChild);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(502, 190, 487, 2);
		frame.getContentPane().add(separator_4);
		
		txtClass = new JTextField();
		txtClass.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtClass.setBounds(502, 215, 101, 33);
		frame.getContentPane().add(txtClass);
		txtClass.setColumns(10);
		
		txtTicket = new JTextField();
		txtTicket.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtTicket.setBounds(626, 215, 108, 31);
		frame.getContentPane().add(txtTicket);
		txtTicket.setColumns(10);
		
		txtAdult = new JTextField();
		txtAdult.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtAdult.setBounds(767, 215, 101, 31);
		frame.getContentPane().add(txtAdult);
		txtAdult.setColumns(10);
		
		txtChild = new JTextField();
		txtChild.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtChild.setBounds(903, 215, 94, 33);
		frame.getContentPane().add(txtChild);
		txtChild.setColumns(10);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setBounds(502, 261, 487, 2);
		frame.getContentPane().add(separator_4_1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblFrom.setBounds(512, 295, 101, 31);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTo.setBounds(512, 354, 101, 31);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblDate.setBounds(512, 410, 101, 31);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTime.setBounds(512, 472, 101, 31);
		frame.getContentPane().add(lblTime);
		
		txtFrom = new JTextField();
		txtFrom.setText("     London");
		txtFrom.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtFrom.setBounds(633, 294, 154, 29);
		frame.getContentPane().add(txtFrom);
		txtFrom.setColumns(10);
		
		txtTo = new JTextField();
		txtTo.setText("     Kilburn");
		txtTo.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtTo.setBounds(633, 352, 154, 31);
		frame.getContentPane().add(txtTo);
		txtTo.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setText("  10-Sep-2023");
		txtDate.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtDate.setBounds(633, 409, 172, 29);
		frame.getContentPane().add(txtDate);
		txtDate.setColumns(10);
		
		txtTime = new JTextField();
		txtTime.setText("   16:17:21");
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtTime.setBounds(633, 472, 154, 31);
		frame.getContentPane().add(txtTime);
		txtTime.setColumns(10);
		
		JSeparator separator_4_1_1 = new JSeparator();
		separator_4_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_4_1_1.setBounds(646, 382, 487, 2);
		frame.getContentPane().add(separator_4_1_1);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setBounds(815, 273, 2, 230);
		frame.getContentPane().add(separator_3_1);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setLabelFor(lblTicketNo);
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTicketNo.setBounds(855, 295, 101, 31);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblPrice.setBounds(855, 363, 101, 31);
		frame.getContentPane().add(lblPrice);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setText("    4857");
		txtTicketNo.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(855, 326, 116, 34);
		frame.getContentPane().add(txtTicketNo);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtPrice.setColumns(10);
		txtPrice.setBounds(855, 399, 116, 29);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setText("     ANY");
		txtRoute.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtRoute.setColumns(10);
		txtRoute.setBounds(855, 481, 116, 29);
		frame.getContentPane().add(txtRoute);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblRoute.setBounds(855, 439, 101, 31);
		frame.getContentPane().add(lblRoute);
		
		JSeparator separator_3_1_1 = new JSeparator();
		separator_3_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1_1.setBounds(1021, 148, 2, 362);
		frame.getContentPane().add(separator_3_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(24, 535, 999, 8);
		frame.getContentPane().add(separator_1_1);
	}

	protected void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
