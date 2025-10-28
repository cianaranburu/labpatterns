package iterator;

import java.util.ArrayList;
import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator{

	
	ArrayList<Symptom> symptoms; 
	int position = symptoms.size(); 
	
	@Override
	public Object previous() {
		Symptom symptom =symptoms[position];
		position = position - 1;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		return position > 0;
	}

	@Override
	public void goLast() {
		position = symptoms.size();
		
	}

}
