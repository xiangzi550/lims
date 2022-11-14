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
@TableName("sys_constorage")
@ApiModel(value = "Constorage对象", description = "")
public class Constorage implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("易耗品编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("	易耗品名称")
    private String name;

    @ApiModelProperty("库存量")
    private String quantity;

    @ApiModelProperty("保存地点")
    private String location;


}
