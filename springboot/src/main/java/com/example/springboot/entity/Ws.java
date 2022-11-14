package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value = "Ws对象", description = "")
public class Ws implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("设备名称")
    private String name;

    @ApiModelProperty("现场照片")
    private String img;

    @ApiModelProperty("故障时间")
    private String time;

    @ApiModelProperty("报修时间")
    private String atime;

    @ApiModelProperty("维修类型")
    private String type;

    @ApiModelProperty("申请人")
    private String name2;

    @ApiModelProperty("联系方式")
    private String tel;


}
