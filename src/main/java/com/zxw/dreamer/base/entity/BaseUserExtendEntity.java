package com.zxw.dreamer.base.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
 * 用户拓展表
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("base_user_extend")
@ApiModel(value = "用户拓展表")
public class BaseUserExtendEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    @ApiModelProperty("用户id")
    private Long userId;
    @ApiModelProperty("身份证号")
    private String idCard;
    @ApiModelProperty("微信号")
    private String vxId;
    @ApiModelProperty("QQ号")
    private String qqId;
    @ApiModelProperty("电子邮箱")
    private String email;
    @ApiModelProperty("电话")
    private String phone;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("经度")
    private Float locationLng;
    @ApiModelProperty("纬度")
    private Float locationLat;
    @ApiModelProperty("逻辑删除")
    @TableLogic
    private Boolean del;
    @ApiModelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime createDate;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateDate;
}
