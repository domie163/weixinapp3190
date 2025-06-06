package com.entity.model;

import com.entity.JiatingniandushouzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 家庭年度收支
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public class JiatingniandushouzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 总收入
	 */
	
	private String zongshouru;
		
	/**
	 * 总支出
	 */
	
	private String zongzhichu;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：总收入
	 */
	 
	public void setZongshouru(String zongshouru) {
		this.zongshouru = zongshouru;
	}
	
	/**
	 * 获取：总收入
	 */
	public String getZongshouru() {
		return zongshouru;
	}
				
	
	/**
	 * 设置：总支出
	 */
	 
	public void setZongzhichu(String zongzhichu) {
		this.zongzhichu = zongzhichu;
	}
	
	/**
	 * 获取：总支出
	 */
	public String getZongzhichu() {
		return zongzhichu;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
