package com.lzj.admin.query;

import lombok.Data;

@Data
public class DamageListQuery extends BaseQuery{
    private String startDate;
    private String endDate;
}
