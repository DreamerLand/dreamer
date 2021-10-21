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
 * 系统对照表-人员-部门
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("base_map_user_department")
@ApiModel(value = "系统对照表-人员-部门")
public class BaseMapUserDepartmentEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键 用户id")
    @TableId(value = "user_id", type = IdType.ASSIGN_ID)
    private Long userId;
    @ApiModelProperty("主键 部门id")
    @TableId(value = "department_id", type = IdType.ASSIGN_ID)
    private Long departmentId;
    @ApiModelProperty("创建时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime createDate;
    @ApiModelProperty("更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
      private LocalDateTime updateDate;
}
