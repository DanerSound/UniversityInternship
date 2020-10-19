package finestra;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Callback implements MqttCallback{
	
	private Message viwer;

	public Callback(Message message) {
		this.viwer = message;
	}
	
	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {
		String msg = "TOPIC:"+ topic + " MESSG:"+ message;
		System.out.println(msg);
		viwer.setMessage(msg);
		Finestra.appendMessage(msg);
		
	}

	@Override
	public void connectionLost(Throwable cause) {		
		
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
				
	}

}
