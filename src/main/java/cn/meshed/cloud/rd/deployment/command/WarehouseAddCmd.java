package cn.meshed.cloud.rd.deployment.command;

import cn.meshed.cloud.rd.deployment.enums.WarehouseOperateEnum;
import cn.meshed.cloud.rd.deployment.enums.WarehousePurposeTypeEnum;
import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>逻辑仓库新增</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "逻辑仓库新增")
public class WarehouseAddCmd extends Command {

    /**
     * 项目标识
     */
    @Schema(description = "项目标识")
    @NotBlank(message = "项目唯一标识不能为空")
    private String projectKey;

    /**
     * 中文名称
     */
    @Schema(description = "中文名称")
    @NotBlank(message = "中文名称不能为空")
    private String name;

    /**
     * 仓库名称
     */
    @Schema(description = "仓库名称")
    @NotBlank(message = "仓库名称不能为空")
    private String repoName;

    /**
     * 仓库地址
     */
    @Schema(description = "仓库地址")
    @NotBlank(message = "仓库地址不能为空")
    private String repoUrl;

    /**
     * 源仓库的授权码
     */
    @Schema(description = "源仓库的授权码(私有需要传递)")
    private String accessToken;
    /**
     * 仓库目的类型（管理仓库）: 服务/客户端/组件/前端
     */
    @Schema(description = "仓库目的类型")
    @NotBlank(message = "仓库目的类型不能为空")
    private WarehousePurposeTypeEnum purposeType;

    /**
     * 仓库描述
     */
    @Schema(description = "仓库描述")
    @NotBlank(message = "仓库描述不能为空")
    private String description;

    /**
     * 引擎模板 具体的模板
     */
    @Schema(description = "引擎模板")
    private String engineTemplate;

    /**
     * 操作类型
     */
    @Schema(description = "操作类型")
    private WarehouseOperateEnum operate;

}
