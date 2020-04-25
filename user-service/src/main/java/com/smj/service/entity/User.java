package com.smj.service.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author smj
 * @since 2020-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("createTime")
    private Date createTime;
    @TableField("imgName")
    private String imgName;

    @TableField("provinceId")
    private Integer provinceId;

    @TableField("cityId")
    private Integer cityId;

}
