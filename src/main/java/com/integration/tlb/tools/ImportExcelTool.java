package com.integration.tlb.tools;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jxl.Sheet;
import jxl.Workbook;

public class ImportExcelTool {

	public static Map<Integer, List<Object>> getAllByExcel(String file) {
		Map<Integer, List<Object>> list = new HashMap<Integer, List<Object>>();
		try {
			Workbook rwb = Workbook.getWorkbook(new File(file));
			Sheet rs = rwb.getSheet(0);// 或者rwb.getSheet(0)
			int clos = rs.getColumns();// 得到所有的列
			int rows = rs.getRows();// 得到所有的行
			List<Object> str=null;
			//获取列名
			for(int i=0;i<rows;i++) {
				str = new ArrayList<Object>();
				if(i>0) {
					break;
				}
				for(int j=0;j<clos;j++) {
					str.add(rs.getCell(j, i).getContents());
				}
				list.put(i, str);
			}
			//获取值
			for (int i = 1; i < rows; i++) {
				str = new ArrayList<Object>();
				for (int j = 0; j < clos; j++) {
					// 第一个是列数，第二个是行数
					str.add(rs.getCell(j, i).getContents());
					
				}
				list.put(i, str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	
	
	
	public static void main(String[] args) {
		Map<Integer, List<Object>> listExcel = getAllByExcel("C://personnel.xls");
		for (Integer key : listExcel.keySet()) {
			System.out.println("KEY:"+key);
			System.out.println("value:" + listExcel.get(key));
			// 接着进行取list值
			List<Object> lisMap = new ArrayList<Object>();
			lisMap = listExcel.get(key);
			for (int i = 0; i < lisMap.size(); i++) {
				System.out.println("----" + lisMap.get(i));
			}
		}
		
	}
}
