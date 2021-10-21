package com.zxw.dreamer.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxw.dreamer.common.base.BaseEntity;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 系统登录日志表
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("base_log_login")
@ApiModel(value = "系统登录日志表")
public class BaseLogLoginEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    @ApiModelProperty("登录 0 退出 1")
    private Boolean type;
    @ApiModelProperty("成功 0 失败 1")
    private Boolean status;
    @ApiModelProperty("IP地址")
    private String ip;
    @ApiModelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime createDate;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateDate;
}
