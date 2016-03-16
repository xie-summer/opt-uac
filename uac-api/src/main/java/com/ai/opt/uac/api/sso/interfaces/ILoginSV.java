package com.ai.opt.uac.api.sso.interfaces;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.opt.uac.api.sso.param.userLoginRequest;
import com.ai.opt.uac.api.sso.param.userLoginResponse;

/**
 * 登录服务<br>
 * Date: 2016年3月16日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhanglh
 */
public interface ILoginSV {
    /**
     * bass用户登录
     * 
     * @param request
     * @return 登陆账号信息
     * @throws BusinessException
     * @throws SystemException
     * @author zhanglh
     * @ApiCode UAC_0002
     * 
     */
    userLoginResponse findAccountByUserName(userLoginRequest request)
            throws BusinessException, SystemException;

    /**
     * 登录验证
     * 
     * @param request
     * @return
     * @throws BusinessException
     * @throws SystemException
     * @author zhanglh
     * @ApiCode UAC_0003
     */
    BaseResponse checkLoginByUserName(userLoginRequest request)
            throws BusinessException, SystemException;

}
