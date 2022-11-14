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
 * @since 2022-11-13
 */
@Getter
@Setter
@TableName("sys_dcgoods")
@ApiModel(value = "Dcgoods对象", description = "")
public class Dcgoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("危化品编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("物品名称")
    private String name;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("危险等级")
    private String level;

    @ApiModelProperty("学院")
    private String faculty;

    @ApiModelProperty("保管人")
    private String person;


}
