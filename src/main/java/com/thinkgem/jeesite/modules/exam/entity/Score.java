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
 * 类名称： Score   
 * 类描述： 评分 Entity   
 * 创建人： 李桥文 525219246@qq.com   
 * 创建时间：Feb 4, 2014 6:22:41 PM  
 * ------------------------------------------------------ 
 * 修改人：   
 * 修改时间：Feb 4, 2014 6:22:41 PM   
 * 修改备注：   
 * @version    
 * ##########################################################################################
 */
@Entity
@Table(name = "exam_score")
@DynamicInsert @DynamicUpdate
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Score extends DataEntity{
	
	private static final long serialVersionUID = 1L;

	private Long id;		// 编号

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_exam_score")
//	@SequenceGenerator(name = "seq_exam_score", sequenceName = "seq_exam_score")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
