package com.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.core.Controller;
import com.project.model.Mobile;

public class MobileController extends Controller {

	
	public void index(){
		renderFreeMarker("index.html");
	}
	public void doAddMobile(){
		Mobile mobile = getModel(Mobile.class);
		mobile.save();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("result","提交成功");
		renderJson(map);
	}
	
	public void queryMobile(){
		
		List<Mobile> mobiles = Mobile.dao.find("select * from t_mobile ");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mobiles",mobiles);
		renderJson(map);
	}
	
	
	public void queryMobileById(){
		
		int id = getParaToInt("id");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mobile",Mobile.dao.findById(id));
		renderJson(map);

	}
	
	public void deleteMobileById(){
		
		int id = getParaToInt("id");
		Map<String,Object> map = new HashMap<String,Object>();
		Mobile.dao.deleteById(id);
		map.put("results","删除成功!");
		renderJson(map);
	}
}
