package com.zxw.dreamer.base.service.impl;

import com.zxw.dreamer.base.entity.BaseLogTempVerifyEntity;
import com.zxw.dreamer.base.mapper.BaseLogTempVerifyMapper;
import com.zxw.dreamer.base.service.IBaseLogTempVerifyService;
import com.zxw.dreamer.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统短信/邮件验证码生成日志临时表 服务实现类
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Service
public class BaseLogTempVerifyServiceImpl extends BaseServiceImpl<BaseLogTempVerifyMapper, BaseLogTempVerifyEntity> implements IBaseLogTempVerifyService {

}
