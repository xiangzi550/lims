package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 *  值班实体类
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@Getter
@Setter
@ToString
public class DutyInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String labno;
    private String dutyUsrNo;
    private String dutyDate;
    private String planTime;
    private String remark;

}
