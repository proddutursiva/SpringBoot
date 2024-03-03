package com.siva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.siva.dao.ReportDao;

@Service
public class ReportGenerateService {
    @Autowired
	private ReportDao reportDao;
	
//	@Autowired
//	public void setReportDao(ReportDao reportDao) {
//		System.out.println("setter method");
//		this.reportDao = reportDao;
//	}
	
//	@Autowired
//	public ReportGenerateService(ReportDao reportDao) {
//		System.out.println("ReportGenerateService::: parameter - constructor");
//		reportDao.getReportData();
//		
//	}
	public void ReportGenerator() {
		reportDao.getReportData();
	}

}
