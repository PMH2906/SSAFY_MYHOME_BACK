package com.ssafy.myhome.model.dto;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dongcode {

	private String dongCode;
	private String sidoName;
	private String gugunName;
	private String dongName;

}
