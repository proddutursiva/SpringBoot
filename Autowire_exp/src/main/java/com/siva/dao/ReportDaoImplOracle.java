package com.siva.dao;

import org.springframework.stereotype.Repository;

@Repository("oracleDB")
public class ReportDaoImplOracle implements ReportDao {

	public ReportDaoImplOracle() {
		System.out.println("ReportDaoImplOracle:::: constructor");
	}

	@Override
	public String getReportData() {
		System.out.println("data fetched ReportDaoImplOracle");
		return "getReportData returned data";
	}

}
