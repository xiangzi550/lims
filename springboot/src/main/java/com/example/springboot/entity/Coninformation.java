package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2022-11-14
 */
@Getter
@Setter
@TableName("sys_coninformation")
@ApiModel(value = "Coninformation对象", description = "")
public class Coninformation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("易耗品编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("易耗品名称")
    private String name;

    @ApiModelProperty("易耗品分类")
    private String category;

    @ApiModelProperty("保存条件")
    private String savecon;

    @ApiModelProperty("保存方式")
    private String remark;


}
