package adapter2;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35);
		Covid19Pacient p2 = new Covid19Pacient("mikel", 25);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		p2.addSymptomByName("disnea", 1);
		p2.addSymptomByName("cefalea", 3);
		
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		gui.setPreferredSize(
			      new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		
		ShowPacientTableGUI gui2 = new ShowPacientTableGUI(p2);
		gui2.setPreferredSize(
				new java.awt.Dimension(300, 200));
		gui2.setVisible(true);


	}

}
