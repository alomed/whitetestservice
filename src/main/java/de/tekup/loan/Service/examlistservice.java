package de.tekup.loan.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import de.tekup.soap.models.whitetest.Exam;
import de.tekup.soap.models.whitetest.ExamRequest;
import de.tekup.soap.models.whitetest.ExamResponse;
import de.tekup.soap.models.whitetest.ObjectFactory;
@Service
public class examlistservice {

	ArrayList<Exam>examsavailbe = new ArrayList<Exam>();
	ArrayList<Exam>exams = new ArrayList<Exam>();
	
	
	public examlistservice() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ExamResponse examlist(ExamRequest examRequest) {
		
		Exam e1=new Exam("redhat-8","redhat version 8");
		Exam e2=new Exam("aws","aws cloud practionner");
		Exam e3=new Exam("oca","oracle java 8");
		Exam e4=new Exam("redhat-8","redhat version profesionel");
		Exam e5=new Exam("aws","aws cloud solution architect");
		Exam e6=new Exam("oca","java profesionel");
		examsavailbe.add(e1);
		examsavailbe.add(e2);
		examsavailbe.add(e3);
		examsavailbe.add(e4);
		examsavailbe.add(e5);
		examsavailbe.add(e6);
		
		ExamResponse reponseex = new ObjectFactory().createExamResponse();
		
		for(Exam ex:examsavailbe) {
		if(examRequest.getExamCode().equals(ex.getCode())) {
			exams.add(ex);
			
		}
		}
		reponseex.setExam(exams);
		
	
		
	return reponseex;	
		
		
		
		
	}
	
	
	

}
