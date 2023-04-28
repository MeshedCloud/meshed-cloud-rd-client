package cn.meshed.cloud.rd.project.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1></h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum ServiceModelTypeEnum {
    /**
     * 模型
     */
    MODEL(1, "MODEL"),
    /**
     * 服务
     */
    SERVICE(2, "SERVICE"),
    ;

    @EnumValue
    private final int value;
    private final String ext;
}
