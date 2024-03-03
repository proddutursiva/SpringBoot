package com.siva.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("sqlDB")
@Primary
public class ReportDaoImplmysql implements ReportDao {

	public ReportDaoImplmysql() {
		System.out.println("ReportDaoImplmysql:::: constructor");
	}

	@Override
	public String getReportData() {
		System.out.println("data fetched ReportDaoImplmysql");
		return "getReportData returned data";
	}

}
