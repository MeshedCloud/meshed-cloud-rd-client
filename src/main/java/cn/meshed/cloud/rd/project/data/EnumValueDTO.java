package cn.meshed.cloud.rd.project.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <h1>枚举值</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EnumValueDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模型ID
     */
    private String mId;

    /**
     * 枚举名称
     */
    private String name;

    /**
     * 枚举值
     */
    private Integer value;

    /**
     * 枚举扩展数据
     */
    private String ext;


}
