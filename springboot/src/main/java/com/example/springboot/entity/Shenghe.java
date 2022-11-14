package com.example.springboot.entity;

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
 * @since 2022-11-13
 */
@Getter
@Setter
@TableName("sys_shenghe")
@ApiModel(value = "Shenghe对象", description = "")
public class Shenghe implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    private Integer id;

    @ApiModelProperty("专家名")
    private String name;

    @ApiModelProperty("项目名称")
    private String xname;

    @ApiModelProperty("项目得分")
    private Integer score;

    @ApiModelProperty("审核意见")
    private String opinion;

    @ApiModelProperty("审核结论")
    private Integer conclusion;


}
