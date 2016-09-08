package com.payment.lc.aip.api;

import java.util.List;

import javax.jws.WebService;

import com.payment.lc.aip.bean.AipPlanBean;

@WebService
public interface AipQueryService {

	List<AipPlanBean> query(String memberId);
}
