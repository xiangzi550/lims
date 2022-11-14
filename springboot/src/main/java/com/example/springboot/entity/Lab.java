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
@TableName("sys_lab")
@ApiModel(value = "Lab对象", description = "")
public class Lab implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("实验室编号")
    private String id;

    @ApiModelProperty("实验室名称")
    private String name;

    @ApiModelProperty("所属学院")
    private String faculty;

    @ApiModelProperty("地址")
    private String address;

    @ApiModelProperty("容纳人数")
    private Integer capacity;

    @ApiModelProperty("实验室照片")
    private String picture;

    @ApiModelProperty("实验室类型")
    private String type;

    @ApiModelProperty("负责人")
    private String responsibler;

    @ApiModelProperty("联系方式")
    private String tel;

    @ApiModelProperty("详情")
    private String detail;

    @ApiModelProperty("添加时间")
    private LocalDateTime createTime;


}
