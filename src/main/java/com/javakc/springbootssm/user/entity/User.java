package com.javakc.springbootssm.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ApiModel(value = "用户对象")
public class User {
    @ApiModelProperty(name = "id",value = "主键",example = "1",dataType = "integer")
    private int id;

    @ApiModelProperty(name = "name",value = "姓名",example = "张三",dataType = "string")
    private String name;

    @ApiModelProperty(name = "age",value = "年龄",example = "21",dataType = "integer")
    private int age;

    @ApiModelProperty(name = "birthday",value = "出生日期",example = "1999-10-21",dataType = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @ApiModelProperty(name = "address",value = "家庭住址",example = "北京市",dataType = "string")
    private String address;

}
