package Proiect_SI;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Agent_B extends Agent {

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
						answer = "\n   8-10: IP laborator \n 10-12: SI laborator \n 12-14: PAIg laborator";
					}else if(content.equals("marti")){
						answer = " \n 8-11: MC curs \n 11-14: PAIg curs \n 16-18: MM curs";
					}else if(content.equals("miercuri")){
						answer = "  \n  8-10: MC laborator \n 10-12: PBD laborator \n 12-14 PAIg proiect";
					}else if(content.equals("joi")){
						answer = " \n   8-11: PBD curs \n 11-14: IP curs \n 16-19: SI curs";
					}else if(content.equals("vineri")){
						answer = " \n   10-12: Educatie Fizica";
					}else if(content.equals("sambata")){
						answer = " \n   zi libera";
					}else if(content.equals("duminica")){
						answer = " \n   zi libera";
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
