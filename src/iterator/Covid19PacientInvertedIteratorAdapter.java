package iterator;

import java.util.ArrayList;
import java.util.List;

import adapter.InvertedIterator;
import domain.Symptom;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator{

	
	Object[] symptoms; 
	int position; 
	
	public Covid19PacientInvertedIteratorAdapter (Set<Symptom> s) {
		this.symptoms = s.toArray();
		this.goLast();
	}
	
	@Override
	public Object previous() {
		Symptom symptom =(Symptom) symptoms[position];
		position = position - 1;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		return position >= 0;
	}

	@Override
	public void goLast() {
		position = symptoms.length-1;
		
	}

}



