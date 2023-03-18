package cn.meshed.cloud.rd.deployment.command;

import cn.meshed.cloud.rd.deployment.enums.EnvironmentEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <h1>版本操作数据</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */

@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "版本操作数据")
public class VersionCmd extends Command {

    private static final long serialVersionUID = 1L;

    /**
     * 仓库所属项目key
     */
    @Schema(description = "仓库所属项目key")
    @NotBlank(message = "项目唯一标识不能为空")
    private String projectKey;

    /**
     * 版本ID
     */
    @Schema(description = "版本ID")
    private Long versionId;

    /**
     * 环境
     */
    @Schema(description = "环境")
    @NotNull(message = "环境不能为空")
    private EnvironmentEnum environment;

    /**
     * 逻辑仓库编码（新增时必须）
     */
    @Schema(description = "逻辑仓库编码（新增时必须）")
    private String warehouseId;


    /**
     * 仓库版本号
     */
    @Schema(description = "仓库版本号")
    private Long version;

    /**
     * 提交信息
     */
    @Schema(description = "提交信息")
    @NotBlank(message = "提交信息不能为空")
    private String commitMessage;

}
