package com.shulie.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_udict")
public class Udict {
    private Long dictId;
    private String dictName;
    private String dictStatus;
}
