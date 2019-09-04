package Proiect_SI;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Agent_C extends Agent {

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
						answer = "\n   8-11:  EM curs \n 11-14: SIE curs \n 16-18: EM laborator";
					}else if(content.equals("marti")){
						answer = " \n 8-11:   MC curs \n 11-14: SUP curs \n 16-18: MM curs \n 18-20: MC proiect";
					}else if(content.equals("miercuri")){
						answer = "  \n  10-10: SUP laborator \n 16-19: RC curs";
					}else if(content.equals("joi")){
						answer = " \n  14-16: RC laborator \n 16-18: MC laborator \n 16-19: SI curs";
					}else if(content.equals("vineri")){
						answer = " \n   14-16: SIE laborator";
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
