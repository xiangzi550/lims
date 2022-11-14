package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 *  实验室使用实体类
 * </p>
 *
 * @author 马源
 * @since 2022-11-10
 */
@Getter
@Setter
@ToString
public class LabUseinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String labno;
    private String dutyUsrNo;
    private String useDate;
    private String useUsrNo;
    private String remark;

}
