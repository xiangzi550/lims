package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("sys_dcpurchase")
@ApiModel(value = "Dcpurchase对象", description = "")
public class Dcpurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("采购编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("采购人")
    private String name;

    @ApiModelProperty("电话")
    private String tel;

    @ApiModelProperty("采购内容")
    private String content;

    @ApiModelProperty("金额")
    private BigDecimal cost;


}
