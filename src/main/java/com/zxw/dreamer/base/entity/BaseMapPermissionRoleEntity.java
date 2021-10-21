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
 * 系统对照表-权限-角色
 * </p>
 *
 * @author zxw
 * @since 2021-10-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("base_map_permission_role")
@ApiModel(value = "系统对照表-权限-角色")
public class BaseMapPermissionRoleEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键 权限id")
    @TableId(value = "permission_id", type = IdType.ASSIGN_ID)
    private Long permissionId;
    @ApiModelProperty("主键 角色id")
    @TableId(value = "role_id", type = IdType.ASSIGN_ID)
    private Long roleId;
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
