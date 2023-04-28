package cn.meshed.cloud.rd.deployment.data;

import cn.meshed.cloud.rd.deployment.enums.PackagesTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <h1>制品</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "制品数据模型")
public class PackagesDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 制品名称（中文）
     */
    @Schema(description = "制品名称（中文）")
    private String name;

    /**
     * 分组ID
     */
    @Schema(description = "分组ID")
    private String groupId;

    /**
     * 制品ID
     */
    @Schema(description = "制品ID")
    private String artifactId;

    /**
     * 版本号
     */
    @Schema(description = "版本号")
    private String version;

    /**
     * 制品类型
     */
    @Schema(description = "制品类型")
    private PackagesTypeEnum type;


}
