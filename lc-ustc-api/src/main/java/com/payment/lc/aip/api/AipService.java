package com.payment.lc.aip.api;

import javax.jws.WebService;

import com.payment.lc.aip.bean.AipPlanBean;


@WebService
public interface AipService {

	AipPlanBean create(AipPlanBean bean);

	AipPlanBean modify(AipPlanBean bean);

	boolean delete(long id, String memberId);

}
