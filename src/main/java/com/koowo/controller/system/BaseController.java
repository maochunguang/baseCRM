package com.koowo.controller.system;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.koowo.entity.system.Page;
import com.koowo.util.Logger;
import com.koowo.util.PageData;
import com.koowo.util.UuidUtil;

/**
 * @author maocg
 * @date 2016/10/27
 */
public class BaseController {
	
	protected Logger logger = Logger.getLogger(this.getClass());

	private static final long serialVersionUID = 6357869213649815390L;


    public PageData getPageData(){
		return new PageData(this.getRequest());
	}


    public ModelAndView getModelAndView(){
		return new ModelAndView();
	}


    public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		
		return request;
	}


    public String get32UUID(){
		
		return UuidUtil.get32UUID();
	}


    public Page getPage(){
		
		return new Page();
	}
	
	public static void logBefore(Logger logger, String interfaceName){
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}
	
	public static void logAfter(Logger logger){
		logger.info("end");
		logger.info("");
	}
	
}
