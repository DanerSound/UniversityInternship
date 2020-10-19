package finestra;

import java.io.IOException;
import javax.swing.JOptionPane;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import java.net.UnknownHostException;
import java.util.UUID;

public class Finestra extends javax.swing.JFrame {

	public static MqttAsyncClient clientView;
	boolean lock = true;
	public static Message rcved;
	public Callback callback;
	private String ip;
	private String topic;
	private int port;

	public Finestra() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		ipBroker = new javax.swing.JTextField();
		connButton = new javax.swing.JButton();
		disconButton = new javax.swing.JButton();
		closeButton = new javax.swing.JButton();
		listValues = new java.awt.List();
		jLabel2 = new javax.swing.JLabel();
		portBroker = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		topicBroker = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Controllo Valori");
		setResizable(false);

		jLabel1.setText("Indirizzo IP:");

		connButton.setText("Collegati!");
		connButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				try {
					connButtonMouseClicked(evt);
				} catch (MqttException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		disconButton.setText("Scollegati!");
		disconButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				try {
					disconButtonMouseClicked(evt);
				} catch (MqttException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		closeButton.setText("Chiudi");
		closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				try {
					closeButtonMouseClicked(evt);
				} catch (MqttException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel2.setText("Porta:");

		jLabel3.setText("Topic:");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(ipBroker).addComponent(portBroker).addComponent(topicBroker,
												javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
						.addComponent(listValues, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(disconButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(connButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addContainerGap(21, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
						.addComponent(ipBroker, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(connButton))
				.addGap(7, 7, 7)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(portBroker, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3)
						.addComponent(topicBroker, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(12, 12, 12)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
								.addComponent(disconButton).addGap(18, 18, 18).addComponent(closeButton))
						.addComponent(listValues, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
				.addGap(43, 43, 43)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void connButtonMouseClicked(java.awt.event.MouseEvent evt) throws MqttException {
		if (lock == true) {
			if (ipBroker.getText().isEmpty()) {
			} else {
				ipBroker.setEditable(false);
				connButton.setEnabled(false);
				portBroker.setEditable(false);
				topicBroker.setEditable(false);
				lock = false;
				try {
					setConnection();
					startsReceiving();

				} catch (UnknownHostException ex) {
					JOptionPane.showMessageDialog(this, "Indirizzo al momento Non disponibile", "ATTENZIONE!",
							JOptionPane.WARNING_MESSAGE);
					dispose();
				} catch (IOException ex) {
					System.err.println("NON RIESCO A STAMPARE");
				}
			}
		}
	}// GEN-LAST:event_connButtonMouseClicked

	private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) throws MqttException {// GEN-FIRST:event_closeButtonMouseClicked
		if (lock) {
			dispose();
		} else {
			clientView.disconnect();
			dispose();
		}
	}// GEN-LAST:event_closeButtonMouseClicked

	private void disconButtonMouseClicked(java.awt.event.MouseEvent evt) throws MqttException {// GEN-FIRST:event_disconButtonMouseClicked
		if (connButton.isEnabled()) {
		} else {
			ipBroker.setEditable(true);
			portBroker.setEditable(true);
			topicBroker.setEditable(true);
			connButton.setEnabled(true);
			lock = true;
			clientView.disconnect();
			listValues.add("Conessione Terminata");
		}
	}// GEN-LAST:event_disconButtonMouseClicked

	private void setConnection() throws IOException, MqttException {
		setIp(ipBroker.getText().trim());
		setPort(Integer.parseInt(portBroker.getText()));
		setTopic(topicBroker.getText().trim());
		String connectTo = "tcp://" + getIp() + ":" + getPort();
		clientView = new MqttAsyncClient(connectTo, UUID.randomUUID().toString());

	}

	private void startsReceiving() throws MqttSecurityException, MqttException {
		rcved = new Message();
		callback = new Callback(rcved);
		clientView.setCallback(callback);
		IMqttToken tokenClient = clientView.connect();
		tokenClient.waitForCompletion();
		listValues.add(" Connesso - Topic:" + getTopic());
		clientView.subscribe(getTopic(), 0);

	}

	public static void appendMessage(String msg) {
		listValues.add(rcved.getMessage());
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		java.awt.EventQueue.invokeLater(() -> {
			new Finestra().setVisible(true);

		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton closeButton;
	private javax.swing.JButton connButton;
	private javax.swing.JButton disconButton;
	private javax.swing.JTextField ipBroker;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	public static java.awt.List listValues;
	private javax.swing.JTextField portBroker;
	private javax.swing.JTextField topicBroker;
	// End of variables declaration//GEN-END:variables

}
