package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			p.addSymptom(new Symptom("s1", 10, 9), 1);
			p.addSymptom(new Symptom("s2", 10, 5), 2);
			p.addSymptom(new Symptom("s3", 10, 7), 3);
			p.addSymptom(new Symptom("s4", 10, 6), 4);
			p.addSymptom(new Symptom("s5", 10, 1), 5);
			
			Iterator i=p.iterator();
			while(i.hasNext())
				System.out.println(i.next());

			Covid19PacientInvertedIteratorAdapter it = new Covid19PacientInvertedIteratorAdapter(p.getSymptoms());
			ComparatorSeverityIndex comparatorSeverityIndex = new ComparatorSeverityIndex();
			Iterator SeverityIndex=Sorting.sortedIterator(it, comparatorSeverityIndex);
			it.goLast();
			System.out.println("SeverityIndex ordenazioa:");
			while(SeverityIndex.hasNext())
				System.out.println(SeverityIndex.next());
			
			ComparatorSymptomName comparatorSymptomName = new ComparatorSymptomName();
			Iterator SymptomName=Sorting.sortedIterator(it, comparatorSymptomName);
			it.goLast();
			System.out.println("SymptomName ordenazioa:");
			while(SymptomName.hasNext())
				System.out.println(SymptomName.next());
		}

	}

