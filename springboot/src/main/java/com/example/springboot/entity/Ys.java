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
@ApiModel(value = "Ys对象", description = "")
public class Ys implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("设备名称")
    private String name;

    @ApiModelProperty("验收人")
    private String pname;

    @ApiModelProperty("验收结果")
    private String result;

    @ApiModelProperty("联系方式")
    private String tel;

    @ApiModelProperty("验收日期")
    private String time;


}
