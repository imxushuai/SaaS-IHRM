package com.ihrm.company.repository;

import com.ihrm.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
* 企业数据访问接口
*/
public interface CompanyDao extends JpaRepository<Company, String>, JpaSpecificationExecutor<Company> {
}