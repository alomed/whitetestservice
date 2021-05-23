package de.tekup.loan.endpoint;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.tekup.loan.Service.WhiteTestService;
import de.tekup.loan.Service.examlistservice;
import de.tekup.soap.models.whitetest.ExamRequest;
import de.tekup.soap.models.whitetest.ExamResponse;
import de.tekup.soap.models.whitetest.StudentRequest;
import de.tekup.soap.models.whitetest.WhiteTestResponse;

@Endpoint
public class examendpoint {

public static final String nameSpace = "http://www.tekup.de/soap/models/whitetest";
	@Autowired
	private examlistservice service;

	@PayloadRoot(namespace = nameSpace, localPart = "ExamRequest")
	@ResponsePayload
	public ExamResponse getExamDetails(@RequestPayload ExamRequest examRequest) 
	{
		return service.examlist(examRequest);
	}

}
