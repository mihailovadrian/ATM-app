package Proiect_SI;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.*;

public class Agent_A extends Agent {

	private static final long serialVersionUID = 1L;

	@Override
	protected void setup() {
		addBehaviour(new CyclicBehaviour(this) {

			private static final long serialVersionUID = 1L;

			@Override
			public void action() {

				ACLMessage msg = receive();
				if (msg != null) {
					String content = msg.getContent().toLowerCase();
					String answer;

					if (content.equals("luni")) {
						answer = "  Zi libera";
					}else if(content.equals("marti")){
						answer = "   8-11: MC \n 11-13: Laborator MC \n 13-15: TCR laborator \n 16-18: MM curs \n 18-20: SI laborator";
					}else if(content.equals("miercuri")){
						answer = " 14-16: Optimizari laborator \n 16-18: FD laborator";
					}else if(content.equals("joi")){
						answer = "   9-12: RIL curs \n 12-15: FD curs \n 16-19: SI curs";
					}else if(content.equals("vineri")){
						answer = "   8-11: TCR curs \n 11-14: Optimizari curs";
					}else if(content.equals("sambata")){
						answer = "\n   Zi libera";
					}else if(content.equals("duminica")){
						answer = "\n   Zi libera";
					}	
					else {
						answer = "\nZi incorecta";
					}

					ACLMessage reply = msg.createReply();
					reply.setPerformative(ACLMessage.INFORM);
					reply.setContent(answer);
					send(reply);
				}
				block();
			}
		});
	}
}
