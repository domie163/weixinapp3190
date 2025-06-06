package com.entity.view;

import com.entity.JiatingniandushouzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家庭年度收支
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 13:44:29
 */
@TableName("jiatingniandushouzhi")
public class JiatingniandushouzhiView  extends JiatingniandushouzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiatingniandushouzhiView(){
	}
 
 	public JiatingniandushouzhiView(JiatingniandushouzhiEntity jiatingniandushouzhiEntity){
 	try {
			BeanUtils.copyProperties(this, jiatingniandushouzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
