package com.zxw.dreamer.base.service.impl;

import com.zxw.dreamer.base.entity.BaseLogErrorEntity;
import com.zxw.dreamer.base.mapper.BaseLogErrorMapper;
import com.zxw.dreamer.base.service.IBaseLogErrorService;
import com.zxw.dreamer.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统错误日志表 服务实现类
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Service
public class BaseLogErrorServiceImpl extends BaseServiceImpl<BaseLogErrorMapper, BaseLogErrorEntity> implements IBaseLogErrorService {

}
