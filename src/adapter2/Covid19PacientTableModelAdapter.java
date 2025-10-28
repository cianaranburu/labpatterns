package adapter2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;
import iterator.Covid19PacientIterator;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	protected Covid19Pacient pacient;
	protected String[] columnNames = new String[] { "Symptom", "Weight" };

	public Covid19PacientTableModelAdapter(Covid19Pacient p) {
		this.pacient = p;
	}

	public int getColumnCount() {
		// Challenge!
		return 2;
	}

	public String getColumnName(int i) {
		return columnNames[i];
	}

	public int getRowCount() {
		return pacient.getSymptoms().size();
	}

	public Object getValueAt(int row, int col) {
		Covid19PacientIterator it = (Covid19PacientIterator) pacient.iterator();
		ArrayList<Symptom> symptomList= new ArrayList<Symptom>();
		while (it.hasNext()) {
			symptomList.add((Symptom) it.next());
			
		}
		
		if (col == 0) {
			return symptomList.get(row).getName();
		} else if (col==1) {
			return pacient.getWeight(symptomList.get(row));
		}
		return null;
	}
}
