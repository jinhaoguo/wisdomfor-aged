package com.cgr.lesson.vo.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @ Author     ：cgr
 * @ Date       ：Created in 19:19 2020-05-29
 * @ Description：
 * @ Modified By：
 */
@Data
public class PeopleInfoPageReqVO {
    @ApiModelProperty(value = "第几页")
    private int pageNum = 1;

    @ApiModelProperty(value = "分页数量")
    private int pageSize = 10;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "登记开始时间")
    private String startTime;

    @ApiModelProperty(value = "登记结束时间")
    private String endTime;
}
