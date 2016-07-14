package com.project.config;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.render.ViewType;
import com.project.controller.CommonController;
import com.project.controller.MobileController;
import com.project.model.Mobile;

public class Config extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		loadPropertyFile("a_little_config.txt");	
	    me.setDevMode(getPropertyToBoolean("devMode", true));
	    me.setViewType(ViewType.FREE_MARKER);
	}

	@Override
	public void configHandler(Handlers me) {
		
		 me.add(new ContextPathHandler("contextPath"));
	}

	@Override
	public void configInterceptor(Interceptors me) {
		me.add(new SessionInViewInterceptor());
	}

	@Override
	public void configPlugin(Plugins me) {
		
		String decPassWord =getProperty("password");
		String decUser =getProperty("user");
		
		DruidPlugin druid = new DruidPlugin(getProperty("jdbcUrl"),decUser, decPassWord);
	    me.add(druid);  
	    ActiveRecordPlugin arp = new ActiveRecordPlugin(druid);
	    me.add(arp); 
	    arp.addMapping("t_mobile",Mobile.class);
	}

	@Override
	public void configRoute(Routes me) {
	
		me.add("/",CommonController.class);
		me.add("/mobile",MobileController.class);
	}

}
