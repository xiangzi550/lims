package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("sys_faculty")
@ApiModel(value = "Faculty对象", description = "")
public class Faculty implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("学院编号")
    private String id;

    @ApiModelProperty("学院名")
    private String name;

    @ApiModelProperty("楼号")
    private Integer building;

    @ApiModelProperty("负责人")
    private String responsibler;

    @ApiModelProperty("电话")
    private String tel;

    @ApiModelProperty("实验室数量")
    private Integer num;

    @ApiModelProperty("添加时间")
    private LocalDateTime createTime;


}
