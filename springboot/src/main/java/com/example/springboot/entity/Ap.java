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
@ApiModel(value = "Ap对象", description = "")
public class Ap implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号	")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("设备名称")
    private String name;

    @ApiModelProperty("维修地点")
    private String adress;

    @ApiModelProperty("预维修时间")
    private String time;

    @ApiModelProperty("维修员")
    private String pname;

    @ApiModelProperty("联系电话")
    private String tel;


}
