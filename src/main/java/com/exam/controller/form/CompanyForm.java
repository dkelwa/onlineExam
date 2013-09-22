package com.exam.controller.form;

import java.util.List;

import com.exam.model.Company;

public class CompanyForm {

    private Company companyDto;
    private List<Company> rows;

    public Company getCompanyDto() {
	return companyDto;
    }

    public void setCompanyDto(Company companyDto) {
	this.companyDto = companyDto;
    }

    public List<Company> getRows() {
	return rows;
    }

    public void setRows(List<Company> listCompany) {
	this.rows = listCompany;
    }

}
