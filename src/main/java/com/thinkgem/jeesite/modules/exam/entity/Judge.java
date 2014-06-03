package com.thinkgem.jeesite.modules.exam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.thinkgem.jeesite.common.persistence.DataEntity;


/**
 * ##########################################################################################   
 * 项目名称：MyExam   
 * 类名称： Judge   
 * 类描述： 判断题 Entity
 * 创建人： 李桥文 525219246@qq.com   
 * 创建时间：Feb 4, 2014 6:20:48 PM  
 * ------------------------------------------------------ 
 * 修改人：   
 * 修改时间：Feb 4, 2014 6:20:48 PM   
 * 修改备注：   
 * @version    
 * ##########################################################################################
 */
@Entity
@Table(name = "exam_judge")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Judge extends DataEntity{
	
	private static final long serialVersionUID = 1L;

	private Long id;		// 编号
	
	private String name;    //名称
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_exam_judge")
//	@SequenceGenerator(name = "seq_exam_judge", sequenceName = "seq_exam_judge")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
