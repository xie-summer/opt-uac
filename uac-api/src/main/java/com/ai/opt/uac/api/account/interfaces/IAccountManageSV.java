package com.ai.opt.uac.api.account.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.uac.api.account.param.AccountBaseModifyRequest;
import com.ai.opt.uac.api.account.param.AccountQueryRequest;
import com.ai.opt.uac.api.account.param.AccountQueryResponse;
import com.ai.opt.uac.api.account.param.AccountTenantModifyRequest;

public interface IAccountManageSV {
	
	/**
	 * 查询账户信息
	 * @param accountQueryRequest
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author jiaxs
     * @ApiDocMethod
     * @ApiCode UAC_0003
	 */
	AccountQueryResponse queryBaseInfo(AccountQueryRequest accountQueryRequest) throws BusinessException,SystemException;
	
	/**
	 * 修改账户中心基础信息
	 * @param AccountBaseModifyRequest
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author jiaxs
     * @ApiDocMethod
     * @ApiCode UAC_0004
	 */
	BaseResponse updateBaseInfo(AccountBaseModifyRequest accountModifyRequest) throws BusinessException,SystemException;
	
	/**
	 * 修改账户租户信息
	 * @param AccountBaseModifyRequest
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author jiaxs
     * @ApiDocMethod
     * @ApiCode UAC_0005
	 */
	BaseResponse updateTenantData(AccountTenantModifyRequest accountModifyRequest) throws BusinessException,SystemException;
}