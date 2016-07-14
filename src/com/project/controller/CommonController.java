package com.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.core.Controller;
import com.project.model.Mobile;

public class CommonController extends Controller{

	public void index(){
		
		renderFreeMarker("index.html");
	}
	
	public void apiTest(){
		
		String id = getPara("id");
		String pid = getPara("pid");
		System.out.println(id);
		System.out.println(pid);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name","我是后台来的数据");
		renderJson(map);
	}
	
	public void add(){
		
		String temp  = getPara("realname");
		String temp1 = getPara("name");
		System.out.println(temp);
		System.out.println(temp1);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name","提交成功");
		renderJson(map);
	}
	
	
	public void angularTest(){
		
		String mobile = getPara("id");
		List<Mobile> mobiles = Mobile.dao.find("select * from t_mobile where mobile = ?",mobile);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mobiles",mobiles);
		renderJson(map);
	}
	
	
	public void angularPostTest(){
		
		Mobile mobile = getModel(Mobile.class);
		mobile.set("position","CFO");
		mobile.save();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("result","提交成功");
		renderJson(map);
	}
}
