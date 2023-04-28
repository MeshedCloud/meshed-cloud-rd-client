package cn.meshed.cloud.rd.deployment.command;

import cn.meshed.cloud.rd.deployment.enums.PackagesTypeEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
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
@Schema(description = "制品操作模型")
public class PackagesCmd implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 制品名称（中文）
     */
    @Schema(description = "制品名称（中文）")
    @NotBlank(message = "制品名称（中文）不能为空")
    private String name;

    /**
     * 分组ID
     */
    @Schema(description = "分组ID")
    @NotBlank(message = "分组ID不能为空")
    private String groupId;

    /**
     * 制品ID
     */
    @Schema(description = "制品ID")
    @NotBlank(message = "制品ID不能为空")
    private String artifactId;

    /**
     * 版本号
     */
    @Schema(description = "版本号")
    @NotBlank(message = "版本号不能为空")
    private String version;

}
