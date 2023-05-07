package cn.meshed.cloud.rd.log.data;

import cn.meshed.cloud.rd.log.enums.TrendLogLevelEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <h1>项目动态</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Setter
@Getter
@EqualsAndHashCode(callSuper = false)
public class TrendDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 项目动态所属项目
     */
    private String projectKey;

    /**
     * 项目动态等级
     */
    private TrendLogLevelEnum level;

    /**
     * 项目动态信息
     */
    private String message;

    /**
     * 创建时间
     */
    private Date time;
}
