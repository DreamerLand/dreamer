package com.zxw.dreamer.base.service.impl;

import com.zxw.dreamer.base.entity.BaseUserEntity;
import com.zxw.dreamer.base.mapper.BaseUserMapper;
import com.zxw.dreamer.base.service.IBaseUserService;
import com.zxw.dreamer.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基础表 服务实现类
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Service
public class BaseUserServiceImpl extends BaseServiceImpl<BaseUserMapper, BaseUserEntity> implements IBaseUserService {

}
