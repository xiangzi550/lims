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
@TableName("sys_buyer")
@ApiModel(value = "Buyer对象", description = "")
public class Buyer implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("采购人员编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("采购人员姓名")
    private String name;

    @ApiModelProperty("采购人员性别")
    private String sex;

    @ApiModelProperty("采购人员邮箱")
    private String email;

    @ApiModelProperty("采购人员电话")
    private String phone;


}
