package Proiect_SI;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class Supervisor extends Agent {

	private static final long serialVersionUID = 1L;
	transient protected GUI_proiect myGui;

	@Override
	protected void setup() {
		
		myGui = new GUI_proiect(this);
		myGui.showGui();
		addBehaviour(new ReceiveResponse(this));
	}

	@Override
	protected void takeDown() {

	}

	class ReceiveResponse extends CyclicBehaviour {

		private static final long serialVersionUID = 1L;

		ReceiveResponse(Supervisor a) {
			super(a);
		}

		@Override
		public void action() {

			ACLMessage msg = receive();

			if (msg == null) {
				block();
				return;
			}else {
				if (msg.getSender().getLocalName().equals("Agent_A") || msg.getSender().getLocalName().equals("Agent_B") || msg.getSender().getLocalName().equals("Agent_C"))
				{
						if (msg.getPerformative() == ACLMessage.INFORM) {
								myGui.alertResponse(msg.getContent());
						} else {
							myGui.alertResponse("Mesaj refuzat");
						}
			}
			}
			
		}
	}
}
