package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;

import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;

public class DeliverRevisionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private DeliverStatus status;
	private String feedback;
	private Integer correctCount;
	
	public DeliverRevisionDTO() {}
	
	public DeliverRevisionDTO(Deliver entity)
	{
		status = entity.getStatus();
		feedback = entity.getFeedback();
		correctCount = entity.getCorrectCount();
	}

	public DeliverStatus getStatus() {
		return status;
	}

	public String getFeedback() {
		return feedback;
	}

	public Integer getCorrectCount() {
		return correctCount;
	}
	
}
