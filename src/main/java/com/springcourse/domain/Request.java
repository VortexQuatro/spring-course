package com.springcourse.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.springcourse.domain.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {
	private Long id;
	private String subject;
	private String desscription;
	private Date criationDate;
	private RequestState state;
	private User user;
	private List<RequestStage> stages = new ArrayList<RequestStage>();
}
