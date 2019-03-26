package com.integration.tlb.controller.excel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.integration.tlb.service.tools.ImportExcelToolService;
import com.integration.tlb.tools.ImportExcelTool;

@Controller
@RequestMapping("/importExcel")
public class ImportExcelController {
	
	@Autowired
	private ImportExcelToolService importExcelToolService;
	
	@RequestMapping("/importExcel.do")
	@ResponseBody
	public String importExcel() {
		
		Map<Integer, List<Object>> listExcel = ImportExcelTool.getAllByExcel("C://personnel.xls");
		List<Object> lisMap = new ArrayList<Object>();
		for (int i = 1; i < listExcel.keySet().size(); i++) {
			lisMap = listExcel.get(i);
			importExcelToolService.insert(listExcel.get(0),lisMap);
		}
		return "200";
		
	}
	
}
