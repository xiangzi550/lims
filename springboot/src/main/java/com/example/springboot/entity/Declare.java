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
@TableName("sys_declare")
@ApiModel(value = "Declare对象", description = "")
public class Declare implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("申请编号")
    private Integer id;

    @ApiModelProperty("项目名称")
    private String name;

    @ApiModelProperty("申报人")
    private String person;

    @ApiModelProperty("申报学院")
    private String faculty;

    @ApiModelProperty("提交时间")
    private LocalDateTime createTime;


}
