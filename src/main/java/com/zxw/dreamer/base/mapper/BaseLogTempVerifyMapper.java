package com.zxw.dreamer.base.mapper;

import com.zxw.dreamer.base.entity.BaseLogTempVerifyEntity;
import com.zxw.dreamer.common.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 系统短信/邮件验证码生成日志临时表 Mapper 接口
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Mapper
public interface BaseLogTempVerifyMapper extends BaseMapper<BaseLogTempVerifyEntity> {

}
