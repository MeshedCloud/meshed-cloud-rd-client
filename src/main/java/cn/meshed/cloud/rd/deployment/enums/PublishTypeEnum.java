package cn.meshed.cloud.rd.deployment.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * <h1>发布类型</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@AllArgsConstructor
@Getter
@ToString
public enum PublishTypeEnum {

    /**
     * 客户端 (主维度)
     */
    CLIENT(1,"客户端"),

    /**
     * 服务 (子维度)
     */
    SERVICE(2,"服务"),
    ;

    @EnumValue
    private final int value;
    private final String ext;

}
