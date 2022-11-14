package com.example.springboot.entity;

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
@TableName("sys_purchase")
@ApiModel(value = "Purchase对象", description = "")
public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("采购记录编号")
    private String id;

    @ApiModelProperty("采购人员姓名")
    private String name;

    @ApiModelProperty("采购地点")
    private String location;

    @ApiModelProperty("采购内容")
    private String contain;

    @ApiModelProperty("采购花费")
    private BigDecimal cost;


}
