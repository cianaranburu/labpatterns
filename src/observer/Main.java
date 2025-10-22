package observer;

import java.util.Observable;

import domain.Covid19Pacient;
//import factory.PacientSymptomGUI;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35);
		new PacientObserverGUI(p1);
		new PacientSymptomGUI(p1);
		new PacientThermometerGUI(p1);
		new SemaphorGUI(p1);
		Covid19Pacient p2=new Covid19Pacient("Juan", 55);
		new PacientObserverGUI(p2);
		new PacientSymptomGUI(p2);
		new PacientThermometerGUI(p2);
		new SemaphorGUI(p2);
		Covid19Pacient p3=new Covid19Pacient("pello", 66);
		new PacientObserverGUI(p3);
		new PacientSymptomGUI(p3);
		new PacientThermometerGUI(p3);
		new SemaphorGUI(p3);
	}


}
