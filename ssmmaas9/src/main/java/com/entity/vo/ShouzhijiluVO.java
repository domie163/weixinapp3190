package com.entity.vo;

import com.entity.ShouzhijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 收支记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
public class ShouzhijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 商户名称
	 */
	
	private String shanghumingcheng;
		
	/**
	 * 商品详情
	 */
	
	private String shangpinxiangqing;
		
	/**
	 * 当前状态
	 */
	
	private String dangqianzhuangtai;
		
	/**
	 * 交易金额
	 */
	
	private Integer jiaoyijine;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 收支方式
	 */
	
	private String shouzhifangshi;
		
	/**
	 * 交易单号
	 */
	
	private String jiaoyidanhao;
		
	/**
	 * 商户单号
	 */
	
	private String shanghudanhao;
		
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
	 * 设置：商户名称
	 */
	 
	public void setShanghumingcheng(String shanghumingcheng) {
		this.shanghumingcheng = shanghumingcheng;
	}
	
	/**
	 * 获取：商户名称
	 */
	public String getShanghumingcheng() {
		return shanghumingcheng;
	}
				
	
	/**
	 * 设置：商品详情
	 */
	 
	public void setShangpinxiangqing(String shangpinxiangqing) {
		this.shangpinxiangqing = shangpinxiangqing;
	}
	
	/**
	 * 获取：商品详情
	 */
	public String getShangpinxiangqing() {
		return shangpinxiangqing;
	}
				
	
	/**
	 * 设置：当前状态
	 */
	 
	public void setDangqianzhuangtai(String dangqianzhuangtai) {
		this.dangqianzhuangtai = dangqianzhuangtai;
	}
	
	/**
	 * 获取：当前状态
	 */
	public String getDangqianzhuangtai() {
		return dangqianzhuangtai;
	}
				
	
	/**
	 * 设置：交易金额
	 */
	 
	public void setJiaoyijine(Integer jiaoyijine) {
		this.jiaoyijine = jiaoyijine;
	}
	
	/**
	 * 获取：交易金额
	 */
	public Integer getJiaoyijine() {
		return jiaoyijine;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：收支方式
	 */
	 
	public void setShouzhifangshi(String shouzhifangshi) {
		this.shouzhifangshi = shouzhifangshi;
	}
	
	/**
	 * 获取：收支方式
	 */
	public String getShouzhifangshi() {
		return shouzhifangshi;
	}
				
	
	/**
	 * 设置：交易单号
	 */
	 
	public void setJiaoyidanhao(String jiaoyidanhao) {
		this.jiaoyidanhao = jiaoyidanhao;
	}
	
	/**
	 * 获取：交易单号
	 */
	public String getJiaoyidanhao() {
		return jiaoyidanhao;
	}
				
	
	/**
	 * 设置：商户单号
	 */
	 
	public void setShanghudanhao(String shanghudanhao) {
		this.shanghudanhao = shanghudanhao;
	}
	
	/**
	 * 获取：商户单号
	 */
	public String getShanghudanhao() {
		return shanghudanhao;
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
