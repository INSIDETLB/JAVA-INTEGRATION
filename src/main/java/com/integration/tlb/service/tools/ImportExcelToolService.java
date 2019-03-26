package com.integration.tlb.service.tools;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integration.tlb.mapper.manual.PersonnelMapperManual;

@Service
@Transactional
public class ImportExcelToolService {
	
	@Autowired
	private PersonnelMapperManual personnelMapperManual;
	
	public int insert(List<Object> key,List<Object> value) {
		return personnelMapperManual.insert(key,value);
	}
}
